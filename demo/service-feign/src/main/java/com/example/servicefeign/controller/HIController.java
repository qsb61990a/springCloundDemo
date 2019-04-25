package com.example.servicefeign.controller;

import com.example.servicefeign.inteface.HIInteface;
import com.example.servicefeign.inteface.HIPortInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HIController {
    @Autowired
    private HIInteface hIInteface;
    @Autowired
    private HIPortInteface hIPortInteface;

    @RequestMapping("/hi")
    public String hi(){
        return hIInteface.hi();
    }

    @RequestMapping("/getPort")
    public String getPort(){
        return hIPortInteface.getPort();
    }
}
