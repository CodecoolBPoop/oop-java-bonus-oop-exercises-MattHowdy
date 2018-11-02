package com.bonus.exerices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Topic extends Entry{
    String title;
    List<Entry> topiComments = new ArrayList<>();

    public Topic(String title, String message) {
        this.title = title;
        this.message = message;
        creationDate = new Date();
        this.id = counter++;
    }


    public void addNewComment(Entry comment){
        topiComments.add(comment);
    }


    public List<Entry> getModeratedComments(){
        List<Entry> moderatedComments = new ArrayList<>();
        for (Entry comment : topiComments) {
            if(((Comment)comment).isModerated()){
                moderatedComments.add(comment);
            }
        }
        return moderatedComments;
    }


    @Override
    public String toString() {
        return  title ;
    }
}
