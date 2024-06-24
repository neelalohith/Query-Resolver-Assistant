package com.example.geminiapp

import android.graphics.Bitmap
import com.example.geminiapp.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)