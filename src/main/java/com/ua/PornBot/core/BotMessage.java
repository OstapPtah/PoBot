package com.ua.PornBot.core;


import lombok.Getter;

@Getter
public abstract class BotMessage {

    protected static final String TELEGRAM_RESOURCE = "https://api.telegram.org/bot1098974233:AAHfG_o-rLk2zITADm_9GHBjLXpFZK3oAes";

    private final int chat_id;

    public BotMessage(int chat_id) {
        this.chat_id = chat_id;
    }

    public int getChat_id() {
        return chat_id;
    }

    abstract void send();

}
