package Zadanie2;

public enum OrderStatus {
    NEW("złożono nowe zamówienie"),
    PAID("zamówienie opłacone"),
    SHIPPED("zamówienie wysłane"),
    DELIVERED("zamówienie dostarczone"),
    CANCELLED("zamówienie anulowano");

    String description;

    OrderStatus(String descriptionPL) {
        this.description = descriptionPL;
    }
}
