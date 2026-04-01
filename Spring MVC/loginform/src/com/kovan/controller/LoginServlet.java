package com.kovan.controller;

import com.kovan.model.User;
import com.kovan.service.AuthService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The Controller: Handles HTTP requests, talks to the Service/Model,
 * and decides which View to show next.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // The service taking care of core business logic
    private AuthService authService;

    @Override
    public void init() throws ServletException {
        // Instantiate the service in initialization
        authService = new AuthService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Gather input parameters from View
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // 2. Business Logic Execution (Ask the Model/Service)
        User authenticatedUser = authService.authenticate(user, pass);

        // 3. Routing (Decide which View to show next)
        if (authenticatedUser != null) {
            // Success: Create session and store the Model object
            HttpSession session = request.getSession();
            session.setAttribute("user", authenticatedUser);

            // Redirect to welcome View
            response.sendRedirect("welcome.jsp");
        } else {
            // Failure: Bind error message and forward back to login View
            request.setAttribute("errorMessage", "Invalid username or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
