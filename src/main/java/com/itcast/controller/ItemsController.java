package com.itcast.controller;

import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        System.out.println("1111111111111111111");
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";
    }
}
