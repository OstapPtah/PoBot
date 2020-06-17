package com.ua.PornBot.core;

import com.ua.PornBot.service.Video;
import com.ua.PornBot.service.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;


public class VideoSearchBotApi implements UpdateHandler {

    private VideoService videoService = new VideoService();


    @Override
    public void onUpdate(Update update) {
        Message msg = update.getMessage();

        int chatId = msg.getChat().getId();
        int videosAmount = msg.getVideoAmount();
        String star = msg.getStarName();

        List<Video> videos = videoService.getTopRatedVideos(star, videosAmount);
        if (!videos.isEmpty()){
            videos.forEach(video -> new BotVideoMessage(chatId, video).send());
        }else {
            new BotTextMessage(chatId, "No videos found for star" + star).send();
        }

    }

}
