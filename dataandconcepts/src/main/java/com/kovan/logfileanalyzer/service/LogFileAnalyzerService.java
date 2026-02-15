package com.kovan.logfileanalyzer.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
@Service
public class LogFileAnalyzerService {
    private static final String  fileName = "server.log";
    public void createLogFile (){

        int[] statusCode = {200, 404, 500};
        String [] urls = {"/profile", "/login", "/home", "/about", "/download"};
        Random random = new Random();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for(int i=0;i<10000;i++){

                String ip = random.nextInt(256)+"." +
                        random.nextInt(256)+"."+
                        random.nextInt(256)+"." +
                        random.nextInt(256);

                String timeStamp = LocalDateTime.now().toString();
                int status= statusCode[random.nextInt(statusCode.length)];
                String url = urls[random.nextInt(urls.length)];

                bufferedWriter.write(ip+" "+timeStamp+" "+status+" "+url);
                bufferedWriter.newLine();
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
    public Map<String, Object> analyzeLogFile() throws IOException {

        List<String> lines = Files.readAllLines(Path.of(fileName));

        Map<String, Long> requestsPerIp =
                lines.stream()
                        .map(line -> line.split(" ")[0])
                        .collect(Collectors.groupingBy(
                                ip -> ip,
                                Collectors.counting()
                        ));

        List<Map.Entry<String, Long>> top3Urls =
                lines.stream()
                        .map(line -> line.split(" ")[3])
                        .collect(Collectors.groupingBy(
                                url -> url,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Long>
                                comparingByValue(Comparator.reverseOrder()))
                        .limit(3)
                        .toList();

        long totalRequests = lines.size();

        long error404Count =
                lines.stream()
                        .filter(line -> line.split(" ")[2].equals("404"))
                        .count();

        double error404Percentage =
                (error404Count * 100.0) / totalRequests;

        // Collect everything into one response
        Map<String, Object> result = new HashMap<>();
        result.put("totalRequests", totalRequests);
        result.put("requestsPerIp", requestsPerIp);
        result.put("top3Urls", top3Urls);
        result.put("error404Percentage", error404Percentage);

        return result;
    }
}
