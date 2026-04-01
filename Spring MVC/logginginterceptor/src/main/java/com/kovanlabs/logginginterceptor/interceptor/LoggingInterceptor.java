package com.kovanlabs.logginginterceptor.interceptor;

import com.kovanlabs.logginginterceptor.model.LoggingModel;
import com.kovanlabs.logginginterceptor.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    @Autowired
    private LoggingService loggingService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) {

        long startTime = (long) request.getAttribute("startTime");
        long time = System.currentTimeMillis() - startTime;

        String url = request.getRequestURI();
        String method = request.getMethod();
        int status = response.getStatus();

        LoggingModel log = new LoggingModel(url, method, status, time);
        loggingService.logFile(log);
    }
}