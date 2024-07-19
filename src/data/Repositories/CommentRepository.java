package data.Repositories;

import data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment addComment(Comment comment);
    List<Comment> findAll();
    boolean isEmpty();
    Comment findById(int id);
    Comment findByPost(int postId);
    Comment findByUsername(String username);
    void deleteAll(Comment comment);
    void deleteById(int id);
    void update(Comment comment);
    long count();

}
