package Services;



import data.Repositories.PostRepositoryImpl;
import data.models.Post;


public class PostServicesImpl implements PostServices{
    PostRepositoryImpl postRepository = new PostRepositoryImpl();
    @Override
    public Post addPost(String title, String content) {
        Post post = new Post();
        post.setId(generateId());
        post.setTitle(title);
        post.setContent(content);
        return postRepository.save(post);
    }

    public boolean titleExists(String title) {
        for (Post post : postRepository.findAll()) {
            if (post.getTitle().equals(title)) {
                return true;
            }

        }
        return false;
    }
    @Override
    public Post findPostById(int id) {
        return postRepository.findById(id);
    }

    private  int generateId(){
        return postRepository.findAll().size()+1;
    }
}
