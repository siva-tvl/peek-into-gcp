package com.bnym.dao;

import com.bnym.model.Application;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ApplicationDAO {
    private String applicationInsert = "insert into application values(? ,?  )";
    private String applicationUpdate = "update application set updateTs=? where applicationId=?";
    private final JdbcTemplate jdbcTemplate;
    public int createApplication(Application application) {
        int count = jdbcTemplate.update(applicationInsert, application.getApplicationId(), application.getUserId());
        return count;
    }

    public int updateApplication(Application application) {
        int count = jdbcTemplate.update(applicationUpdate, application.getUserId(), application.getApplicationId());
        return count;
    }
}
