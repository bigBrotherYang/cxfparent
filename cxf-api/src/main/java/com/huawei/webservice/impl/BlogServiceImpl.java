package com.huawei.webservice.impl;

import com.huawei.api.IBlog;
import com.huawei.dao.BlogMapper;
import com.huawei.tool.JsonObject;
import com.huawei.webservice.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces("*/*")//产生(可以省略,在具体方法中添加)
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private IBlog iBlog;

    @GET
    @Produces({MediaType.APPLICATION_JSON, "text/html; charset=UTF-8" })
    @Consumes({ "application/xml", "application/json" })    @Path("/blogs")
    @Override
    public JsonObject getBlogs() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.setResult(blogMapper.getBlogs());

        return jsonObject;
    }
    @GET
    @Produces({MediaType.APPLICATION_JSON, "text/html; charset=UTF-8" })
    @Path("/apiblogs")
    @Override
    public JsonObject getApiBlog() {
        return iBlog.getBlogs();
    }


}
