package com.questionpro.grocery_booking.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionpro.grocery_booking.model.GroceryItem;
import com.questionpro.grocery_booking.service.GroceryItemService;

@RestController
@RequestMapping("/api")
public class UserController {
    private final GroceryItemService groceryItemService;

    // @Autowired
    public UserController(GroceryItemService groceryItemService) {
        this.groceryItemService = groceryItemService;
    }

    @GetMapping("/groceryItems")
    public ResponseEntity<List<GroceryItem>> getAllGroceryItems() {
        List<GroceryItem> groceryItems = groceryItemService.getAllGroceryItems();
        return ResponseEntity.ok().body(groceryItems);
    }

    // Implement other endpoints
}
