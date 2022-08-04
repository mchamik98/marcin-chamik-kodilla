package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Beginning of tests...");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests finished.");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        //When
        forumUser.addPost("forumuser",
                "First post");
        //Then
        Assertions.assertEquals(1,forumUser.getPostQuantity());
    }

    @Test
    void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First postt", "forumuser");
        //When
        forumUser.addComment(thePost, "forumuser", "First comment");
        //Then
        Assertions.assertEquals(1,forumUser.getCommentQuantity());
    }

    @Test
    void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First postt", "forumuser");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    void testGetComment(){

        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First post", "forumuser");
        ForumComment theComment = new ForumComment(thePost, "first comment", "forumuser");
        forumUser.addComment(thePost, thePost.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assertions.assertEquals(theComment, retrievedComment);

    }

    @Test
    void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First post", "forumuser");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assertions.assertFalse(result);

    }

    @Test
    void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First post", "forumuser");
        ForumComment theComment = new ForumComment(thePost, "first comment", "forumuser");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First post", "forumuser");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,forumUser.getPostQuantity());

    }

    @Test
    void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("forumuser", "John White");
        ForumPost thePost = new ForumPost("First post", "forumuser");
        ForumComment theComment = new ForumComment(thePost, "first comment", "forumuser");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentQuantity());

    }
}
