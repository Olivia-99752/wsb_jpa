package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {
    @Override
    public List<PatientEntity> findBylastName(String lastName) {
        return this.findAll().stream().filter(patientEntity -> Objects.equals(patientEntity.getLastName(), lastName)).toList();
    }

    @Override
    public List<PatientEntity> findByMoreVisitsThanX(int x) {
        return this.findAll().stream().filter(patientEntity -> (long) patientEntity.getVisits().size() > x).toList();
    }

    @Override
    public List<PatientEntity> findObesePatients(int x) {
        return this.findAll().stream().filter(patientEntity -> patientEntity.getWeight() > x).toList();
    }
}