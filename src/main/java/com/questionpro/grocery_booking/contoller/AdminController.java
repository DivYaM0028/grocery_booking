// package com.questionpro.grocery_booking.contoller;

// // import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.questionpro.grocery_booking.contoller.service.GroceryItemService;
// import com.questionpro.grocery_booking.model.GroceryItem;

// @RestController
// @RequestMapping("/api/admin")
// public class AdminController {
//     private final GroceryItemService groceryItemService;

//     // @Autowired
//     public AdminController(GroceryItemService groceryItemService) {
//         this.groceryItemService = groceryItemService;
//     }

//     @PostMapping("/groceryItems")
//     public ResponseEntity<GroceryItem> addGroceryItem(@RequestBody GroceryItem groceryItem) {
//         GroceryItem addedItem = groceryItemService.addGroceryItem(groceryItem);
//         return ResponseEntity.ok().body(addedItem);
//     }

//     // Implement other endpoints
// }
