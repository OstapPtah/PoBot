package com.ua.PornBot.config;

import com.ua.PornBot.core.UpdateHandler;
import com.ua.PornBot.core.VideoSearchBotApi;
import org.glassfish.jersey.internal.inject.AbstractBinder;

import javax.inject.Singleton;

public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(VideoSearchBotApi.class).to(UpdateHandler.class).in(Singleton.class);


    }
}
