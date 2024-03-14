<%@page language="java"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Grocery Management System</title>
    <!-- Add any additional CSS or JS files here -->
</head>
<body>
    <h1>Grocery Management System</h1>

    <h2>Admin Panel</h2>
    <div>
        <h3>Add New Grocery Item</h3>
        <form id="addItemForm" action="handleForm" method="post">
            <label for="itemName">Item Name:</label>
            <input type="text" id="itemName" name="itemName" required><br>
            
            <label for="itemPrice">Price:</label>
            <input type="number" id="itemPrice" name="itemPrice" required><br>

            <label for="itemQuantity">Quantity:</label>
            <input type="number" id="itemQuantity" name="itemQuantity" required><br>

            <button type="submit" href="/groceryItem">Add Item</button>
        </form>
    </div>

    <div>
        <h3>View Existing Grocery Items</h3>
        <ul id="existingItems">
            <!-- Populate existing items dynamically using JavaScript -->
        </ul>
    </div>

    <div>
        <h3>Remove Grocery Item</h3>
        <form id="removeItemForm">
            <label for="itemId">Item ID:</label>
            <input type="number" id="itemId" name="itemId" required><br>
            <button type="submit">Remove Item</button>
        </form>
    </div>

    <div>
        <h3>Update Grocery Item</h3>
        <form id="updateItemForm">
            <label for="updateItemId">Item ID:</label>
            <input type="number" id="updateItemId" name="updateItemId" required><br>

            <label for="newName">New Name:</label>
            <input type="text" id="newName" name="newName"><br>
            
            <label for="newPrice">New Price:</label>
            <input type="number" id="newPrice" name="newPrice"><br>

            <label for="newQuantity">New Quantity:</label>
            <input type="number" id="newQuantity" name="newQuantity"><br>

            <button type="submit">Update Item</button>
        </form>
    </div>

    <div>
        <h3>Manage Inventory Levels</h3>
        <form id="manageInventoryForm">
            <label for="inventoryItemId">Item ID:</label>
            <input type="number" id="inventoryItemId" name="inventoryItemId" required><br>

            <label for="newQuantity">New Quantity:</label>
            <input type="number" id="newInventoryQuantity" name="newInventoryQuantity" required><br>

            <button type="submit">Update Inventory</button>
        </form>
    </div>

    <hr>

    <h2>User Panel</h2>
    <div>
        <h3>View Available Grocery Items</h3>
        <ul id="availableItems">
            <!-- Populate available items dynamically using JavaScript -->
        </ul>
    </div>

    <div>
        <h3>Book Multiple Grocery Items</h3>
        <form id="bookItemsForm">
            <!-- Use checkboxes or other input methods for selecting items -->
            <button type="submit">Book Items</button>
        </form>
    </div>

    <!-- Add any additional HTML or scripts here -->

    <script>
        // JavaScript code for handling form submissions and dynamic population of lists
        // Use AJAX requests to interact with the backend API
    </script>
</body>
</html>
