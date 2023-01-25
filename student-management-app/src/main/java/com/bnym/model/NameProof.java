package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class NameProof extends IdentityProof{
	private String firstName;
	private String middleName;
	private String lastName;
}
