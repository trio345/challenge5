package id.co.mdd.shrine.userUtils;

import id.co.mdd.shrine.utils.APICLIENT;

public class UserRepository {

    private static final String BASE_URL = "https://fakestoreapi.com/";

    public UserService service;

    public UserRepository() {
        service = APICLIENT.client(UserService.class, BASE_URL);
    }
}
