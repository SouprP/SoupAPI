package me.souprpk.api.http;

public class MojangAPI {

    public static final String PROFILES_URL = "https://api.mojang.com/users/profiles/minecraft/%s";
    public static final String NAME_HISTORY_URL = "https://api.mojang.com/user/profiles/%s/names";

    public MojangAPI(){
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
}
