package com.questionpro.grocery_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RestController;

import com.questionpro.grocery_booking.model.GroceryItem;
import com.questionpro.grocery_booking.service.GroceryItemService;



@Controller
public class HomeController {

    @Autowired
    private GroceryItemService service;
    
    @GetMapping({"/","home"})
    public String home(){
        System.out.println("Home Page called!!");
        return "index.jsp";
    }

    @PostMapping("handleForm")
    public String handleForm(GroceryItem groceryItem) {
        service.addGroceryItem(groceryItem);
        return "itemsaved.jsp";
    }
    
}
