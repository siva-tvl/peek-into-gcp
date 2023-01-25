package com.bnym.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class SubjectMarks {
	private String subjectName;
	private Integer maxMarks;
	private Integer obtainedMarks;
	private String grade; 
	private Float percent;
	private String comments;
}
