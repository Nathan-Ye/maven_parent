package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/findById/{id}")
    public String findById(@PathVariable("id") int id, Model model){
        Item item = itemService.findById(id);

        model.addAttribute("item",item);

        return "show";
    }
}
