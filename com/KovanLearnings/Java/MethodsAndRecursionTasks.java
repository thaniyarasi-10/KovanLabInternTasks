package com.KovanLearnings.Java;
import java.util.*;

public class MethodsAndRecursionTasks {
    public static boolean palindromeCheck(String s, int left,int right){
        if(left<=right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return palindromeCheck(s, left+1, right-1);


    }
    public static boolean isPalindrome(String s){
        return palindromeCheck(s, 0, s.length()-1);
    }
    static int [] values;
    static int fibonacci(int n){
        if(n<=1) {
            return n;
        }
        if(values[n] != -1){
            return values[n];
        }
        values[n] = fibonacci(n-1)+fibonacci(n-2);
        return values[n];
    }


    public static void main(String [] args){

        //palindrome
        String word = "racecar";
        if(isPalindrome(word)){
            IO.println("Is palindrome");
        }
        else{
            IO.println("Not a palindrome");
        }

        //fibonacci memoization
        int n=5;
        values = new int[n+1];
        Arrays.fill(values,-1);
        System.out.println(fibonacci(n));
    }
}
