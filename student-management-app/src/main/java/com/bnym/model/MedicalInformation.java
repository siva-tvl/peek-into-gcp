package com.bnym.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class MedicalInformation {
	private ContactDetails physician;
	private List<String> foodAllergies;
	private List<String> medicineAllergies;
	private String emergencyHospitalName;
	private List<String> healthConcerns;
	private String abhaNumber;
}
