package com.cheng.myblog.controller;

import com.cheng.myblog.pojo.Blog;
import com.cheng.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/index")
    public List<Blog> getAllBlog() {
        System.out.println("============"+blogService.getAllBlog());
        return blogService.getAllBlog();
    }

    @GetMapping("/details")
    public Object getOneBlog(Integer blogId){
        Map<Object,String > hashmap = new HashMap<>();
        if (blogId==null||blogId<=0){
            hashmap.put("message","博客异常，请重试！");
            System.out.println(hashmap);
            return hashmap;
        }
        Blog blog = blogService.getOneBlog(blogId);
        if (blog==null){
            hashmap.put("message","当前博客不存在!");
            System.out.println(hashmap);
            return hashmap;
        }
        System.out.println(blog);
        return blog;
    }
}
