package com.example.project5

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
    // Query to get all food items from the database
    @Query("SELECT * FROM food_table")
    fun getAll(): Flow<List<FoodEntity>>

    // Insert a single food item into the database (suspend function for background work)
    @Insert
    suspend fun insert(food: FoodEntity)

    // Insert multiple food items into the database (suspend function for background work)
    @Insert
    suspend fun insertAll(foods: List<FoodEntity>)

    // Query to delete all food items from the database
    @Query("DELETE FROM food_table")
    suspend fun deleteAll()
}
