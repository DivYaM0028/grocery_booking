package com.questionpro.grocery_booking;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.questionpro.grocery_booking.contoller.service.GroceryItemService;
import com.questionpro.grocery_booking.model.GroceryItem;

@SpringBootApplication
public class GroceryBookingApplication {

	public static void main(String[] args) {
		ApplicationContext context =   SpringApplication.run(GroceryBookingApplication.class, args);

		GroceryItem item =  context.getBean(GroceryItem.class);
		item.setId(1l);
		item.setName("Redbull");
		item.setPrice(125);
		item.setQuantity(20);

		GroceryItemService service = ((BeanFactory) context).getBean(GroceryItemService.class);
		service.addGroceryItem(item);

		List<GroceryItem> items = service.getItems();
		System.out.println(items);
	}	

}
