package com.hayes.base.hayesnacosconfigrefresh.ctrl;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hayes-nacos-config-refresh
 * @Class DemoController
 * @description: 关于此类的描述说明
 * @author: Mr.HayesLin
 * @create: 2021-12-10 13:26
 **/
@Log4j2
@RefreshScope
@RestController
public class DemoController {
    @Value("${name:Tom}")
    private String name;

    @Async
    @GetMapping("/demo")
    public String demo() {
        log.info("name: {}",name);
        return "hello: " + name;
    }

}
