package com.KovanLearnings.OopArchitecturalThinking;

public class AppConfig {
    private static AppConfig instance;
    private static int count =0;
    private AppConfig(){
        //constructor
    }
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

//    public static int  getCount() {
//        if (count == 0) {
//            count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {


        AppConfig c1 = AppConfig.getInstance();
        AppConfig c2 = AppConfig.getInstance();
//        int c3 = AppConfig.getCount();
//        int c4 = AppConfig.getCount();
//        System.out.println(c3); //1
//        System.out.println(c4); //1 (if condition fails)
//        System.out.println(c3 == c4);// true
        System.out.println(c1 == c2); // true
    }

}



