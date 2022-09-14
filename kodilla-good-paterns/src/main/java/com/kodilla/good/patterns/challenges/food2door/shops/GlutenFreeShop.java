package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.information.SmsService;
import com.kodilla.good.patterns.challenges.food2door.repository.ExcelRepository;
import com.kodilla.good.patterns.challenges.food2door.transport.CarTransport;

public class GlutenFreeShop extends Shop {

    public GlutenFreeShop() {
        super(new SmsService(), new ExcelRepository(), new CarTransport());
    }


    @Override
    public String toString() {
        return "GlutenFreeShop";
    }

}