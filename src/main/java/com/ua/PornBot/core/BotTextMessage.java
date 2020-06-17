package com.ua.PornBot.core;

import com.ua.PornBot.net.HttpClient;

public class BotTextMessage extends BotMessage {

    private final String text;


    public BotTextMessage(int chatId, String text) {
        super(chatId);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void send() {
        HttpClient.POST(TELEGRAM_RESOURCE + "/sendMessage", this);
    }


}
