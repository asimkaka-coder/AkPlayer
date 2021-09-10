package com.example.akplayer.models

import java.io.Serializable

data class Song(
    val songTitle:String?,
    val songArtist:String?,
    val songUri:String?,
    val songDuration:String?
):Serializable{
}