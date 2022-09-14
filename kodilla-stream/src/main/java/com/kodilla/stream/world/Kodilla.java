package com.kodilla.stream.world;



import java.util.*;
import java.lang.*;

class Order{

    private int orderNumber;

    public Order(int orderNumber){
        this.orderNumber = orderNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return Double.compare(order.orderNumber, orderNumber) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(orderNumber);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                '}';
    }
}

class Customer{

    private String firstName;
    private String secondName;
    private ArrayList<String> items;

    public Customer(String firstName, String secondName, ArrayList<String> items){
        this.firstName = firstName;
        this.secondName = secondName;
        this.items = items;
    }

    public String toString(){
        return firstName + " " + secondName + " " + items;
    }

}

public class Kodilla {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();


        items.add("Bagpack");
        items.add("Notebook");
        items.add("Pencil");
        items.add("Pen");
        items.add("Calculator");


        Customer customer1 = new Customer("Marcin", "Ch", items);
        Customer customer2 = new Customer("Mikolaj", "La", items);
        Customer customer3 = new Customer("Magda", "Se", items);


        ArrayList<Integer> listOfOrders = new ArrayList<>();
        HashMap<Order, Customer> customerOrders = new HashMap<>();

        for (int i = 0; i < 10; i++) {

            Random random = new Random();
            int firstRandom = random.nextInt();
            int secondRandom = random.nextInt();
            int randomOrderNum = firstRandom * secondRandom;
            listOfOrders.add(randomOrderNum);
        }

        Order order1 = new Order(listOfOrders.get(0));
        Order order2 = new Order(listOfOrders.get(1));
        Order order3 = new Order(listOfOrders.get(2));
        Order order4 = new Order(listOfOrders.get(3));
        Order order5 = new Order(listOfOrders.get(4));
        Order order6 = new Order(listOfOrders.get(5));
        Order order7 = new Order(listOfOrders.get(6));
        Order order8 = new Order(listOfOrders.get(7));
        Order order9 = new Order(listOfOrders.get(8));
        Order order10 = new Order(listOfOrders.get(9));


        customerOrders.put(order1, customer1);
        customerOrders.put(order3, customer2);
        customerOrders.put(order2, customer3);
        customerOrders.put(order4, customer2);
        customerOrders.put(order5, customer1);
        customerOrders.put(order2, customer3);
        customerOrders.put(order9, customer1);
        customerOrders.put(order7, customer2);
        customerOrders.put(order6, customer3);
        customerOrders.put(order8, customer2);
        customerOrders.put(order10, customer1);
        customerOrders.put(order2, customer3);

        for (Map.Entry<Order, Customer> entry : customerOrders.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(entry.equals(customerOrders));
        }
    }
}