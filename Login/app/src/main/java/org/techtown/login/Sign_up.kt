package org.techtown.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class Sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var id : String = "";
        var password : String = "";


        agree.setOnClickListener {

            id = new_id.text.toString();
            password = new_password.text.toString();

            if(id != "" && password != "") {
                Toast.makeText(this, "회원가입 완료!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "빈칸이 존재합니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

