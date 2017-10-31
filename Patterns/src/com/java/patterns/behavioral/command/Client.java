package com.java.patterns.behavioral.command;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// Receiver class.
class StockTrade {
    public void buy() {
        System.out.println("You want to buy stocks");
    }

    public void sell() {
        System.out.println("You want to sell stocks ");
    }
}

// Invoker.
class Agent {
    private final Queue<Order> ordersQueue = new ArrayBlockingQueue<>(10);

    public Agent() {
    }

    void placeOrder(final Order order) {
        this.ordersQueue.add(order);
    }

    void processOreders() {
        for (final Order order : this.ordersQueue) {
            order.execute();
        }
    }
}

// ConcreteCommand Class.
class BuyStockOrder implements Order {
    private final StockTrade stock;

    public BuyStockOrder(final StockTrade st) {
        this.stock = st;
    }

    @Override
    public void execute() {
        this.stock.buy();
    }
}

// ConcreteCommand Class.
class SellStockOrder implements Order {
    private final StockTrade stock;

    public SellStockOrder(final StockTrade st) {
        this.stock = st;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}

// Client
public class Client {
    public static void main(final String[] args) {
        final StockTrade stock = new StockTrade();
        final BuyStockOrder bsc = new BuyStockOrder(stock);
        final SellStockOrder ssc = new SellStockOrder(stock);
        final Agent agent = new Agent();

        agent.placeOrder(bsc); // Buy Shares
        agent.placeOrder(ssc); // Sell Shares

        agent.processOreders();
    }
}