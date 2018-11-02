package com.bonus.exerices;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    static Forum instace = null;
    List<Entry> forumTopics = new ArrayList<>();


    private Forum() {}
    public static Forum getInstace() {
        if(instace == null){
            instace = new Forum();
        }
        return instace;
    }


    public static void main(String[] args) {
        init();
    }


    private static void init(){
        Forum forum = Forum.getInstace();
        Entry firstTopic = new Topic("topic1", "message1");
        Entry firstComment = new Comment("first moderated Comment");
        ((Comment) firstComment).toggleModeration();
        ((Topic) firstTopic).addNewComment(firstComment);
        forum.addNewTopic(firstTopic);
        System.out.println(forum.forumTopics);
        System.out.println(((Topic) forum.forumTopics.get(0)).getModeratedComments());

    }

    public void addNewTopic(Entry topic){
        forumTopics.add(topic);
    }


}
