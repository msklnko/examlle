package com.example.client.ui.form;

import com.example.client.ui.grid.LimitGrid;
import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.user.client.Element;

/**
 * Created by OMoskalenko on 07/05/15.
 */
public class MainPageForm extends LayoutContainer {

    private TabPanel tabPanel;

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
//        setLayout(new FitLayout());
        add(getTabPanel());

    }

    private TabPanel getTabPanel() {
        if (null == tabPanel) {
            tabPanel = new TabPanel();
            tabPanel.setResizeTabs(true);
            tabPanel.setAnimScroll(true);
            tabPanel.setWidth(500);
            tabPanel.setHeight(500);
            tabPanel.add(getLimitItem());
            tabPanel.add(getExposureItem());
        }
        return tabPanel;
    }

    private TabItem getLimitItem() {
        TabItem tabItem = new TabItem();
        tabItem.setLayout(new BorderLayout());
        tabItem.setLayoutOnChange(true);
        BorderLayoutData layoutData = new BorderLayoutData(Style.LayoutRegion.NORTH);
        tabItem.setText("Limit");

        LimitGrid limitGrid = new LimitGrid();
        tabItem.add(limitGrid, layoutData);
        layoutData = new BorderLayoutData(Style.LayoutRegion.SOUTH);

        return tabItem;
    }

    private TabItem getExposureItem() {
        TabItem tabItem = new TabItem();
        tabItem.setText("Exposure");
        return tabItem;
    }
}
