package me.souprpk.api.http;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URL;
import java.util.UUID;

public class MojangAPI {

    public static final String PROFILES_URL = "https://api.mojang.com/users/profiles/minecraft/%s";
    public static final String NAME_HISTORY_URL = "https://api.mojang.com/user/profiles/%s/names";
    public static final String PROFILE_SKIN = "https://sessionserver.mojang.com/session/minecraft/profile/%s";

    public static JsonObject getProfileTextures(UUID uuid) throws IOException {
        URL url = new URL(String.format(PROFILE_SKIN, uuid));
        return HTTPUtils.readResponse(url);
    }

    public MojangAPI(){
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
}
