package com.example.client.ui.form;

import com.example.client.ui.grid.ExposureGrid;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.layout.AccordionLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.google.gwt.user.client.Element;

/**
 * Created by OMoskalenko on 07/05/15.
 */
public class AccordingWindowExposure extends LayoutContainer {
    public final Window windowExposure = new Window();

    @Override
    protected void onRender(Element parent, int index) {
        super.onRender(parent, index);

        setLayout(new FlowLayout(10));

        windowExposure.setHeadingHtml("Exposure");
        windowExposure.setMaximizable(true);
        windowExposure.setHeight(400);
        windowExposure.setWidth(600);

        windowExposure.setLayout(new AccordionLayout());

        ExposureGrid exposureGrid=new ExposureGrid();
        ContentPanel contentLimit = new ContentPanel();
        contentLimit.setAnimCollapse(false);
        contentLimit.setHeadingHtml("Exposure Grid");
        contentLimit.setLayout(new FlowLayout());
        contentLimit.add(exposureGrid.getGrid());
        contentLimit.setHeight(300);


        windowExposure.add(contentLimit);

        contentLimit = new ContentPanel();
        contentLimit.setAnimCollapse(false);
        contentLimit.setHeadingHtml("Exposure Upload");
        contentLimit.setLayout(new FlowLayout());

        windowExposure.add(contentLimit);
    }
}
