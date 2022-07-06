package com.wonmirzo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wonmirzo.api.ApiClient
import com.wonmirzo.api.ApiService
import com.wonmirzo.api.model.ResponseListErrors
import com.wonmirzo.model.Employee
import com.wonmirzo.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var service: ApiService
    private lateinit var call: Call<ResponseListErrors<Employee>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        service = ApiClient.createService(ApiService::class.java)






        //call = service.getUsers()

        /*call = service.getEmployees()
        call.enqueue(object : Callback<ResponseListErrors<Employee>> {
            override fun onResponse(
                call: Call<ResponseListErrors<Employee>>,
                response: Response<ResponseListErrors<Employee>>
            ) {
                Log.d("responseRetro", response.body().toString())
            }

            override fun onFailure(call: Call<ResponseListErrors<Employee>>, t: Throwable) {
                Log.d("errorRetro", t.localizedMessage!!)
            }
        })*/


        /*call.enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                Log.d("responseRetro", response.body().toString())
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.d("errorRetro", t.localizedMessage!!)
            }
        })*/
    }
}