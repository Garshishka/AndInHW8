package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)
