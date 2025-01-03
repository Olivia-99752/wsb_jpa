package com.jpacourse.dto;

import java.io.Serializable;
import java.util.List;

public class PatientTO implements Serializable {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<VisitTO> getVisits() {
        return visits;
    }

    public void setVisits(List<VisitTO> visits) {
        this.visits = visits;
    }

    private long id;
    private String firstName;
    private String lastName;
    private List<VisitTO> visits;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
