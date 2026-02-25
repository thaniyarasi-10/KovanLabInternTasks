package com.KovanLearnings.Java;

import java.util.*;
class SwitchTernaryConcepts {
    public static  void switchCase(Scanner sc) {
        //old
        int day = sc.nextInt();
        String DayTime;

        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;


            default:
                System.out.println("Not implemented");
        }

        //same condition for many cases
        switch(day){
            case 1:
                System.out.println("is leave");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("not leave");
                break;
            case 7:
                System.out.println("May or maynot leave");
        }

        //new
        int d= 5;
        String s= switch(d){
            case 1 -> "mon";
            case 2 -> "tue";
            case 5 -> "wed";
            default -> "wrong value";
        };
        System.out.println(s);
    }

    public static void ternary(){

        int a=10;
        int b=20;
        int c=30;

        int d= (a>b)?a:b;
        System.out.println(d);

        int e =(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(e);
    }
    public static void breakContinue(){

        //break
        for(int i=1;i<=5;i++){
            if(i%4==0){
                break; //terminate the loop
            }
            System.out.println(i);
        }

        //continue
        for(int i=1;i<=5;i++){
            if(i%4==0){
                continue; //skips the number
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switchCase(sc);
        //ternary();
        //breakContinue();
    }
}