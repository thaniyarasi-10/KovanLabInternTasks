package com.kovanlabs.logginginterceptor.model;

public class LoggingModel {

    private String url;
    private String method;
    private int status;
    private long executionTime;

    public LoggingModel(String url, String method, int status, long executionTime) {
        this.url = url;
        this.method = method;
        this.status = status;
        this.executionTime = executionTime;
    }

    public String toString() {
        return method + " " + url + " " + status + " " + executionTime + "ms";
    }
}