package edu.badpals.stockx.Item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<Offer>();

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
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return this.ask;
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
