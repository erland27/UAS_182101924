package com.erlandarmansyah.userscrudproject.adapter.rest;

public interface ApiInterface {
    @GET("users")
    Call<GetUser>getUser();
    @FormUrlEncoded
    @POST("users")
    Call<PostPutDelUser>postUser(@Field("name") String name,
                                 @Field("job") String job);
    @FormUrlEncoded
    @PUT("users")
    Call<PostPutDelUser>putUser(@Field("name") String name,
                                @Field("job") String job);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "users", hasBody = true)
    Call<PostPutDelUser>deleteUser(@Field("id") String id);
}
