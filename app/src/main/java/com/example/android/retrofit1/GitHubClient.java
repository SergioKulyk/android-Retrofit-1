package com.example.android.retrofit1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Sergey Kulyk on 14.05.2018.
 */

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
