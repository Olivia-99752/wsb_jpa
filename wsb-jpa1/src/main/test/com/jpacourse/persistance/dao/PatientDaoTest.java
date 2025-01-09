package com.jpacourse.persistance.dao;

import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.dao.PatientDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Test
    public void testShouldFindByLastName() {
        //given
        //when
        List<PatientEntity> patients = patientDao.findBylastName('Malysz');
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.count()).isEqualTo(1);
        assertThat(patients[0].getLastName()).isEqualTo('Malysz');
    }

    @Test
    public void testShouldFindByVisitCount() {
        //given
        //when
        List<PatientEntity> patients = patientDao.findByMoreVisitsThanX(1);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.count()).isEqualTo(1);
        assertThat(patients[0].getLastName()).isEqualTo('Dybicka');
    }

    @Test
    public void testShouldFindByLastName() {
        //given
        //when
        List<PatientEntity> patients = patientDao.findObesePatients(70);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients.count()).isEqualTo(1);
        assertThat(patients[0].getLastName()).isEqualTo('Malysz');
    }


}
