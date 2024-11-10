package com.lihsueh.blogServer;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihsueh.blogServer.entity.Post;
import com.lihsueh.blogServer.repository.PostRepository;
import com.lihsueh.blogServer.service.PostService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        post.setLikeCount(0);
        post.setViewCount(0);
        post.setDate(new Date());

        return postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post gePostById(Long postId){
        Optional<Post> optionalPost = postRepository.findById(postId);
        if(optionalPost.isPresent()){
            Post post = optionalPost.get();
            post.setViewCount(post.getViewCount() + 1);
            return postRepository.save(post);
        }else{
            throw new EntityNotFoundException("並未找到貼文");
        }
    }

}
