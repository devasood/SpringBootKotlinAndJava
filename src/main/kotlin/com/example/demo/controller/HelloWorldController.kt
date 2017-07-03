package com.example.demo.controller

import mu.KLogging
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by devashishsood on 03/07/17.
 */

@RestController
class HelloWorldController {
    companion object : KLogging()

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET), produces = arrayOf("application/json"))
    fun sayHello(): String {
        logger.info("************************************Inside Hello World")
        return "Hello World! Kotlin Here"
    }
}
