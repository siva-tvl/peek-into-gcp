create table user_info(
    userId varchar(36) not null,
    name varchar(36) not null
);

create table application (
    applicationId VARCHAR(36) not null,
    userId VARCHAR(36) not null,
    createTs TIMESTAMP ,
    updateTs TIMESTAMP
);

--
--create table student(
--	studentId varchar(50) primary key,
--	applicationId varchar(50),
--	firstName varchar(50),
--	middleName varchar(50),
--	lastName varchar(50),
--	regnNo varchar(50),
--	entryDate varchar(50),
--	aadhar varchar(50),
--	currentAddress varchar(50),
--	permAddress varchar(50),
--	birthDate varchar(50),
--	birthPlace varchar(50),
--	gender varchar(50),
--	height varchar(50),
--	weight varchar(50),
--	nationality varchar(50),
--	religion varchar(50),
--	caste varchar(50),
--	subCaste varchar(50),
--	CONSTRAINT FK_APP_ID FOREIGN KEY (applicationId) REFERENCES application(applicationId),
--	CONSTRAINT PK_STUDENT PRIMARY_KEY(studentId)
--);

--create table school (
--    id                    VARCHAR(10) not null,
--    name                  VARCHAR(80) not null,
--    address_line_1        VARCHAR(50) not null,
--    address_line_2        VARCHAR(50),
--    address_line_3        VARCHAR(50),
--    city                  VARCHAR(20) not null,
--    state                 VARCHAR(15) not null,
--    pin_code              INTEGER(6) not null,
--    contact_number_1      INTEGER(15) not null,
--    contact_number_2      INTEGER(15),
--    contact_number_3      INTEGER(15),
--    email_address         VARCHAR(50) not null,
--    date_of_inception     DATE not null
--);
--alter table school add constraint pk_school primary key (id);
--
--create table application (
--    id                               VARCHAR(10) not null,
--    school_id                        VARCHAR(36) not null,
--    first_name                       VARCHAR(30) not null,
--    middle_name                      VARCHAR(30),
--    last_name                        VARCHAR(30),
--    date_of_birth                    DATE not null,
--    gender                           VARCHAR(10) not null,
--    mother_tongue                    VARCHAR(10) not null,
--    nationality                      VARCHAR(20) not null,
--    religion                         VARCHAR(20) not null,
--    community                        VARCHAR(3) not null,
--    father_first_name                VARCHAR(30),
--    father_middle_name               VARCHAR(30),
--    father_last_name                 VARCHAR(30),
--    father_date_of_birth             DATE,
--    mother_first_name                VARCHAR(30),
--    mother_middle_name               VARCHAR(30),
--    mother_last_name                 VARCHAR(30),
--    mother_date_of_birth             DATE,
--    guardian_first_name              VARCHAR(30),
--    guardian_middle_name             VARCHAR(30),
--    guardian_last_name               VARCHAR(30),
--    guardian_date_of_birth           DATE,
--    guardian_gender                  VARCHAR(10),
--    address_line_1                   VARCHAR(50) not null,
--    address_line_2                   VARCHAR(50),
--    address_line_3                   VARCHAR(50),
--    district                         VARCHAR(50) not null,
--    taluk                            VARCHAR(50),
--    city                             VARCHAR(20) not null,
--    state                            VARCHAR(15) not null,
--    pin_code                         INTEGER(6) not null,
--    contact_number_1                 INTEGER(15) not null,
--    contact_number_2                 INTEGER(15),
--    school_last_attended             VARCHAR(50),
--    class_last_attended              INTEGER(2),
--    board_name                       VARCHAR(10),
--    reason_for_leaving               VARCHAR(100),
--    tc_available                     VARCHAR(1),
--    tc_details                       VARCHAR(100),
--    prev_medium_of_instruction       VARCHAR(15),
--    req_medium_of_instruction        VARCHAR(15),
--    class_applied_for                INTEGER(2) not null,
--    course_applied_for               VARCHAR(10),
--    extra_curricular                 VARCHAR(50),
--    community_service_member         VARCHAR(50),
--    aadhar_number                    INTEGER(12) not null,
--    id_address_proof_1               VARCHAR(10) not null,
--    id_address_proof_1_location      VARCHAR(50) not null,
--    id_address_proof_2               VARCHAR(10),
--    id_address_proof_2_location      VARCHAR(50),
--    id_address_proof_3               VARCHAR(10),
--    id_address_proof_3_location      VARCHAR(50),
--    id_address_proof_4               VARCHAR(10),
--    id_address_proof_4_location      VARCHAR(50),
--    id_address_proof_5               VARCHAR(10),
--    id_address_proof_5_location      VARCHAR(50),
--);
--alter table application add constraint pk_application primary key (id);
--alter table application add constraint fk_appl_course references course(id);
--
--create table appl_prev_year_mark (
--    application_id             VARCHAR(10) not null,
--    subject_id                 VARCHAR(10) not null,
--    marks                      INTEGER(3) not null
--);
--alter table application_subject_marks add constraint fk_appl_prev_year_mark_1 references application(id);
--alter table application_subject_marks add constraint fk_appl_prev_year_mark_2 references subject(id);
--
--create table course (
--    id                        VARCHAR(10) not null,
--    name                      VARCHAR(20) not null,
--    subject_id                VARCHAR(10) not null
--);
--alter table course add constraint pk_course primary key (id);
--alter table course add constraint fk_course_subject references subject(id);
--
--create table subject (
--    id                        VARCHAR(10) not null,
--    name                      VARCHAR(15) not null
--);
--alter table subject add constraint pk_subject primary key (id);


create table student (
    id                         VARCHAR(10) not null,
    school_id                  VARCHAR(36) not null,
    first_name                 VARCHAR(30) not null,
    middle_name                VARCHAR(30),
    last_name                  VARCHAR(30),
    date_of_birth              DATE not null,
    gender                     VARCHAR(10) not null,
    class                      INTEGER(2) not null,
    class_section              VARCHAR(1) not null,
    nationality                VARCHAR(20) not null,
    religion                   VARCHAR(20) not null,
    father_first_name          VARCHAR(30),
    father_middle_name         VARCHAR(30),
    father_last_name           VARCHAR(30),
    father_date_of_birth       DATE,
    mother_first_name          VARCHAR(30),
    mother_middle_name         VARCHAR(30),
    mother_last_name           VARCHAR(30),
    mother_date_of_birth       DATE,
    guardian_first_name        VARCHAR(30),
    guardian_middle_name       VARCHAR(30),
    guardian_last_name         VARCHAR(30),
    guardian_date_of_birth     DATE,
    guardian_gender            VARCHAR(10)
);
alter table student add constraint pk_student primary key (id);
