package org.techtown.sopt_project

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_up.*
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var email : String = ""
        var password : String = ""
        var userName : String = ""


        agree.setOnClickListener {
            userName = new_userName.text.toString()
            email = new_email.text.toString()
            password = new_password.text.toString()

            val call : Call<SignupResponseData> = SignupServiceImpl.service.postSignup(
                SignupRequestData(email = email, password = password, userName = userName)
            )
            call.enqueue(object : Callback<SignupResponseData> {
                override fun onFailure(call: Call<SignupResponseData>, t: Throwable) {

                }

                override fun onResponse(
                    call: Call<SignupResponseData>,
                    response: Response<SignupResponseData>
                ) {
                    response.takeIf { it.isSuccessful }
                        ?.body()
                        ?.let {it ->

                            if(email != "" && password != "" && userName != "") {
                                Toast.makeText(this@SignupActivity, "회원가입 완료!", Toast.LENGTH_SHORT).show()
                            }
                            else {
                                Toast.makeText(this@SignupActivity, "빈칸이 존재합니다.", Toast.LENGTH_SHORT).show()
                            }
                        } ?: showError(response.errorBody())
                }
            })


        }
    }

    private fun showError(error: ResponseBody?) {
        val e = error ?: return
        val ob = JSONObject(e.string())
        Toast.makeText(this, ob.getString("message"),Toast.LENGTH_SHORT).show()
    }


}