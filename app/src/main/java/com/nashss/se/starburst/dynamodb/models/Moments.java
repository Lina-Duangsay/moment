package com.nashss.se.starburst.dynamodb.models;

import java.util.Objects;

public class Moments {

    private String momentId;
    private String username;
    private String title;
    private String description;
    private String privacy;
    private String photo;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moments moments = (Moments) o;
        return Objects.equals(momentId, moments.momentId) && Objects.equals(username, moments.username) && Objects.equals(title, moments.title) && Objects.equals(description, moments.description) && Objects.equals(privacy, moments.privacy) && Objects.equals(photo, moments.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(momentId, username, title, description, privacy, photo);
    }

    @Override
    public String toString() {
        return "Moments{" +
                "momentId='" + momentId + '\'' +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", privacy='" + privacy + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}