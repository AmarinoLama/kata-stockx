package edu.badpals.stockx.Item;

public class Ask implements Offer {
    private String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    public String size() {
        return this.size;
    }
    public int value() {
        return this.ask;
    }

    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }

    @Override
    public String toString() {
        return "Ask{" +
                "size='" + size + '\'' +
                ", ask=" + ask +
                '}';
    }
}
