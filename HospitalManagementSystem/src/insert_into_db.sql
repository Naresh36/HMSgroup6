INSERT INTO `hospital_maanagement`.`doctor` (`id`, `name`, `age`, `gender`, `specialization`, `contact_no`) VALUES ('101', 'sam', '52', 'M', 'orthopedics', '936574151');
INSERT INTO `hospital_maanagement`.`doctor` (`id`, `name`, `age`, `gender`, `specialization`, `contact_no`) VALUES ('102', 'jhon', '32', 'M', 'dermatology', '952003145');
INSERT INTO `hospital_maanagement`.`doctor` (`id`, `name`, `age`, `gender`, `specialization`, `contact_no`) VALUES ('103', 'ria', '29', 'F', 'gynecology', '987451020');
INSERT INTO `hospital_maanagement`.`doctor` (`id`, `name`, `age`, `gender`, `specialization`, `contact_no`) VALUES ('104', 'ram', '63', 'M', 'rediology', '687495120');
INSERT INTO `hospital_maanagement`.`doctor` (`id`, `name`, `age`, `gender`, `specialization`, `contact_no`) VALUES ('105', 'sham', '45', 'M', 'pediatrics', '6987547120');


INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('287', '10:00', '10:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('288', '10:20', '10:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('289', '10:40', '11:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('290', '11:00', '11:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('291', '11:20', '11:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('292', '11:40', '12:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('293', '12:00', '12:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('294', '12:20', '12:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('295', '12:40', '13:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('296', '13:00', '13:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('297', '13:20', '13:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('298', '13:40', '14:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('299', '14:00', '14:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('300', '14:20', '14:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('301', '14:40', '15:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('302', '15:00', '15:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('303', '15:20', '15:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('304', '15:40', '16:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('305', '16:00', '16:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('306', '16:20', '16:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('307', '16:40', '17:00');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('308', '17:00', '17:20');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('309', '17:20', '17:40');
INSERT INTO `hospital_maanagement`.`slot` (`id`, `from`, `to`) VALUES ('310', '17:40', '18:00');


INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('401', '101', '501');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('402', '102', '502');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('403', '103', '503');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('404', '104', '504');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('405', '105', '505');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('406', '104', '506');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('407', '102', '507');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('408', '101', '508');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('409', '101', '509');
INSERT INTO `hospital_maanagement`.`patient_history` (`id`, `doctor_id`, `patient_id`) VALUES ('410', '105', '510');


INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('601', '501', '101', '290');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('602', '502', '104', '291');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('603', '503', '102', '292');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('604', '504', '103', '293');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('605', '505', '105', '294');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('606', '506', '101', '295');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('607', '507', '104', '296');
INSERT INTO `hospital_maanagement`.`appointment` (`id`, `patient_id`, `doctor_id`, `slot_id`) VALUES ('608', '508', '102', '297');