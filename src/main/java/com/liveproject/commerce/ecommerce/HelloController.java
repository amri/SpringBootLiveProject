package com.liveproject.commerce.ecommerce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/")
    public ModelAndView index(Map<String, Object> model){
        model.put("storeName", "Cake Factory3");
        List<ShopItem> shopItems = new ArrayList<ShopItem>();
        shopItems.add(new ShopItem("Cheese Cake", 120.10));
        shopItems.add(new ShopItem("Black forest Cake", 150.20));
        shopItems.add(new ShopItem("Chocolate Muffin", 15.30));
        shopItems.add(new ShopItem("Bread", 5));
        shopItems.add(new ShopItem("Milk", 6.50));

        model.put("items", shopItems);
        return new ModelAndView("index", model);
    }
}
