package com.lihsueh.blogServer.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihsueh.blogServer.entity.Comment;
import com.lihsueh.blogServer.entity.Post;
import com.lihsueh.blogServer.repository.CommentRepository;
import com.lihsueh.blogServer.repository.PostRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostRepository postRepository;

    public Comment createComment(Long postId, String postedBy, String content) {
        Optional<Post> optionalPost = postRepository.findById(postId);
        if(optionalPost.isPresent()){
            Comment comment = new Comment();

            comment.setPost(optionalPost.get());
            comment.setContent(content);
            comment.setPostedBy(postedBy);
            comment.setCreatedAt(new Date());

            return commentRepository.save(comment);
        }
        throw new EntityNotFoundException("找不到此文章");
    }


    public List<Comment> getCommentsById(Long postId){
        return commentRepository.findByPostId(postId); 
    }






}
