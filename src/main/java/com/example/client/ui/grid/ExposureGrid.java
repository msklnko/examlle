package com.example.client.ui.grid;

import com.example.shared.dto.ExposureDTO;
import com.example.shared.dto.LimitDTO;
import com.example.shared.model.Limit;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.google.gwt.user.client.Element;

import java.math.BigDecimal;

/**
 * Created by matroskin on 01.06.15.
 */
public class ExposureGrid extends LayoutContainer {
    private String[] columnNames = {"Book", "Location", "Value"};
    private Grid<ExposureDTO> grid;

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        setLayout(new BorderLayout());
        add(grid);
        grid.getStore().getLoader().load();
    }
    public ExposureGrid() {
        grid = createGrid();
    }

    public Grid<ExposureDTO> getGrid() {
        return grid;
    }

    private Grid<ExposureDTO> createGrid() {
        ListStore<ExposureDTO> store = new ListStore<ExposureDTO>() {{
            add(new ExposureDTO("book1", "loc 1", 2l));
            add(new ExposureDTO("22book", "22loc ", 3l));
        }};

        final Grid<ExposureDTO> grid = new Grid<ExposureDTO>(store, GwtGridColumnModel.getColumnModel(columnNames));
        grid.setStyleAttribute("borderTop", "none");
        grid.setBorders(true);
        grid.setStripeRows(true);
        grid.setColumnLines(true);
        return grid;
    }

}
