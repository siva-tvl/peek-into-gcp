package com.bnym.dao;

import com.bnym.model.StudentInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentInformationDAO {
	private final JdbcTemplate jdbcTemplate;
	public void saveStudentInformation(StudentInformation studentTO) {
		return;
	}
}
