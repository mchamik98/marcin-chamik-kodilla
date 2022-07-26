package com.kodilla.good.patterns.challenges.food2door.repository;

import com.kodilla.good.patterns.challenges.food2door.service.Choice;
import com.kodilla.good.patterns.challenges.food2door.model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository {

    boolean createOrderRepository(User user, LocalDateTime time, List<Choice> choiceList);
}