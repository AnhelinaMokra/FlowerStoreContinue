package ua.ucu.edu.apps.FlowerStoreContinue.store.decorators;

import ua.ucu.edu.apps.FlowerStoreContinue.store.items.Item;

public class BasketDecorator extends Decorator{

    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " + fit in basket.";
    }

    @Override
    public double price() {
        return item.price() + 4.0;
    }
}