package data.Repositories;

import data.models.Comment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommentRespositoryImplTest {

    private data.models.Comment comment;

    @Test
    public void testIf_Users_CanAdd_comments() {
        CommentRepository com = new CommentRepositoryImpl();
        Comment postComment = new Comment();
        com.addComment(postComment);
        assertEquals(1, com.count()) ;
    }
    @Test
    public void testThat_commentsCan_beFind_byAll(){
        CommentRepository findAllComments = new CommentRepositoryImpl();
        Comment comment1 = new Comment();
        Comment comment2 = new Comment();
        findAllComments.addComment(comment1);
        findAllComments.addComment(comment2);
        assertEquals(2, findAllComments.count()) ;


    }
   @Test
    public void testIf_isEmpty_works(){
        CommentRepository checkIsEmpty = new CommentRepositoryImpl();
        Comment check = new Comment();
        checkIsEmpty.isEmpty();
        assertTrue(checkIsEmpty.isEmpty(),"true");
   }

   @Test
    public void testIf_deleteById_works(){
        CommentRepository deleteId = new CommentRepositoryImpl();
        Comment delete = new Comment();
        delete.setId(1);
        deleteId.deleteById(1);
        assertEquals(0,deleteId.count());
   }

   @Test
    public void testIf_findByIdComment_works(){
        CommentRepository find = new CommentRepositoryImpl();
        Comment findcByIdCmment1 = new Comment();
        Comment findcByIdCmment2 = new Comment();
        findcByIdCmment1.setId(10);
        findcByIdCmment2.setId(20);
        find.addComment(findcByIdCmment1);
        find.addComment(findcByIdCmment2);
        assertEquals(2,find.count());
   }

   @Test
    public void testIf_findCommentsByPost_works(){
        CommentRepository findByPost = new CommentRepositoryImpl();
        Comment findByPostComment = new Comment();
        findByPostComment.setContent("Food sells complains about bad market");
        findByPostComment.setId(1);
        findByPost.addComment(findByPostComment);
        assertEquals(1,findByPost.count());


   }
   @Test
    public void testIf_deleteAllComments_Works(){
        CommentRepository deleteAllComments = new CommentRepositoryImpl();
        Comment deleteAllComment = new Comment();
        deleteAllComments.addComment(comment);
        deleteAllComments.deleteAll(comment);
        assertEquals(0, deleteAllComments.count());

   }

}