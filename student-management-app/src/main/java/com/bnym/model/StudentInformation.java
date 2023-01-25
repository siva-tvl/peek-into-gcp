package com.bnym.model;

import com.bnym.annotations.GenerateTypeScript;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@GenerateTypeScript
@NoArgsConstructor
@EqualsAndHashCode
public class StudentInformation {

    private String studentId;

    private String firstName;
    private String middleName;
    private String lastName;

    private String regnNo;
    private String entryDate;

    //Aadhar
    private String aadhar;
    private String currentAddress;
    private String permAddress;

    private Date dateOfBirth;
    private String birthPlace;
    private String gender;
    //Should be in medical information
    private String bloodGroup;
    private int height; //in cm
    private int weight;

    private String nationality;
    private String religion;
    private String caste;
    private String subCaste;


    // SC/ST/ADI/Converted/Etc
    //private Map<String, Boolean> caste;

    private String lastAttendedClass;
    private String lastAttendedBoard;
    private String lastAttendedSchool;
    private String lastSchoolLeaveReason;
    private String lastSchoolMediumOfInstruction;
    //private Map<String, SubjectMarks> lastSubjectToMark;

    private Boolean isTransferCertificateSubmitted;
    private String admissionYear;
    private String motherTongue;
    private String mediumOfInstructionNeeded;

    /*

    private IdentityProof aadhar;
    private Address currentAddress;
    private Address permanentAddress;

    private RelativeInfo fathersInfo;
    private RelativeInfo mothersInfo;
    private RelativeInfo guardiansInfo;

    private List<Courses> electedCourses;
    private List<Elective> communityInterests;
    private List<Elective> extractcurricularInterests;
    private ContactDetails contactDetails;
    private MedicalInformation medicalInformation;

    private String signedPlace;
    private String signedDate;
    private String signedBy;
    */
    // School Confidential
    private String admissionNo;
    private Date date;
    private String medium;
    private String group;

}
