package com.huawei.dao;

import com.huawei.pojo.Blog;

import java.util.List;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);


    List<Blog> getBlogs();
}