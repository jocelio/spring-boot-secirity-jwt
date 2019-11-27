package com.example.demo3.rest.tests;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloPrivateResource {

    @RequestMapping(value = "/private", method = GET)
    public ResponseEntity<String> listar() {
        return new ResponseEntity<String>("private", OK);
    }
}
