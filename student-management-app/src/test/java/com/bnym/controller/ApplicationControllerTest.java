//package com.bnym.controller;
//
//import com.bnym.model.UserContext;
//import lombok.extern.log4j.Log4j2;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//@SpringBootTest
//@Log4j2
//@ActiveProfiles("test")
//class ApplicationControllerTest {
//    @Autowired
//    private ApplicationController controller;
//    private UserContext createUserContext(String userId){
//        UserContext userContext = new UserContext();
//        userContext.setUserId(userId);
//        return userContext;
//    }
//
//    @Test
//    void generateApplication() {
//        UserContext userContext = createUserContext("bob");
//
//        /*mvc.perform(get("/api/employees")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content()
//                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$[0].name", is("bob")));*/
//        String count = controller.createApplication(userContext);
//        log.info("Count equals:"  + count.equals("1"));
//    }
//
//    @Test
//    void retrieveApplication() {
//
//    }
//}