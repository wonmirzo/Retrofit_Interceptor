package com.wonmirzo.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.wonmirzo.R
import com.wonmirzo.api.ApiClient
import com.wonmirzo.api.ApiService
import com.wonmirzo.model.ResponseItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var apiService: ApiService

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        apiService = ApiClient.createServiceWithAuth(ApiService::class.java)

        apiService.getPhotos().enqueue(object : Callback<List<ResponseItem>> {
            override fun onResponse(
                call: Call<List<ResponseItem>>,
                response: Response<List<ResponseItem>>
            ) {
                Log.d("responseRetro", response.body().toString())
            }

            override fun onFailure(call: Call<List<ResponseItem>>, t: Throwable) {
                Log.d("errorRetro", t.localizedMessage)
            }
        })
    }
}