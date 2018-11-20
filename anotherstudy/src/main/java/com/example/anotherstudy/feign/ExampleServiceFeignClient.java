package com.example.anotherstudy.feign;


import com.example.anotherstudy.domain.ChargeRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "example", url = "http://101.132.74.234:8780/charge")
public interface ExampleServiceFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "")
    String getPayData(@RequestBody ChargeRequest chargeRequest, @RequestHeader(name = "Authorization") String authorization);
}
