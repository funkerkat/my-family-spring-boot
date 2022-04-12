package com.familycode.myfamilyspringboot.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("WELCOME || MY FAMILY APP")
@Route(value = "")
public class WelcomeView extends VerticalLayout {

    public WelcomeView() {

        add(new H2("Welcome to My Family App!"));

    }

}
