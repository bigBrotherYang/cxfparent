package com.huawei.webservice;

import com.huawei.tool.JsonObject;

import javax.jws.WebService;

@WebService
public interface IBlogService {


    public JsonObject getBlogs();

    JsonObject getApiBlog();
}
