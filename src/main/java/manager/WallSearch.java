package manager;

import domain.Post;

public class WallSearch {
    private int ownerId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int count;
    private PostManager postManager;


    public String Search() {
        Post[] posts = postManager.getPosts();
        return null;

    }


}
