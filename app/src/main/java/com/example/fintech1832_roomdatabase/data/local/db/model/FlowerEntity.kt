package com.example.fintech1832_roomdatabase.data.local.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FlowerEntity(

    @PrimaryKey( autoGenerate = true )
    val id: Int,
    val flowerName: String,
    val flowerImageUrl: String

)