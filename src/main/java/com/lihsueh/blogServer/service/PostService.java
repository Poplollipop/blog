package com.lihsueh.blogServer.service;

import java.util.List;

import com.lihsueh.blogServer.entity.Post;

public interface PostService {
    
    Post savePost(Post post);

    public List<Post> getAllPosts();

    Post gePostById(Long postId);

}
