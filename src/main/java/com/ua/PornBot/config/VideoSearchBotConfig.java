package com.ua.PornBot.config;

import org.glassfish.jersey.server.ResourceConfig;

public class VideoSearchBotConfig extends ResourceConfig {

public VideoSearchBotConfig (){
    register(new DependencyBinder());
    packages(true, "com.ua.PornBot");
}

}
