package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Address {
	private String flat;
	private String building;
	private String address1;
	private String address2;
	private String address3;
	private String landmark;
	private String city;
	private String taluka;
	private String district;
	private String state;
}
