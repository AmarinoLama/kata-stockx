package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;
import java.util.Optional;

public class Max implements Criteria {

    private Criteria criteria = null;
    private Criteria otherCriteria = null;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(sneaker)
                .stream()
                .max(Offer::compareTo);
        return offer.isPresent()? List.of(offer.get()) : List.of();
    }
}
