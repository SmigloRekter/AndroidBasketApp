package com.gitara.smiglo.basket;

import android.view.View;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;

import java.util.List;


public class Playground {

    @Expose
    private Long id;
    @Expose
    private String image;
    @Expose
    private String name;
    @Expose
    private String address;
    @Expose
    private String district;
    @Expose
    private double rating_sum;
    @Expose
    private double rating_count;

    public double getRating_sum() {
        return rating_sum;
    }

    public void setRating_sum(double rating_sum) {
        this.rating_sum = rating_sum;
    }

    public double getRating_count() {
        return rating_count;
    }

    public void setRating_count(double rating_count) {
        this.rating_count = rating_count;
    }

    @Expose
    private double latitude;
    @Expose
    private double longtitude;
    @Expose
    private Integer gamesplayed;
    @Expose
    private String date_add;
    @Expose
    private boolean light;
    @Expose
    private Integer surface;
    @Expose
    private double rating;
    @Expose
    private Integer state;
    @Expose(serialize = false, deserialize = false)
    @JsonIgnore

    private List<Game> games;
    private View.OnClickListener requestBtnClickListener;
    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public Integer getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(Integer gamesplayed) {
        this.gamesplayed = gamesplayed;
    }

    public String getDate_add() {
        return date_add;
    }

    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public Integer getSurface() {
        return surface;
    }

    public void setSurface(Integer surface) {
        this.surface = surface;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

}

