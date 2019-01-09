package com.server_ribbon.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
//
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        log.info(">>>>>>>>>>>>>>>>>this is hiService in server_ribbon");
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name){
        log.info(">>>>>>>>>>>>>>>>>this is hiError in server_ribbon");
        return "hi "+name+",sorry,error";
    }

}
