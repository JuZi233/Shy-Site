/*
 * @Author: shy
 * @Date: 2021-05-19 15:46:57
 * @LastEditTime: 2021-05-20 17:19:13
 * @LastEditors: Please set LastEditors
 * @Description: test start
 * @FilePath: \mysite\shy\src\main\java\com\shy\site\shy\controller\HelloWorld.java
 */
package com.shy.site.shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// import io.swagger.annotations.Api;
// import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Controller
// @Api(value = "helloWolrd")
@RequestMapping(value = "/shy/test")
@Slf4j
public class HelloWorld {
    
    @RequestMapping(value = "/hello", produces = {"application/json"},
            method = RequestMethod.GET)
    // @ApiOperation(value = "helloWolrd", notes = "helloWolrd")
    public String helloWorld() {
        System.out.println("你没有mm");
        log.info("hello wolrd");
        return "home";
    }
}
