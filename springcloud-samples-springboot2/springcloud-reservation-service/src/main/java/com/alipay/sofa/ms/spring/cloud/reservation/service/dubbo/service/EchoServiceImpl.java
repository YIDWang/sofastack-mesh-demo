/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.sofa.ms.spring.cloud.reservation.service.dubbo.service;

import com.alipay.sofa.ms.service.ShuPianEchoService;
import com.alipay.sofa.ms.spring.cloud.reservation.service.controller.ConfigController;
import com.alipay.sofa.ms.spring.cloud.reservation.service.utils.NetworkUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yiji@apache.org
 * @version : EchoServiceImpl.java, v 0.1 2020年02月24日 2:47 下午 yiji Exp $
 */
public class EchoServiceImpl implements ShuPianEchoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoServiceImpl.class);

    @Autowired
    private ConfigController configController;

    public String echo(String message) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String ip = NetworkUtils.getLocalIp();
        String msg = "[" + now + "] Hello " + message
                + ", request from consumer, this is dubbo service EchoService " + ip;
        LOGGER.info(msg);
        configController.execute("echo");
        return msg;
    }

}