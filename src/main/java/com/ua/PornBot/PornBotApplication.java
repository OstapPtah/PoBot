package com.ua.PornBot;

import com.ua.PornBot.core.VideoSearchBotApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PornBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PornBotApplication.class, args);
		VideoSearchBotApi.BotInit botInit =new VideoSearchBotApi.BotInit();
		botInit.botInitializer();
	}

}
