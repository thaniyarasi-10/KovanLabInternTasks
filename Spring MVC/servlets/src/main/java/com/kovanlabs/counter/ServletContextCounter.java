package com.kovanlabs.counter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/count")
public class CounterServlet extends HttpServlet {
    private int hitCount;

    @Override
    public void init() throws ServletException {
        getServletContext().setAttribute("hitCount",0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context= getServletContext();
        Integer count = (Integer)context.getAttribute("hitCount");
        if(count == null){
            count =1;
            context.setAttribute("hitCount", count);
        }
        else{
            count++;
            context.setAttribute("hitCount", count);
        }


        resp.getWriter().println("No. of times page visited: " + count);
    }
}
