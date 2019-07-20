package com.kingwarluo.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:启动类
 *
 * 命名规范
 *  spring官方提供的starter：
 *     sprint-boot-starter-xxx.x.y.z.jar
 *     spring-boot-xxx.autoconfigure.x.y.z.jar
 *  第三方jar命名规范：
 *     xxx-spring-boot-starter.x.y.z.jar
 *     xxx-spring-boot-autoconfigure.x.y.z.jar
 *
 * 自定义starter步骤：
 *      1、新建工程
 *      2、编写第三方jar包（例如本例中的mycommon）
 *      3、引入spring-boot-starter、spring-boot-autoconfigure、第三方jar包
 *      4、如需要生成配置元信息，需要引入spring-boot-configuration-processor依赖
 *      5、编写自动配置类
 *      6、配置发现配置文件：META_INF/spring.factories
 * @author jianhua.luo
 * @date 2019/7/20
 */
@SpringBootApplication
public class StarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }

}
