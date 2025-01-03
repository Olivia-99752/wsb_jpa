package com.jpacourse.mapper;

import com.jpacourse.dto.AddressTO;
import com.jpacourse.dto.PatientTO;
import com.jpacourse.dto.VisitTO;
import com.jpacourse.persistence.entity.AddressEntity;
import com.jpacourse.persistence.entity.MedicalTreatmentEntity;
import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.entity.VisitEntity;
import com.jpacourse.persistence.enums.TreatmentType;

import java.util.List;

public final class PatientMapper
{

    public static PatientTO mapToTO(final PatientEntity patientEntity)
    {
        if (patientEntity == null)
        {
            return null;
        }
        final PatientTO patientTO = new PatientTO();
        patientTO.setId(patientEntity.getId());
        patientTO.setFirstName(patientEntity.getFirstName());
        patientTO.setLastName(patientEntity.getLastName());
        patientTO.setWeight(patientEntity.getWeight());

        final List<VisitEntity> visits = patientEntity.getVisits();
        final List<VisitTO> visitsTO = visits.stream().map(visitEntity -> new VisitTO(
                visitEntity.getId(),
                visitEntity.getTime(),
                visitEntity.getDoctor().getFirstName() + " " + visitEntity.getDoctor().getLastName(),
                visitEntity.getMedicalTreatments().stream().map(MedicalTreatmentEntity::getType).toList()
                )
        ).toList();


        patientTO.setVisits(visitsTO);
        return patientTO;
    }

    public static PatientEntity mapToEntity(final PatientTO patientTO)
    {
        if(patientTO == null)
        {
            return null;
        }
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientTO.getId());
        patientEntity.setFirstName(patientTO.getFirstName());
        patientEntity.setLastName(patientTO.getLastName());
        patientEntity.setWeight(patientTO.getWeight());
        return patientEntity;
    }
}
