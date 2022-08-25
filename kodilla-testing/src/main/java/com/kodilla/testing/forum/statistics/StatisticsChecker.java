package com.kodilla.testing.forum.statistics;

public class StatisticsChecker {

    private int users = 0;
    private int posts = 0;
    private int comments = 0;
    private double avrPostsPerUser = 1;
    private double avrCommentsPerUser = 1;
    private double avrCommentsPerPost = 1;

    public void calculateAdvStatistics(Statistics statistics){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        avrPostsPerUser    = users == 0 ? 0 : (double)posts / users;
        avrCommentsPerUser = users == 0 ? 0 : (double)comments / users;
        avrCommentsPerPost = posts == 0 ? 0 : (double)comments / posts;

    }

    public void showStatistics(){
        System.out.println(toString());
    }

    public int getUsersCount() {
        return users;
    }

    public int getPostsCount() {
        return posts;
    }

    public int getCommentsCount() {
        return comments;
    }

    public double getAvrPostsPerUser() {
        return avrPostsPerUser;
    }

    public double getAvrCommentsPerUser() {
        return avrCommentsPerUser;
    }

    public double getAvrCommentsPerPost() {
        return avrCommentsPerPost;
    }

    @Override
    public String toString() {
        return "Statistics:" +
                "usersCount=" + users +
                ", postsCount=" + posts +
                ", commentsCount=" + comments +
                ", avrCountOfPostsPerUser=" + avrPostsPerUser +
                ", getAvrCountOfCommentsPerUser=" + avrCommentsPerUser +
                ", getAvrCountOfCommentsPerPost=" + avrCommentsPerPost;
    }
}