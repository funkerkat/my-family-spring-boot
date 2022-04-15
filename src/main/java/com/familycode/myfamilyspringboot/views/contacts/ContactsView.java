package com.familycode.myfamilyspringboot.views.contacts;

import com.familycode.myfamilyspringboot.demo_person_rest_api.DemoPerson;
import com.familycode.myfamilyspringboot.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;

@PageTitle("Contacts")
@Route(value = "/contacts", layout = MainLayout.class)
//@Route(value = "/contacts")
public class ContactsView extends VerticalLayout {

    public ContactsView() {

        add(new Button("Click"));

        // Have some data
        List<DemoPerson> people = Arrays.asList(
                new DemoPerson("Nicolaus Copernicus", 1543),
                new DemoPerson("Galileo Galilei", 1564),
                new DemoPerson("George Washington", 1732),
                new DemoPerson("John Adams", 1735),
                new DemoPerson("Thomas Jefferson", 1743),
                new DemoPerson("James Madison", 1751),
                new DemoPerson("Johannes Kepler", 1571));

        // Create a grid bound to the list
        Grid<DemoPerson> grid = new Grid<>();
        grid.setItems(people);
        grid.addColumn(DemoPerson::getName).setHeader("Name");
        grid.addColumn(DemoPerson::getYearOfBirth).setHeader("Year of birth");

        add(grid);

    }
}
