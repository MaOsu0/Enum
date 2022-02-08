package Zadanie2;

import java.util.Objects;

public class Order {

    private String name;
    private double price;
    private OrderStatus orderStatus;

    public Order(String name, double price, OrderStatus orderStatus) {
        this.name = name;
        this.price = price;
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 && Objects.equals(name, order.name) && orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, orderStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
