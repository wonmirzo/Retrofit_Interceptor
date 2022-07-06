package com.wonmirzo.api.model

data class ResponseObjectErrors<T>(
    var status: String,
    var data: T,
    var message: String
) {
}