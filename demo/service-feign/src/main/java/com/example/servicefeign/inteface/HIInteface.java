package com.example.servicefeign.inteface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="service-hi")
public interface HIInteface {
    @RequestMapping(value="/hi", method= RequestMethod.GET)
    String hi();
}
