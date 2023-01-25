package com.bnym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table
public class Application {
    @jakarta.persistence.Id
    private String applicationId;
    private String userId;

}
