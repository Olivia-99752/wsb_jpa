package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.VisitDao;
import com.jpacourse.persistence.entity.VisitEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class VisitDaoImpl extends AbstractDao<VisitEntity, Long> implements VisitDao {
    public List<VisitEntity> findAllbyPatientId(Long id) {
        return this.findAll().stream().filter(visitEntity -> Objects.equals(visitEntity.getPatient().getId(), id)).toList();
    }
}