package com.example.client;

import com.example.client.ui.form.AccordingWindow;
import com.example.client.ui.form.AccordingWindowExposure;
import com.example.client.ui.form.MainPageForm;
import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ButtonBar;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Hello implements EntryPoint {

    /**
     * Create a remote service proxy to talk to the server-side Greeting service.
     */
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    private final Messages messages = GWT.create(Messages.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        MainPageForm form = new MainPageForm();
//        BorderLayoutData northData=new BorderLayoutData(Style.LayoutRegion.NORTH);
//        northData.setCollapsible(true);
//        northData.setSplit(true);
        Viewport viewport = new Viewport();
        final BorderLayout borderLayoutData = new BorderLayout();
        viewport.setLayout(borderLayoutData);

        BorderLayoutData northData = new BorderLayoutData(Style.LayoutRegion.NORTH, 50);
        northData.setCollapsible(true);
        northData.setSplit(true);
        HTML headerHtml = new HTML();
        final AccordingWindow accordingWindow = new AccordingWindow();
        final AccordingWindowExposure accordingWindowExposure = new AccordingWindowExposure();
        ButtonBar buttonBar = new ButtonBar();
//        Button buttonLimit = new Button("Limit");
        Button buttonExposure = new Button("Exposure", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                accordingWindowExposure.windowExposure.show();
            }
        });
        Button buttonLimit = new Button("Limit", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                accordingWindow.windowLimit.show();
            }
        });


        List<Integer> list = new ArrayList<Integer>();
        Map<String, Integer> map = new TreeMap<String, Integer>();


        buttonBar.add(buttonLimit);
        buttonBar.add(buttonExposure);
        viewport.add(buttonBar, northData);
        BorderLayoutData centerData = new BorderLayoutData(Style.LayoutRegion.CENTER, 600);
        viewport.add(accordingWindow, centerData);
        viewport.add(accordingWindowExposure, centerData);
        RootPanel.get().add(viewport);


    }
}
