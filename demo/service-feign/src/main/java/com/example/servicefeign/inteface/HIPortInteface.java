package com.example.servicefeign.inteface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="service-hi2")
public interface HIPortInteface {
    @RequestMapping(value="/getPort", method= RequestMethod.GET)
    String getPort();
}
