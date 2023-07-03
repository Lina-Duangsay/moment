package com.nashss.se.starburst.dynamodb.models;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Comments {

    private String momentId;
    private String username;
    private String commentId;
    private String content;
//    private ZonedDateTime time;


    public String getMomentId() {
        return momentId;
    }

    public void setMomentId(String momentId) {
        this.momentId = momentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comments comments = (Comments) o;
        return Objects.equals(momentId, comments.momentId) && Objects.equals(username, comments.username) && Objects.equals(commentId, comments.commentId) && Objects.equals(content, comments.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(momentId, username, commentId, content);
    }

    @Override
    public String toString() {
        return "Comments{" +
                "momentId='" + momentId + '\'' +
                ", username='" + username + '\'' +
                ", commentId='" + commentId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}