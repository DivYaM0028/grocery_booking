package com.questionpro.grocery_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionpro.grocery_booking.model.GroceryItem;
import com.questionpro.grocery_booking.repo.ItemRepo;

@Service
public class GroceryItemService {

    @Autowired
    private ItemRepo repo;
    
    public ItemRepo getRepo() {
        return repo;
    }


    public void setRepo(ItemRepo repo) {
        this.repo = repo;
    }

    public GroceryItem addGroceryItem(GroceryItem groceryItem) {
        repo.save(groceryItem);
        System.out.println("Item Saved!!");
        return groceryItem;
    }


    public List<GroceryItem> getAllGroceryItems() {
        return repo.findAll();
    }


}
