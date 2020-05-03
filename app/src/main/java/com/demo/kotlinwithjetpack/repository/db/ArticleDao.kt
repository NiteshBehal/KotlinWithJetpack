package com.demo.kotlinwithjetpack.repository.db

import androidx.room.*

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(article: ArticleEntity);

    @Query("DELETE FROM article_table")
    fun deleteAll();

    @Query("Select * from article_table")
    fun getAllNews(): List<ArticleEntity>
}