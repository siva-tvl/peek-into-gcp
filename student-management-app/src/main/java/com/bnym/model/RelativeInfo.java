package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class RelativeInfo {
	private String name;
	private String relation;
	private String occupation;
	private Integer income;
	private ContactDetails contactDetails;
	private NameProof nameProof;
	private AddressProof addressProof;
}
