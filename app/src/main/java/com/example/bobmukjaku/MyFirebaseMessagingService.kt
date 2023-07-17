package com.example.bobmukjaku

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        Log.i("kim", "received")
        Log.i("kim" , message.toString())
        Log.i("kim", message.notification?.title!!)
        Log.i("kim", message.notification?.body!!)

        Log.i("kim", "data는 ${message.data.get("키이니라")}")
    }
}