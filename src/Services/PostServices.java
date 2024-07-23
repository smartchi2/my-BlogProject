package Services;

import data.models.Post;

public interface PostServices {
    Post addPost(String title, String content);
    Post findPostById(int id);
    boolean titleExists(String title);

}
