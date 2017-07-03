package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by devashishsood on 03/07/17.
 */
@RestController
public class HelloJavaController {
    @RequestMapping(value = "/java", method = RequestMethod.GET, produces = "application/json")
    public String sayHelloWorld() {
        return "Hello World from Java!";
    }
}
