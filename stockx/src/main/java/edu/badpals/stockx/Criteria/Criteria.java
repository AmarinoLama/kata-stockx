package edu.badpals.stockx.Criteria;

import edu.badpals.stockx.Item.Item;
import edu.badpals.stockx.Item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item sneaker);
}
