package com.cheng.myblog.mapper;

import com.cheng.myblog.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogMapper {
    List<Blog> getAllBlog();
    
    Blog getBlogByBid(Integer blogId);
    
    void postBlog(Blog blog);
    
    void deleteBlog(Integer blogId);
    
    void updateBlog(Blog blog);
    
    List<Blog> getAllBlogById();

    Blog getOneBlog(Integer blogId);
}

