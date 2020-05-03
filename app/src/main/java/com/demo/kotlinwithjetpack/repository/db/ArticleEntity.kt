package com.demo.kotlinwithjetpack.repository.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(tableName = "article_table", indices = [Index(value = ["title"], unique = true)])
data class ArticleEntity(
    val author: String,
    val title: String,
    val description: String,
    @ColumnInfo(name = "sourceURL")
    val url: String,
    @ColumnInfo(name = "imageURL")
    val urlToImage: String,
    val publishedAt: String,
    val content: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}