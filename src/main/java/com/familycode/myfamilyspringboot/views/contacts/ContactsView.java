package com.familycode.myfamilyspringboot.views.contacts;

import com.familycode.myfamilyspringboot.person.Person;
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
        List<Person> people = Arrays.asList(
                new Person("Nicolaus Copernicus", 1543),
                new Person("Galileo Galilei", 1564),
                new Person("George Washington", 1732),
                new Person("John Adams", 1735),
                new Person("Thomas Jefferson", 1743),
                new Person("James Madison", 1751),
                new Person("Johannes Kepler", 1571));

        // Create a grid bound to the list
        Grid<Person> grid = new Grid<>();
        grid.setItems(people);
        grid.addColumn(Person::getName).setHeader("Name");
        grid.addColumn(Person::getYearOfBirth).setHeader("Year of birth");

        add(grid);

    }
}
