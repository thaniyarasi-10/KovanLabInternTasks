package com.kovanlabs.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false); //Returns existing session, does NOT create new one
        if(session != null && session.getAttribute("user") != null){

            String user = (String) session.getAttribute("user");

            resp.getWriter().println("<h1>Welcome to Dashboard </h1>" + user);

        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}
