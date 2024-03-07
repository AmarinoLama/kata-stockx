package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Bid;
import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria{
    public Bids() {}
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .collect(Collectors.toList());
    }
}
