package com.example.shared.dto;

import com.extjs.gxt.ui.client.data.BaseModelData;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by OMoskalenko on 07/05/15.
 */
public class LimitDTO extends BaseModelData implements Serializable, PagingLoadResult<Object> {
    public static final String BOOK = "Book";
    public static final String LOCATION = "Location";
    public static final String VALUE = "Value";


    public LimitDTO() {
    }

    public LimitDTO(String book, String location, BigDecimal value) {
        set(BOOK, book);
        set(LOCATION, location);
        set(VALUE, value);
    }


    public String getBook() {
        return get(BOOK);
    }

    public void setBook(String book) {
        set(BOOK, book);
    }

    public String getLocation() {
        return get(LOCATION);
    }

    public void setLocation(String location) {

        set(LOCATION, location);
    }

    public BigDecimal getValue() {
        return get(VALUE);
    }

    public void setValue(BigDecimal value) {

        set(VALUE, value);
    }

    public int getOffset() {
        return 0;
    }

    public int getTotalLength() {
        return 0;
    }

    public void setOffset(int i) {

    }

    public void setTotalLength(int i) {

    }

    public List<Object> getData() {
        return null;
    }
}
