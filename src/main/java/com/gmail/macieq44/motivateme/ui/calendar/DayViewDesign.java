package com.gmail.macieq44.motivateme.ui.calendar;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class DayViewDesign extends CssLayout {
    protected Button backToCalendar;
    protected Label date;
    protected Button addActivity;
    protected ActivityGrid activityList;

    public DayViewDesign() {
        Design.read(this);
    }
}
