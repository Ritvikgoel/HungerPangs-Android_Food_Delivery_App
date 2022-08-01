package com.internshala.hungerpangs.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.internshala.hungerpangs.database.RestaurantDao
import com.internshala.hungerpangs.database.RestaurantEntity

@Database(entities = [RestaurantEntity::class], version = 1)
abstract class RestaurantDatabase:RoomDatabase() {

    abstract fun restaurantDao(): RestaurantDao
}