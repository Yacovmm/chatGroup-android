package com.yacov.flashchatnewfirebase.model;

/**
 * Created by YacovR on 12-Dec-17.
 */

public class InstantMessage {

    private String message, author;

    public InstantMessage() {

    }

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
