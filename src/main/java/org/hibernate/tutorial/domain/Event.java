package org.hibernate.tutorial.domain;

import java.util.*;

public class Event {
    private Long id;

    private String title;
    private Date date;

    public Event() {}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private Set participants = new HashSet();

    protected Set getParticipants() {
        return participants;
    }

    protected void setParticipants(Set participants) {
        this.participants = participants;
    }

    public void addToPerson(Person p) {
        this.getParticipants().add(p);
        p.getEvents().add(this);
    }

    public void removeFromPerson(Person p) {
        this.getParticipants().remove(p);
        p.getEvents().remove(this);
    }
}

