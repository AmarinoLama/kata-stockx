package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Ask;
import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
                .filter(o -> o instanceof Ask)
                .sorted()
                .collect(Collectors.toList());
    }
}
