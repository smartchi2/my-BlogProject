package data.Repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements MyPostRepository{
    private List<Post> blogpost = new ArrayList<Post>();
    @Override
    public Post save(Post post) {
        blogpost.add(post);
        return post;
    }

    @Override
    public Post findById(int id) {
        for (Post post : blogpost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        return blogpost;
    }

    @Override
    public void deleteAll(Post post) {
        blogpost.remove(post);

    }

    @Override
    public long count() {
       return blogpost.size();
    }

    @Override
    public void deleteById(int id) {
        if(findById(id) != null) {
            blogpost.remove(findById(id));
        }

    }
}
