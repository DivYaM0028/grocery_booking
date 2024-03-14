<%@ page language = "java"%>
<%@ page import="com.questionpro.grocery_booking.model.GroceryItem"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Item Saved</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h1 {
            margin-bottom: 20px;
        }
        p {
            margin-bottom: 20px;
        }
        a {
            text-decoration: none;
            color: #007bff;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<%
    GroceryItem item = (GroceryItem).request.getAttribute("groceryItem");
%>
<body>
    <div class="container">
        <h1>Item Saved</h1>
        <p>Your item has been successfully saved.</p>
        <p><a href="/">Go back to home page</a></p>
    </div>
</body>
</html>
