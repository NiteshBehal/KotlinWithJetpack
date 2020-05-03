package com.demo.kotlinwithjetpack.ui.newslist

import androidx.lifecycle.ViewModel
import com.demo.kotlinwithjetpack.repository.network.ArticleModel

class NewsListViewModel : ViewModel() {

    var articleList : List<ArticleModel>? = null

//    fun getArticles() : List<ArticleModel> {

//        return articleList
//    }
}