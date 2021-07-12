package com.erlandarmansyah.userscrudproject.adapter.rest;

public class ApiClient {
    public static final String BASE_URL = "https://reqres.in/api/users";
    private static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
