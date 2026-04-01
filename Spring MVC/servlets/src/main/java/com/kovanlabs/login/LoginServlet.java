package com.kovanlabs.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
    private Map<String, String> user = new HashMap<>();

    @Override
    public void init(ServletConfig config) throws ServletException {
        user.put("thani","123");
        user.put("intern", "456");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(user.containsKey(username) && user.get(username).equals(password)){
            HttpSession httpSession= req.getSession();
            httpSession.setAttribute("user",username);
            resp.sendRedirect("dashboard");

        } else {

            resp.getWriter().println("<h4> Invalid credentials </h4>");

        }
    }
}
