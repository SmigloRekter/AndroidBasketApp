package com.gitara.smiglo.basket;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.annotations.Expose;

import java.util.Set;

public class Game {
    @Expose
    private Long id;

    @Expose

    private Playground playground;
    @Expose

    private String date;

    @Expose
    private String time;
    @Expose

    private Long owner_id;
    @Expose

    private Integer players_count;

    @Expose // (serialize = false, deserialize = false)
    private Set<BasketUser> players;

    public Set<BasketUser> getPlayers_id() {
        return players;
    }

    public void setPlayers_id(Set<BasketUser> players_id) {
        this.players = players_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Long owner_id) {
        this.owner_id = owner_id;
    }

    public Integer getPlayers_count() {
        return players_count;
    }

    public void setPlayers_count(Integer players_count) {
        this.players_count = players_count;
    }

    public Playground getPlayground() {
        return playground;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    public Set<BasketUser> getPlayers() {
        return players;
    }

    public void setPlayers(Set<BasketUser> players) {
        this.players = players;
    }

}
