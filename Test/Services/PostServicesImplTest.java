package Services;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServicesImplTest {

    @Test
    public void checkIf_titleIs_thesame(){
        PostServices service = new PostServicesImpl();

        service.addPost("A man", "am the man");
        service.addPost("B man", "b man in it");
        service.titleExists("A man");
        service.titleExists("A man");
        assertTrue(service.titleExists("A man"));
        assertFalse(service.titleExists("b man in it"));
    }

    @Test
    public void checkIf_postCan_beAdd(){
        PostServices canAdd = new PostServicesImpl();
        canAdd.addPost("A man", "am the man");
        canAdd.addPost("A the man of power", "you know that");
        Post post = canAdd.findPostById(2);
        assertEquals(post.getTitle(),"A the man of power");
    }

    @Test
    public void checkIf_postCan_beFindById(){
        PostServices findById = new PostServicesImpl();
        findById.addPost("latest New", "dollars price drops");
        assertEquals(findById.findPostById(1).getTitle(),"latest New");
    }



}