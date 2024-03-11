package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Bid;
import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Optional<Offer> max = sneaker.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .max(Offer::compareTo);
        // Effective java, Item 54: Return empty collections or arrays, not nulls
        return max.isPresent()? List.of(max.get()) : List.of();
    }
}
