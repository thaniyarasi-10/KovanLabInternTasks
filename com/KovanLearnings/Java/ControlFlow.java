package com.KovanLearnings.Java;

import java.util.Scanner;

class ControlFlow {
    public static void diamondPrinter(Scanner sc){

        int n= sc.nextInt();
        int mid= n/2;
        for (int i=0;i<=mid;i++){
            for (int j=0; j<mid-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=mid-1;i>=0;i--){
            for(int j=0;j<mid-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void sieveOfEratosthenes(Scanner sc){
        int  num= sc.nextInt();
        boolean[] prime= new boolean[num+1];
        for(int i=2;i<=num;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<=num;i++){
            if(prime[i]){
                for(int j=i*i;j<=num;j+=i){
                    prime[j]= false;
                }
            }
        }
        System.out.print(2);
        for(int i=3;i<=num;i++){
            if(prime[i]){
                System.out.print(" "+i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //diamondPrinter();
        sieveOfEratosthenes(sc);
    }
}