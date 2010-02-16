package org.hibernate.tutorial.domain;

import java.util.Set;
import java.util.HashSet;

public class Person {

    private Long id;
    private int age;
    private String firstname;
    private String lastname;

    private Set events = new HashSet();

    public Person() {}

    public Set getEvents() {
        return events;
    }

    public void setEvents(Set events) {
        this.events = events;
    }

    // Accessor methods for all properties, private setter for 'id'

}

