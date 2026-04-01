<%@ page import="com.kovan.model.User" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <% // Security check: Prevent access if the user is not logged in User loggedInUser=(User)
            session.getAttribute("user"); if(loggedInUser==null) { response.sendRedirect("login.jsp"); return; } %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Welcome Dashboard</title>
                <style>
                    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap');

                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                        font-family: 'Inter', sans-serif;
                    }

                    body {
                        background: #f1f5f9;
                        color: #334155;
                        min-height: 100vh;
                        display: flex;
                        flex-direction: column;
                        align-items: center;
                    }

                    .navbar {
                        width: 100%;
                        background: #ffffff;
                        padding: 1rem 2rem;
                        box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.1);
                        display: flex;
                        justify-content: space-between;
                        align-items: center;
                    }

                    .navbar-brand {
                        font-size: 1.25rem;
                        font-weight: 600;
                        color: #0f172a;
                    }

                    .btn-logout {
                        padding: 0.5rem 1rem;
                        background: #ef4444;
                        color: white;
                        text-decoration: none;
                        border-radius: 0.375rem;
                        font-weight: 500;
                        transition: background 0.2s;
                    }

                    .btn-logout:hover {
                        background: #dc2626;
                    }

                    .dashboard-content {
                        margin-top: 3rem;
                        background: white;
                        padding: 3rem;
                        border-radius: 1rem;
                        box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.1);
                        text-align: center;
                        max-width: 600px;
                        width: 90%;
                        animation: slideUp 0.5s ease-out;
                    }

                    @keyframes slideUp {
                        from {
                            opacity: 0;
                            transform: translateY(20px);
                        }

                        to {
                            opacity: 1;
                            transform: translateY(0);
                        }
                    }

                    .welcome-title {
                        font-size: 2.5rem;
                        color: #0f172a;
                        margin-bottom: 0.5rem;
                    }

                    .role-badge {
                        display: inline-block;
                        background: #e0f2fe;
                        color: #0284c7;
                        padding: 0.25rem 0.75rem;
                        border-radius: 1rem;
                        font-size: 0.875rem;
                        font-weight: 600;
                        margin-bottom: 1.5rem;
                    }

                    .welcome-subtitle {
                        font-size: 1.1rem;
                        color: #64748b;
                    }
                </style>
            </head>

            <body>
                <nav class="navbar">
                    <div class="navbar-brand">App Dashboard</div>
                    <a href="LogoutServlet" class="btn-logout">Logout</a>
                </nav>

                <div class="dashboard-content">
                    <h1 class="welcome-title">Welcome, <%= loggedInUser.getUsername() %>! 👋</h1>
                    <div class="role-badge">
                        <%= loggedInUser.getRole() %>
                    </div>
                    <p class="welcome-subtitle">You have successfully logged into the system using the pure Servlets &
                        JSP MVC Architecture.</p>
                </div>
            </body>

            </html>