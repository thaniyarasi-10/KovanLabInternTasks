package com.KovanLearnings.Java;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTasks {
    public static void textScrubber(){
        String text= "H3ll0 W0rld! Th1s is J4v4.";
        String numrep = text.replaceAll("\\d", "*");
        String replaced = numrep.replaceAll("[^a-zA-Z*]","");
        System.out.println(replaced);
    }
    public static void emailChecker(Scanner sc){
        String email= sc.nextLine();
        String regex= "^[a-zA-Z0-9_.%+-]+@[a-zA-Z0-9-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Email");
        }
        else{
            System.out.println("Not Email");
        }
    }

    public static void main(String [] args){
        textScrubber();
        Scanner sc = new Scanner(System.in);
        emailChecker(sc);
    }
}
