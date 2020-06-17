package com.ua.PornBot.service;

import com.ua.PornBot.net.HttpClient;
import com.ua.PornBot.service.util.URLUtil;

import java.util.ArrayList;
import java.util.List;

public class PornHubService {

    public static final String PORN_HUB_RESOURCE = "http://www.pornhub.com/webmasters/search?";


    public List<Video> getVideoForStar(String star){
        String  url = URLUtil.replaceWhiteSpaces(PORN_HUB_RESOURCE +"stars[]=" + star);
        PornHubResponse res = HttpClient.GET(url, PornHubResponse.class);

        if (res.getVideos() != null) {
                return res.getVideos();
        }      
                
        return new ArrayList<>(0);
    }

}
