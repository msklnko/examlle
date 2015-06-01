package com.example.client.ui.form;

import com.example.client.ui.grid.LimitGrid;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.layout.AccordionLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.google.gwt.user.client.Element;

/**
 * Created by OMoskalenko on 07/05/15.
 */
public class AccordingWindow extends LayoutContainer {
    public final Window windowLimit = new Window();

    private LimitGrid limitGrid;

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);
        setLayout(new FlowLayout(10));
        windowLimit.setHeadingHtml("Limit");
        windowLimit.setMaximizable(true);
        windowLimit.setHeight(400);
        windowLimit.setWidth(600);

        windowLimit.setLayout(new AccordionLayout());


        limitGrid = new LimitGrid();

        ContentPanel contentLimit = new ContentPanel();
        contentLimit.setAnimCollapse(false);
        contentLimit.setHeadingHtml("Limit Grid");
        contentLimit.setLayout(new FlowLayout());
        contentLimit.add(limitGrid.getGrid());
        contentLimit.setHeight(600);

        Button refresh = new Button("Refresh");
        refresh.addSelectionListener(new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                limitGrid.getGrid().getStore().getLoader().load();
            }
        });
        contentLimit.add(refresh);

        Button addLimit = new Button("Add");
        addLimit.addSelectionListener(new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
//                FeedForm formLimit = new FeedForm();
//                formLimit.show();
            }
        });
        contentLimit.add(addLimit);

        windowLimit.add(contentLimit);

        contentLimit = new ContentPanel();
        contentLimit.setAnimCollapse(false);
        contentLimit.setHeadingHtml("Limit Upload");
//        contentLimit.add(new LimitLimitUpload().getViewport());
        contentLimit.setLayout(new FlowLayout());

        windowLimit.add(contentLimit);

        contentLimit = new ContentPanel();
        contentLimit.setAnimCollapse(false);
        contentLimit.setHeadingHtml("Limit Rule");
        contentLimit.setLayout(new FlowLayout());
        windowLimit.add(contentLimit);
    }
}
