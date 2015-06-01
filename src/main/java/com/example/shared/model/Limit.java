package com.example.shared.model;

import java.util.Date;

/**
 * Created by matroskin on 24.05.15.
 */
public class Limit {

    private String value;
    private String book;
    private String location;
//    private Date date;

    public Limit(String value, String book, String location) {
        this.value = value;
        this.book = book;
        this.location = location;
    }
}
