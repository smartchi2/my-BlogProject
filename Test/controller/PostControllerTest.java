package controller;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostControllerTest {

    @Test
    public void testIf_PostCan_beCreated(){
        PostController postController = new PostController();
        postController.createPost("Latest News", "a man was killed my his wife");
        Post post = postController.getPost(1);
        assertEquals("Latest News", post.getTitle());
    }
   @Test
    public void testIf_PostCan_beFindById(){
        PostController postById = new PostController();
        postById.createPost("Man on fire", "a man was killed my his wife");
        Post post = postById.getPost(1);
        postById.createPost("war in africa", "we learnt that the african government are not trying");
        Post post1 = postById.getPost(2);
        assertEquals(2, postById.getPost(2).getId());

   }

}