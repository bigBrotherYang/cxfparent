package com.huawei.api.Impl;

import com.huawei.api.IBlog;
import com.huawei.dao.BlogMapper;
import com.huawei.tool.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogImpl implements IBlog {
    @Autowired
    private BlogMapper blogMapper;


    @Override
    public JsonObject getBlogs() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.setResult(blogMapper.getBlogs());

        return jsonObject;
    }
}
