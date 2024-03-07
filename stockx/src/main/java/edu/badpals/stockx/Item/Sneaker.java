package edu.badpals.stockx.Item;

import java.util.List;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public void add(Offer offer) {
        this.offers.add(offer);
    }

    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return this.name + "\n \t \t" + this.style;
    }
}
