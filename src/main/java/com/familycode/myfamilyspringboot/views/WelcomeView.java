package com.familycode.myfamilyspringboot.views;

import com.familycode.myfamilyspringboot.views.about.AboutView;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;

@PageTitle("WELCOME || MY FAMILY APP")
@Route(value = "")
public class WelcomeView extends VerticalLayout {

    public WelcomeView() {

        add(new H2("Welcome to My Family App!"));

        String route = RouteConfiguration.forSessionScope().getUrl(AboutView.class);
        Anchor link = new Anchor(route, "Start...");
        add(link);
    }

}
