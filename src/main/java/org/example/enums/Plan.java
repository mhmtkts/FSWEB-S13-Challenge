package org.example.enums;

public enum Plan {
    BASIC ("Mahmut", 10),
    MID   ("Zeynep", 15),
    PRO("Mehmet", 20);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
