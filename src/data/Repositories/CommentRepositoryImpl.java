package data.Repositories;

import data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private List<Comment> comments = new ArrayList<Comment>();


    @Override
    public Comment addComment(Comment comment) {
        comments.add(comment);
        return comment;
    }


    @Override
    public List<Comment> findAll() {
        for (Comment com : comments) {
            comments.add(com);
        }
        return comments;
    }

    @Override
    public boolean isEmpty() {
        if(!comments.isEmpty()){
            return false;
        }
        return true;
    }



    @Override
    public Comment findById(int id) {
        for (Comment com : comments) {
            if (com.getId() == id) {
                return com;
            }
        }
        return null;
    }

    @Override
    public Comment findByPost(int postId) {
        for (Comment com : comments) {
            comments.add(com);
            return com;

        }
        return null;
    }

    @Override
    public Comment findByUsername(String username) {
        return null;
    }

    @Override
    public void deleteAll(Comment comment) {
        comments.remove(comment);


    }

    @Override
    public void deleteById(int id) {
        for (Comment com : comments) {
            if (com.getId() == id) {
                comments.remove(com);
            }
        }

    }

    @Override
    public void update(Comment comment) {
        comments.add(comment);

    }

    @Override
    public long count() {
       return comments.size();
    }
}
