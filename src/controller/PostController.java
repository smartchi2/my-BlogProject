package controller;

import Services.PostServicesImpl;
import data.models.Post;

public class PostController {
    PostServicesImpl postService = new PostServicesImpl();

    public String  createPost(String title,  String content) {
        Post post = postService.addPost(title, content);
        return post.toString();
    }

    public Post getPost(int id) {
        Post post = postService.findPostById(id);
        return post;
    }
}
