package com.gysoft.springboothello.controlller;

import com.gysoft.springboothello.com.gysoft.bean.Properties;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/5/28 13:39
 */

@RequestMapping("/properties")
@RestController
public class PropertiesController {


    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);


    private final Properties properties;

    @Autowired
    public PropertiesController(Properties properties) {

        this.properties = properties;
    }


    @GetMapping("/1")
    public Properties getMyProperties() {

        log.info("=================================================================================================");
        log.info(properties.toString());
        log.info("=================================================================================================");
        return properties;
    }
}
