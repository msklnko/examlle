package com.example.client.ui.grid;

import com.example.shared.dto.LimitDTO;
import com.extjs.gxt.ui.client.data.*;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;

import java.math.BigDecimal;

/**
 * Created by OMoskalenko on 07/05/15.
 */
public class LimitGrid extends LayoutContainer {
    private String[] columnNames = {"Book", "Location", "Value"};
    private Grid<LimitDTO> grid;

    public LimitGrid() {
        grid = createGrid();
    }

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        setLayout(new BorderLayout());
        add(grid);
        grid.getStore().getLoader().load();
    }

    public Grid<LimitDTO> getGrid() {
        return grid;
    }

    private Grid<LimitDTO> createGrid() {
        ListStore<LimitDTO> store = new ListStore<LimitDTO>() {{
            add(new LimitDTO("book1", "loc 1", new BigDecimal(125)));
            add(new LimitDTO("22book", "22loc ", new BigDecimal(25)));
        }};
//
//        DataProxy<LimitDTO> dataProxy = new DataProxy<LimitDTO>() {
//            public void load(DataReader<LimitDTO> reader, Object loadConfig, final AsyncCallback<LimitDTO> callback) {
//                service.( {
//
//                })
//            }
//        }

//        ListLoader<LimitDTO> loader = new BasePagingLoader<LimitDTO>(dataProxy);

//        ListStore<LimitDTO> store = new ListStore<LimitDTO>(loader);

        final Grid<LimitDTO> grid = new Grid<LimitDTO>(store, GwtGridColumnModel.getColumnModel(columnNames));
        grid.setStyleAttribute("borderTop", "none");
        grid.setBorders(true);
        grid.setStripeRows(true);
        grid.setColumnLines(true);
        return grid;
    }
}
