package com.reapmind.socketlibrary

import android.app.Application
import com.reapmind.socketlibrary.socket.SocketHandler

class SocketLibApp : Application() {


    override fun onCreate() {
        super.onCreate()


        SocketHandler.establishConnection()
    }
}