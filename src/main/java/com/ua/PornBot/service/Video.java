package com.ua.PornBot.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Video {

    private String duration;
    private String views;
    private String video_id;
    private String rating;
    private int ratings;
    private String title;
    private String url;
    private String default_thumb;
    private String thumb;
    private String publish_date;
    @JsonIgnore
    private List<Object> thumbs;
    @JsonIgnore
    private List<Object> tags;
    @JsonIgnore
    private List<Object> pornstars;

}
