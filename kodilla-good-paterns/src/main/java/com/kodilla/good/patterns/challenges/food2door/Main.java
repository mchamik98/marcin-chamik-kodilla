package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.model.Product;
import com.kodilla.good.patterns.challenges.food2door.model.ShopType;
import com.kodilla.good.patterns.challenges.food2door.model.User;
import com.kodilla.good.patterns.challenges.food2door.service.Cart;
import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.service.PurchaseService;

public class Main {

    public static void main(String[] args) {
        PurchaseService purchaseService = new PurchaseService();

        User user = new User("Marcin", "marciN_mail", "Rzeszow");
        Cart cart = new Cart(user);

        Product product0 = new Product("Chicken", ShopType.EXTRA_FOOD_SHOP);
        Choice choice0 = new Choice(product0, 1);
        cart.addChoice(choice0);

        Product product1 = new Product("Bread", ShopType.GLUTEN_FREE_SHOP);
        Choice choice1 = new Choice(product1, 5);
        cart.addChoice(choice1);

        Choice choice2 = new Choice(product1, 3);
        cart.addChoice(choice2);

        purchaseService.processOrder(cart);

    }

}