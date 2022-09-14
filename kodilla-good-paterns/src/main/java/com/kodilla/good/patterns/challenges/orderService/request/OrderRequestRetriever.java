package com.kodilla.good.patterns.challenges.orderService.request;

import com.kodilla.good.patterns.challenges.orderService.model.ProductInShoppingCart;
import com.kodilla.good.patterns.challenges.orderService.model.User;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Marcin", "Chamik");
        LocalDateTime time = LocalDateTime.now();
        Map<Integer, ProductInShoppingCart> items = new HashMap<>();


        ProductInShoppingCart product0 = new ProductInShoppingCart("Chicken", 2);
        ProductInShoppingCart product1 = new ProductInShoppingCart("Rice", 3);

        items.put(product0.hashCode(), product0);
        items.put(product1.hashCode(), product1);

        return new OrderRequest(user, time, items);
    }
}