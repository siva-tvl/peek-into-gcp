package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class IdentityProof {

	protected String idType;
	protected String idValue;
	protected String path; // location of identity proof - should be cloud storage

}
