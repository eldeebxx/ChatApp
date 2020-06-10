package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAZMi4zEo:APA91bG6A5MI71D2mklyo8VF2uhBOSxe0UKnoumKwZAH7eX9d1v-_EAXKBB8cck4UCzS1KCZiddXFGaX4Q9fHd33t8cymYv5r98NDHBsaG4vjjTbagDsxuOVgJ8_CSrfGgqRaaPXGNAj"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
