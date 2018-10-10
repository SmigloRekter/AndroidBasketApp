package com.gitara.smiglo.basket;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.annotations.Expose;

import java.util.Set;


public class BasketUser {

    @Expose
    private Long id;
    @Expose
    private String name;
    @Expose
    private String surname;
    @Expose
    private String avatar_url;
    @Expose
    private String regist_date;
    @Expose
    private String level;
    @Expose
    private String phone_num;

    @Expose
    private String email;

    @Expose()
    private String username;

    /*
     * @JsonIgnore
     *
     * @Expose(serialize = false, deserialize = false) private Set<Message>
     * messages_to;
     */

    // @Expose
    private String password;

    public Set<BasketUser> getFriend() {
        return friend;
    }

    public void setFriend(Set<BasketUser> friend) {
        this.friend = friend;
    }

    public Set<BasketUser> getFriends() {
        return friends;
    }

    public void setFriends(Set<BasketUser> friends) {
        this.friends = friends;
    }


    @JsonIgnore
    @Expose(serialize = false, deserialize = false)
    private Set<Game> games;

    private Set<BasketUser> friend;

    @JsonIgnore
    @Expose(serialize = false, deserialize = false)
    private Set<BasketUser> friends;

    public Long getId() {
        return id;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getRegist_date() {
        return regist_date;
    }

    public void setRegist_date(String regist_date) {
        this.regist_date = regist_date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}