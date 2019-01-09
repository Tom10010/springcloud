package com.zht.feign.service;

import com.zht.feign.request.RequestURL;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
//@FeignClient(name = "service-hi", url = "127.0.0.1:8763")
public interface SchedualServiceHi {
    @GetMapping(value = RequestURL.SERVICE_HI)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
