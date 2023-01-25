package com.bnym.controller;

import com.bnym.model.StudentInformation;
import com.bnym.model.UIResponse;
import com.bnym.model.UserContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Service
@RequestMapping("/")
@CrossOrigin
public class StudentInformationController {
    @RequestMapping("/healthStatus")
    public UIResponse healthStatus() {
		UIResponse<String> uiResponse = new UIResponse<>("UP",1,"");
		return uiResponse;
    }

    // Has to be Penetration Tested for outages
    // Needs to be run through Scans to validate vulnerabilities


    @GetMapping("/saveStudentInfo")
    public String saveStudentInfo(@RequestBody UserContext context, @RequestBody StudentInformation studentInformation, String applicationId) {
        return "";
    }

    @GetMapping("/retrieveStudentInfo")
    public String retrieveStudentInfo(@RequestBody UserContext context, @RequestBody StudentInformation studentInformation, String applicationId) {
        return "";
    }
}
