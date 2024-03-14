package com.questionpro.grocery_booking.contoller.service;

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
        return null;
    }


    public List<GroceryItem> getItems() {
        return repo.findAll();
    }



}
