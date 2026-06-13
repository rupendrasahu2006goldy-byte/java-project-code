import java.util.ArrayList;

class Post {
    private String content;
    private int likeCount;
    private ArrayList<String> comments;

    public Post(String content) {
        this.content = content;
        likeCount = 0;
        comments = new ArrayList<>();
    }

    public void incrementLike() {
        likeCount++;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void displayPost() {
        System.out.println("Post: " + content);
        System.out.println("Likes: " + likeCount);

        System.out.println("Comments:");
        for (String comment : comments) {
            System.out.println(comment);
        }

        System.out.println();
    }
}

class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void likePost(Post post) {
        post.incrementLike();
    }

    public void commentOnPost(Post post, String comment) {
        post.addComment(userName + ": " + comment);
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {

        User user1 = new User("Rohan");
        User user2 = new User("Aman");

        Post post1 = new Post("Hello World");
        Post post2 = new Post("Learning Java");

        user1.likePost(post1);
        user2.likePost(post1);

        user1.commentOnPost(post1, "Nice Post");
        user2.commentOnPost(post1, "Welcome");

        user1.likePost(post2);
        user2.likePost(post2);
        user2.likePost(post2);

        user1.commentOnPost(post2, "Great");
        user2.commentOnPost(post2, "Helpful Content");

        System.out.println("===== Social Media Feed =====\n");

        post1.displayPost();
        post2.displayPost();
    }
}
