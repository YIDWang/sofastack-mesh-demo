package com.alipay.sofa.ms.spring.cloud.reservation.client.service;

import com.alipay.sofa.ms.service.Request;
import com.alipay.sofa.ms.service.Response;
import org.springframework.stereotype.Service;

/**
 * @author zxy
 * @date 2020-09-09 17:37
 **/
@Service
public class BenchmarkServiceFallback implements BenchmarkService {
    @Override
    public Response request(Request req) {
        Response response = new Response();
        response.setSuccess(false);
        return response;
    }

    @Override
    public Response clearAndReset() {
        Response response = new Response();
        response.setSuccess(false);
        return response;
    }
}
