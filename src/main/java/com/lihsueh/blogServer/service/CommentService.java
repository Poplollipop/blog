package com.lihsueh.blogServer.service;

import java.util.List;

import com.lihsueh.blogServer.entity.Comment;

public interface CommentService {
    Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentsById(Long postId);
}
