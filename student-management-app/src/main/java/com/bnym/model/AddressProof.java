package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AddressProof extends IdentityProof{
	private Address address;
	private String name;
	private String relation; 
}
