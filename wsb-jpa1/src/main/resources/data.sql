insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (2, 'Kawowa', '2', 'Lasek', '30-139');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (3, 'Herbaciana', '15/5', 'Laczka', '31-111');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (4, 'Lesna', '33', 'Lasek', '30-136');
insert into patient (id, adress_id, firstName, lastName, telephoneNumber, email, patientNumber, dateOfBirth, weight)
            values (1, 3, 'Adam', 'Malysz', '123678098', 'adam123@mail.com','1', '1977-12-03', '88');
insert into patient (id, adress_id, firstName, lastName, telephoneNumber, email, patientNumber, dateOfBirth, weight)
            values (2,1,'Antonina', 'Dybicka', '098654523', 'antonina00@mail.com','2', '1999-01-29', '56');
insert into doctor (id, adress_id, firstName, lastName, telephoneNumber, email, doctorNumber, specialization)
            values (1, 2, 'Hanna', 'Mocha', '876543098', 'hannaM@mail.com', 1, GP);
insert into doctor (id, adress_id, firstName, lastName, telephoneNumber, email, doctorNumber, specialization)
            values (2, 4, 'Zofia', 'Polana', '999087111', 'zofia@mail.com', 2, DERMATOLOGIST);
insert into visit (id, patient_id, doctor_id, description, time)
            values (1, 1, 1, 'Podejrzenie zlamania kosci piszczelowej nogi lewej', 2024-07-10);
insert into visit (id, patient_id, doctor_id, description, time)
            values (2, 2, 2, 'Wysypka na prawym przedramieniu', 2023-09-30);
insert into visit (id, patient_id, doctor_id, description, time)
            values (3, 2, 2, 'Konsultacja', 2024-01-12);
insert into medical_treatment (id, visit_id, description, type)
            values (1,1, 'RTG nogi lewej', RTG);