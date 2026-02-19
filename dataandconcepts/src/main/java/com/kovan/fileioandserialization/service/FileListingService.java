package com.kovan.fileioandserialization.service;


import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileListingService {
    public List<String> listOfAllFiles(String path){
        List<String> result = new ArrayList<>();
        File folder = new File(path); // path - mention the path of the file
        listRecursively(folder, result);
        return result;
    }

    public void listRecursively(File file, List<String> result){
        if(file.isFile()){
            result.add(file.getAbsolutePath()+" : " +file.length() );
        }
        else if(file.isDirectory()){
            File[] files = file.listFiles(); // to list all files/folder in the folder
            if(files != null){// to check if the folder is empty
                for(File f:files){
                    listRecursively(f,result); // calling the method recursively
                }
            }

        }

    }
}
