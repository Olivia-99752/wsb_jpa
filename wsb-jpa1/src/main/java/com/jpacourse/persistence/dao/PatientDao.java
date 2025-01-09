package com.jpacourse.persistence.dao;

import com.jpacourse.persistence.entity.PatientEntity;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long>{
    List<PatientEntity> findBylastName(String lastName);
    List<PatientEntity> findByMoreVisitsThanX(int x);
    List<PatientEntity> findObesePatients(int x);
}
