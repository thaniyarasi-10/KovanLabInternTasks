<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login System</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600&display=swap');
        
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Inter', sans-serif;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);
            color: #f8fafc;
        }

        .login-container {
            background: rgba(255, 255, 255, 0.05);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.1);
            padding: 3rem;
            border-radius: 1rem;
            width: 100%;
            max-width: 400px;
            box-shadow: 0 25px 50px -12px rgba(0, 0, 0, 0.5);
            animation: fadeIn 0.5s ease-out;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(-20px); }
            to { opacity: 1; transform: translateY(0); }
        }

        .login-header {
            text-align: center;
            margin-bottom: 2rem;
        }

        .login-header h2 {
            font-size: 2rem;
            font-weight: 600;
            margin-bottom: 0.5rem;
            background: linear-gradient(to right, #38bdf8, #818cf8);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }

        .login-header p {
            color: #94a3b8;
            font-size: 0.9rem;
        }

        .form-group {
            margin-bottom: 1.5rem;
        }

        .form-group label {
            display: block;
            margin-bottom: 0.5rem;
            font-size: 0.9rem;
            color: #cbd5e1;
            font-weight: 500;
        }

        .form-control {
            width: 100%;
            padding: 0.75rem 1rem;
            background: rgba(15, 23, 42, 0.5);
            border: 1px solid rgba(255, 255, 255, 0.1);
            border-radius: 0.5rem;
            color: #f8fafc;
            font-size: 1rem;
            transition: all 0.3s ease;
        }

        .form-control:focus {
            outline: none;
            border-color: #38bdf8;
            box-shadow: 0 0 0 2px rgba(56, 189, 248, 0.2);
        }

        .btn-submit {
            width: 100%;
            padding: 0.75rem;
            background: linear-gradient(to right, #38bdf8, #818cf8);
            border: none;
            border-radius: 0.5rem;
            color: white;
            font-size: 1rem;
            font-weight: 600;
            cursor: pointer;
            transition: transform 0.2s, box-shadow 0.2s;
        }

        .btn-submit:hover {
            transform: translateY(-2px);
            box-shadow: 0 10px 15px -3px rgba(56, 189, 248, 0.4);
        }

        .btn-submit:active {
            transform: translateY(0);
        }

        .error-message {
            color: #ef4444;
            font-size: 0.85rem;
            margin-top: 1rem;
            text-align: center;
            background: rgba(239, 68, 68, 0.1);
            padding: 0.5rem;
            border-radius: 0.25rem;
            border: 1px solid rgba(239, 68, 68, 0.2);
            <% if(request.getAttribute("errorMessage") == null) { %>
                display: none;
            <% } %>
        }
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-header">
            <h2>Welcome Back</h2>
            <p>Please enter your details to sign in.</p>
        </div>
        
        <form action="LoginServlet" method="post">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" class="form-control" required placeholder="Enter your username" autocomplete="off">
            </div>
            
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" class="form-control" required placeholder="Enter your password">
            </div>
            
            <button type="submit" class="btn-submit">Sign In</button>
            
            <div class="error-message">
                <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
            </div>
        </form>
    </div>
</body>
</html>
