package me.souprpk.api.websocket;

public class WebServer {

    private String path = "";

    public WebServer setFolder(String path){
        this.path = path;
        return this;
    }
}
