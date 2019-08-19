package com.xiao.test.web.page;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc 健康页
 *
 * @author xiaoqiang
 * @data 2019/3/20
 */
@RequestMapping
@RestController
public class Hs {
    @PostMapping("/hs")
    @ApiOperation("健康页")
    public String hs() {
        return "OK1";
    }
}
