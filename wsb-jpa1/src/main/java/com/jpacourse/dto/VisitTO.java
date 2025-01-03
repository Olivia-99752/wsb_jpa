package com.jpacourse.dto;

import com.jpacourse.persistence.enums.TreatmentType;

import java.time.LocalDateTime;
import java.util.List;

public class VisitTO {


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public VisitTO(long id, LocalDateTime date, String doctorName, List<TreatmentType> treatmentTypes) {
        this.id = id;
        this.date = date;
        this.doctorName = doctorName;
        this.treatmentTypes = treatmentTypes;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    private long id;

    public List<TreatmentType> getTreatmentTypes() {
        return treatmentTypes;
    }

    public void setTreatmentTypes(List<TreatmentType> treatmentTypes) {
        this.treatmentTypes = treatmentTypes;
    }

    private LocalDateTime date;
    private String doctorName;
    private List<TreatmentType> treatmentTypes;
}
