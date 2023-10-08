package org.levtio.demo.design.door.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: LuoMingDong
 * @Date: 2023/10/8  10:52
 * @Describe:
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    @Autowired
    private StarterServiceProperties starterServiceProperties;
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "levtio.door", value = "enabled", havingValue = "true")
    StarterService starterService(){
        return new StarterService(starterServiceProperties.getUserStr());
    }
}
