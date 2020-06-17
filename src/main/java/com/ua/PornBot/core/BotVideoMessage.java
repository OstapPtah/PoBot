package com.ua.PornBot.core;

import com.ua.PornBot.service.Video;

public class BotVideoMessage extends BotMessage {

    private final Video video;

    public BotVideoMessage(int chatId, Video video) {
        super(chatId);
        this.video= video;
    }

    public Video getVideo() {
        return video;
    }

    @Override
    void send() {
            new BotTextMessage(getChat_id(), video.getUrl()).send();
    }
}
