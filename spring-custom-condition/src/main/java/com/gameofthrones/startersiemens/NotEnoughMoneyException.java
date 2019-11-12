package com.gameofthrones.startersiemens;

/**
 * @author Evgeny Borisov
 */
public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
