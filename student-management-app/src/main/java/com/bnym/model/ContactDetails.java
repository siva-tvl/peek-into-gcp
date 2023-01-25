package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ContactDetails {
	private String emailId;
	private String contactNumber;
	private String alternateContactNumber;
	private String contactName;
	private String relation;
}
