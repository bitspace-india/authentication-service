package com.bitspaceIndia.authenticationservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.post;

public class RegistrationController {


    private static Logger log = LoggerFactory.getLogger(RegistrationController.class);
    public static void init(){
        post("/register", (req,res) -> {
            log.info("req: {}", req.body());
            return req.body();
        });
    }
}
