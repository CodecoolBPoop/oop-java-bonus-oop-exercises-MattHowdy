package com.bonus.exerices;

import java.util.Date;

public class Comment extends Entry {
    private boolean moderated = false;

    public Comment(String message) {
        this.message = message;
        this.creationDate = new Date();
        this.id = counter++;
    }

    public void toggleModeration(){
        this.moderated = !moderated;
    }


    public boolean isModerated() {
        return moderated;
    }


    @Override
    public String toString() {
        return  message;
    }
}
