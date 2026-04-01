package com.kovanlabs.logginginterceptor.interceptor;

import com.kovanlabs.logginginterceptor.model.LoggingModel;
import com.kovanlabs.logginginterceptor.service.LoggingService;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long  startTime = (long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        String  url = request.getRequestURI();
        String method= request.getMethod();
        int status =response.getStatus();

        LoggingModel loggingModel= new LoggingModel(url,method,status,time);

        LoggingService loggingService= new LoggingService();
        loggingService.logFile(loggingModel);

    }
}
