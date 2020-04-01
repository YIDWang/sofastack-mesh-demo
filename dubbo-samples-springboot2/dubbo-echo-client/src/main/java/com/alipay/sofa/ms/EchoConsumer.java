/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.sofa.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yiji@apache.org
 * @version : EchoConsumer.java, v 0.1 2020年02月24日 4:23 下午 yiji Exp $
 */
@SpringBootApplication
@ImportResource("spring/echo-consumer.xml")
public class EchoConsumer {

    public static void main(String[] args) {
        SpringApplication.run(EchoConsumer.class, args);
    }
}