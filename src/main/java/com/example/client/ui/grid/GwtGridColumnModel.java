package com.example.client.ui.grid;

import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by OMoskalenko on 07/05/15.
 */
public class GwtGridColumnModel {
    private ColumnModel columnModel;

    public static ColumnModel getColumnModel(Collection<String> columnNames) {
        return getColumnModel(columnNames.toArray(new String[columnNames.size()]));
    }

    public static ColumnModel getColumnModel(String[] columnNames) {
        List<ColumnConfig> configs = new ArrayList<ColumnConfig>();
        for (String columnName : columnNames) {
            ColumnConfig column = new ColumnConfig();
            column.setId(columnName);
            column.setHeaderHtml(columnName);
            column.setWidth(100);
            column.setFixed(true);
            configs.add(column);
        }
        return new ColumnModel(configs);
    }
}
