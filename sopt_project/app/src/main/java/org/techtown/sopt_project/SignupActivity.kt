package org.techtown.sopt_project

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var id : String = ""
        var password : String = ""


        agree.setOnClickListener {

            id = new_id.text.toString();
            password = new_password.text.toString()

            if(id != "" && password != "") {
                Toast.makeText(this, "회원가입 완료!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "빈칸이 존재합니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }


}