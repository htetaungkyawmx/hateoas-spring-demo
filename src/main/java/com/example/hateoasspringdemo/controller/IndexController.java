package com.example.hateoasspringdemo.controller;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public RepresentationModel index(){
        RepresentationModel resourceSupport=new RepresentationModel();

        resourceSupport.add(Link.of("http://localhost:8080/","index"));
        resourceSupport.add(Link.of("http://localhost:9090/","customers"));

        return resourceSupport;
    }
}
