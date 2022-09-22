package com.seanwang.harbor.service;

import com.seanwang.harbor.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
