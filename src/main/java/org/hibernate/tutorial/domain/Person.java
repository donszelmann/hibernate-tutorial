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

    private Set emailAddresses = new HashSet();

    public Set getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    protected Set getEvents() {
        return events;
    }

    protected void setEvents(Set events) {
        this.events = events;
    }

    // Accessor methods for all properties, private setter for 'id'
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String first) {
        this.firstname = first;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String first) {
        this.lastname = first;
    }
    public void addToEvent(Event event) {
        this.getEvents().add(event);
        event.getParticipants().add(this);
    }

    public void removeFromEvent(Event event) {
        this.getEvents().remove(event);
        event.getParticipants().remove(this);
    }
}

