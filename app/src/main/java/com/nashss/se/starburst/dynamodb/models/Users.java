package com.nashss.se.starburst.dynamodb.models;

import java.util.List;
import java.util.Objects;

public class Users {

    private String username;
    private String displayName;
    private List<Moments> momentsList;
    private Integer momentAmount;
    private List<Users> friends;
    private Integer friendsAmount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<Moments> getMomentsList() {
        return momentsList;
    }

    public void setMomentsList(List<Moments> momentsList) {
        this.momentsList = momentsList;
    }

    public Integer getMomentAmount() {
        return momentAmount;
    }

    public void setMomentAmount(Integer momentAmount) {
        this.momentAmount = momentAmount;
    }

    public List<Users> getFriends() {
        return friends;
    }

    public void setFriends(List<Users> friends) {
        this.friends = friends;
    }

    public Integer getFriendsAmount() {
        return friendsAmount;
    }

    public void setFriendsAmount(Integer friendsAmount) {
        this.friendsAmount = friendsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(username, users.username) && Objects.equals(displayName, users.displayName) && Objects.equals(momentsList, users.momentsList) && Objects.equals(momentAmount, users.momentAmount) && Objects.equals(friends, users.friends) && Objects.equals(friendsAmount, users.friendsAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, displayName, momentsList, momentAmount, friends, friendsAmount);
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", displayName='" + displayName + '\'' +
                ", momentsList=" + momentsList +
                ", momentAmount=" + momentAmount +
                ", friends=" + friends +
                ", friendsAmount=" + friendsAmount +
                '}';
    }
}