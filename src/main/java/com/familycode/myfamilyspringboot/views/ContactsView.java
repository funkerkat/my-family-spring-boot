package com.familycode.myfamilyspringboot.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("CONTACTS || MY FAMILY APP")
@Route(value = "/contacts")
public class ContactsView extends VerticalLayout {

    public ContactsView() {

        add(new Button("Click"));

    }

}
