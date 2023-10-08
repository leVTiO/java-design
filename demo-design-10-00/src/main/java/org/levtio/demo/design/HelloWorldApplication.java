package org.levtio.demo.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
/**
 * @Author: LuoMingDong
 * @Date: 2023/10/8  10:03
 * @Describe:
 */
@SpringBootApplication
@Configuration
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
