package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;
import edu.badpals.stockx.Item.Sale;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o instanceof Sale)
                .collect(Collectors.toList());
    }
}
