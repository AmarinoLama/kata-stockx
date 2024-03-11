package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Ask;
import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Optional<Offer> min = sneaker.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .min(Offer::compareTo);
        // Effective java, Item 54: Return empty collections or arrays, not nulls
        return min.isPresent() ? List.of(min.get()) : List.of();
    }
}