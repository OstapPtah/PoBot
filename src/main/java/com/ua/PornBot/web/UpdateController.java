package com.ua.PornBot.web;


import com.ua.PornBot.core.Update;
import com.ua.PornBot.core.UpdateHandler;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("api")
public class UpdateController {

    private UpdateHandler updateHandler;

    public UpdateController(UpdateHandler updateHandler) {
        this.updateHandler = updateHandler;
    }

    @Path("update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Update update) {
        updateHandler.onUpdate(update);
    }


}
