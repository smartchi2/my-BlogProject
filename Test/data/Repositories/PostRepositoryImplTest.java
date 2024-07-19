package data.Repositories;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {

    @Test
    public void Test_If_Post_Was_Saved(){
        MyPostRepository addUpPost = new PostRepositoryImpl();
        Post find = new Post();
        find.setId(1);
        find.setTitle("Daily Gist");
        find.setContent("We will get the people a better place, Says tinubu");
        addUpPost.save(find);
        assertEquals(1, addUpPost.count());

    }

    @Test
    public void Test_If_All_Blog_Post_Can_Be_Find(){
        MyPostRepository addUpPost = new PostRepositoryImpl();
        Post findAll1 = new Post();
        Post findAll2 = new Post();
        findAll1.setId(10);
        findAll2.setId(11);
        findAll1.setTitle("Daily Gist");
        findAll2.setContent("Daily Sports");
        addUpPost.save(findAll1);
        addUpPost.save(findAll2);
        assertEquals(2, addUpPost.count());
    }

    @Test
    public void Test_If_Post_Was_Deleted_All(){
        MyPostRepository deleteAllPost = new PostRepositoryImpl();
        Post deleteAll1 = new Post();
        Post deleteAll2 = new Post();
        deleteAll1.setId(10);
        deleteAll2.setId(11);
        deleteAll1.setTitle("Daily Gist");
        deleteAll2.setTitle("Daily Sports");
        deleteAll1.setContent("Daily Sports");
        deleteAll2.setContent("Daily Sports");
        deleteAllPost.deleteAll(deleteAll1);
        deleteAllPost.deleteAll(deleteAll2);
        assertEquals(0, deleteAllPost.count());
    }

    @Test
    public void Test_if_post_can_be_deleted_by_Id(){
        MyPostRepository delete12 = new PostRepositoryImpl();
        Post delete1 = new Post();
        delete1.setId(11);
        delete12.save(delete1);
        delete12.deleteById(11);
        assertEquals(0, delete12.count());
    }

}