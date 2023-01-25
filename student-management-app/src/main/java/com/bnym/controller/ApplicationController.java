package com.bnym.controller;

import com.bnym.dao.ApplicationDAO;
import com.bnym.model.Application;
import com.bnym.model.UserContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Service
@RequestMapping("/")
@CrossOrigin
public class ApplicationController {
    private final ApplicationDAO applicationDAO;

    @GetMapping("/createApplication")
    public String createApplication(@RequestBody UserContext context) {
        // Will return an application id for the requestedUser
        // Will need maker checker that the application requestor is the same as the user context when retrieving
        String id = UUID.randomUUID().toString();
        Application application = new Application();
        application.setApplicationId(id);
        application.setUserId(context.getUserId());
        /*
        application.setCreateTs(new Timestamp(System.currentTimeMillis()));
        application.setUpdateTs(new Timestamp(System.currentTimeMillis()));
         */
        // Generate UUId ON DB vs local
        int count = applicationDAO.createApplication(application);
        // Application-> applicationId, userId primaryKey, createTs, updateTs
        return id;
    }

    @GetMapping("/retrieveApplication")
    public String retrieveApplication(@RequestBody UserContext context, String applicationId) {
        // Will return an application id for the requestedUser
        // Will need maker checker that the application requestor is the same as the user context when retrieving
        String id = UUID.randomUUID().toString();
        // Generate UUId ON DB vs local
        // Application-> applicationId, userId primaryKey, createTs, updateTs
        return id;
    }
}
