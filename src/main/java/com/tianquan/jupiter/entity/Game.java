package com.tianquan.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;




@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = Game.Builder.class)

public class Game {
    @JsonProperty("id")
    private final String id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("box_art_url")
    private final String boxArtUrl;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBoxArtUrl() {
        return boxArtUrl;
    }

    private Game(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.boxArtUrl = builder.boxArtUrl;
        System.out.print("calling builder");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Builder {

        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("box_art_url")
        private String boxArtUrl;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder boxArtUrl(String boxArtUrl) {
            this.boxArtUrl = boxArtUrl;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }













//    @JsonProperty("name")
//    public String name;
//
//    @JsonProperty("developer")
//    public String developer;
//
//    @JsonProperty("release_time")
//    public String releaseTime;
//
//    @JsonProperty("website")
//    public String website;
//
//    @JsonProperty("price")
//    public double price;
//
//    public Game(String name, String developer, String releaseTime, String website, double price) {
//        this.name = name;
//        this.developer = developer;
//        this.releaseTime = releaseTime;
//        this.website = website;
//        this.price = price;
//    }


//    private final String name;
//    private final String developer;
//    private final float price;
//
//    public String getName() {
//        return name;
//    }
//
//    public Game(GameBuilder builder) {
//        this.name = name;
//        this.developer = developer;
//        this.price = price;
//    }
//
//    public Game setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public String getDeveloper() {
//        return developer;
//    }
//
//    public void setDeveloper(String developer) {
//        this.developer = developer;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public staic class GameBuilder {
//        private String name;
//        private String developer;
//        private float price;
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void setDeveloper(String developer) {
//            this.developer = developer;
//        }
//
//        public void setPrice(float price) {
//            this.price = price;
//        }
//
//        public Game build() {
//            return new Game(this);
//        }
//    }
//


}

// GameBuilder builder = new GameBuilder();
// builder.setName("abc");
// builder.setDeveloper("tianquan");
// Game game = builder.build();
