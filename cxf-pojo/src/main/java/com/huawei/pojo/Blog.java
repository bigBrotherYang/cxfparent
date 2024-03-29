package com.huawei.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Blog")
public class Blog {
    private Integer bId;

    private Integer userId;

    private Integer type;

    private String context;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}