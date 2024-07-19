package data.Repositories;

import data.models.Post;

import java.util.List;

public interface MyPostRepository {
    Post save(Post post);
    Post findById(int id);
    List<Post> findAll();
    void deleteAll(Post post);
    long count();
    void deleteById(int id);

}
