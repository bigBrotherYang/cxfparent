package com.huawei.controller;

import com.huawei.api.IBlog;
import com.huawei.tool.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlog blog;
    @RequestMapping("/findall")
    @ResponseBody
    public JsonObject getBlog(){
        return blog.getBlogs();
    }
}
