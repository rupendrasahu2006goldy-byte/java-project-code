import java.util.ArrayList;

class Post {
    private String content;
        private int likeCount;

    
    public Post(String content) {
          this.content = content;
              likeCount = 0;
      }

   
    public void incrementLike() {
        likeCount++;
    }


    public void displayPost() {
            System.out.println("Post: " + content);
        System.out.println("Likes: " + likeCount);
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
}

public class SocialMediaApp {
    public static void main(String[] args) {

       
        User user1 = new User("Rohan");
        User user2 = new User("Aman");

        
        Post post1 = new Post("Hello World");
        Post post2 = new Post("Learning Java");

        user1.likePost(post1);
        user2.likePost(post1);

        user1.likePost(post2);
        user2.likePost(post2);
        user2.likePost(post2);

      
        System.out.println("===== Social Media Feed =====\n");

        post1.displayPost();
        post2.displayPost();
    }
}