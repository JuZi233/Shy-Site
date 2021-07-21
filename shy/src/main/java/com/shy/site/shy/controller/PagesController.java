/*
 * @Author: pan
 * @Date: 2021-05-24 14:30:30
 * @LastEditTime: 2021-05-24 14:41:18
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \mysite\shy\src\main\java\com\shy\site\shy\controller\PagesController.java
 */
package com.shy.site.shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
// @Api(value = "helloWolrd")
@RequestMapping(value = "/shy/pages")
@Slf4j
public class PagesController {
    @RequestMapping(value = "/toPage", produces = {"application/json"},
            method = RequestMethod.GET)
    // @ApiOperation(value = "helloWolrd", notes = "helloWolrd")
    public String toBlog(@RequestParam("url") String target) {
        log.info("go to page :" + target);
        return target;
    }
}
