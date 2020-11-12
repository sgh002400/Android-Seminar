package org.techtown.sopt_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sign_in.*

class SigninActivity : AppCompatActivity(){
    private lateinit var profileAdapter:ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        profileAdapter = ProfileAdapter(this)
        signin_rcv.adapter = profileAdapter

        val lm = LinearLayoutManager(this)
        signin_rcv.layoutManager = lm

        profileAdapter.data = mutableListOf(
            ProfileData("이름", "shin", "11월 12일", "23살"),
            ProfileData("이름", "han", "11월 10일", "20살"),
            ProfileData("이름", "nam", "11월 11일", "21살"),
            ProfileData("이름", "kang", "11월 19일", "22살")
        )
        profileAdapter.notifyDataSetChanged()

    }


}