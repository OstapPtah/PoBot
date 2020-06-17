package com.ua.PornBot.core;

import lombok.Getter;
import lombok.Setter;

import javax.swing.text.html.parser.Entity;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Message {

      private int message_id;
      private From from;
      private Chat chat;
      private Date date;
      private String text;
      List<Entity> entities;

      public int getVideoAmount() {
            String amount = text.replaceAll("\\D+", "");

            return !amount.isEmpty() ? Integer.parseInt(amount) : 10;

      }

      public String getStarName() {

            return text.replaceAll("[0-9]", "").trim();
      }
}
