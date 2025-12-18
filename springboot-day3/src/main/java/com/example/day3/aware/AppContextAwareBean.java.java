package com.example.day3.aware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppContextAwareBean implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        log.info("ApplicationContextAware → Bean count: {}",
                applicationContext.getBeanDefinitionCount());
    }
}
