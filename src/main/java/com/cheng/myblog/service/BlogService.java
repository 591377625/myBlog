package com.cheng.myblog.service;

import com.cheng.myblog.mapper.BlogMapper;
import com.cheng.myblog.pojo.Blog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogService {
    @Resource
    private BlogMapper blogMapper;

    public List<Blog> getAllBlog(){
        return blogMapper.getAllBlog();
    }

    public Blog getBlogByBid(Integer blogId){
        return blogMapper.getBlogByBid(blogId);
    }

    public void postBlog(Blog blog) {
        blogMapper.postBlog(blog);
    }

    public void deleteBlog(Integer blogId){
        blogMapper.deleteBlog(blogId);
    }

    public void updateBlog(Blog blog){
        blogMapper.updateBlog(blog);
    }

    public List<Blog> getAllBlogById(){
        return blogMapper.getAllBlogById();
    }

    public Blog getOneBlog(Integer blogId) {
        return blogMapper.getOneBlog(blogId);
    }
}
