package com.KovanLearnings.Java;

import java.util.*;

class ArrayVarargsConcepts {
    public static void jaggedArray(Scanner sc) {
        int [][] arr= new int[3][];
        arr[0]= new int[2];
        arr[1] = new int[3];
        arr[2]= new int [1];

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void arrayCopy(){

        // when we need to copy from 2 array into another array
        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100};
        int[] res = new int[5];

        //System.arraycopy(source, sourcePos- starting from which index , destination, desPos- which index to paste , length- how many to copy)
        System.arraycopy(a1, 0, res, 0,3);
        System.arraycopy(a2, 3, res, 3,2);

        for(int i:res){
            System.out.print(i+" ");
        }

    }
    public static void arrayClone(){
        // 1 dim - deep clone (new obj and values copied and reference to that new obj)
        int[] orgArr1= {1,2,3};
        int []clonedArr1= orgArr1.clone();

        for(int i=0;i<orgArr1.length;i++){
            System.out.println(i);
        }
        System.out.println(orgArr1==clonedArr1); //false - ref not same
        System.out.println(orgArr1[0]==clonedArr1[0]); // true - compares values(for primitives)

        System.out.println(Arrays.equals(orgArr1, clonedArr1));//true - value same

        //2 dim - shallow clone (new obj created and ref point to the org array )

        int [][] orgArr2 = {{1, 2},{3, 4}};
        int [][] clonedArr2= orgArr2.clone();

        for(int i=0;i<orgArr2.length;i++){
            for(int j=0;j<orgArr2.length;j++){
                System.out.println(i);
            }
        }

        System.out.println(orgArr2==clonedArr2); //false
        System.out.println(orgArr2[0][0]==clonedArr2[0][0]); //true
        System.out.println(Arrays.equals(orgArr1, clonedArr1)); //true

    }
    public static void  varargs(String... n){
        String concate = "";
       for (String i:n){
           concate += i;
       }
       System.out.println(concate);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //jaggedArray(sc);
        //arrayCopy();
        //arrayClone();

        //no parameter
        varargs();
        //many parameter
        varargs("Thani", "is", "an", "intern");
        //1 prameter
        varargs("Thani");
    }
}