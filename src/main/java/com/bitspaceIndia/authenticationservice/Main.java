package com.bitspaceIndia.authenticationservice;

import com.bitspaceIndia.authenticationservice.controller.RegistrationController;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import static spark.Spark.*;


@Slf4j
public class Main {
    public static void main(String[] args) {
        RegistrationController.init();
    }
}