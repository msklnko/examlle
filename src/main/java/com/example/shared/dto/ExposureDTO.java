package com.example.shared.dto;

import com.example.shared.model.Limit;
import com.extjs.gxt.ui.client.data.BaseModelData;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by matroskin on 01.06.15.
 */
public class ExposureDTO extends BaseModelData implements Serializable, PagingLoadResult<Object> {

    private static final String Limit = "Limit";
    private static final String BOOK = "Book";
    private static final String LOCATION = "Location";

    public ExposureDTO(String book1, String s, Long limit) {

    }

    public ExposureDTO() {
    }


    public static String getLimit() {
        return Limit;
    }

    public static String getBOOK() {
        return BOOK;
    }

    public static String getLOCATION() {
        return LOCATION;
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
