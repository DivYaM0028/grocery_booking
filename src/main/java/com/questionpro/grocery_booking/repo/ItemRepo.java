package com.questionpro.grocery_booking.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.questionpro.grocery_booking.model.GroceryItem;

@Repository
public class ItemRepo {

    private JdbcTemplate jdbc;
    

    public void save(GroceryItem groceryItem) {
        System.out.println("Item Added");
        String sql = "insert into item (id, name , price , quantity) values(?,?,?,?)";

        int rows = jdbc.update(sql, groceryItem.getId(),groceryItem.getName(),groceryItem.getPrice(),groceryItem.getQuantity());
        System.out.println("Rows: "+rows);
    }

    public List<GroceryItem> findAll() {
        List<GroceryItem> items = new ArrayList<>();
        return items;
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

}
