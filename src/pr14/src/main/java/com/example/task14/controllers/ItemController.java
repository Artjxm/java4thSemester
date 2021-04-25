package com.example.task14.controllers;


import com.example.task14.models.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ItemController {
    ArrayList<Item> items = new ArrayList<>();
    @PostMapping("/items/create")
    public String createItem(@RequestBody Item item){
        items.add(item);
        item.setId(items.size());
        return items.toString();
    }

    @GetMapping("/items")
    public String allItems(){
        return items.toString();
    }

    @DeleteMapping("/items/{item_id}")
    public String deleteItem(@PathVariable("item_id") int item_id){
        items.removeIf(o -> o.getId() == item_id);
        return items.toString();
    }
}
