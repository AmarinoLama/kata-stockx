package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria {

    private String number = "";

    public Size(String size) {
        this.number = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        return sneaker.offers()
                .stream()
                .filter(o -> o.size().equals(number))
                .collect(Collectors.toList());
    }
}
