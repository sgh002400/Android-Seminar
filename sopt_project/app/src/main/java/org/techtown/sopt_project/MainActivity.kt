package org.techtown.sopt_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
        signin.setOnClickListener{
            val email = email_edt.text.toString()
            val password = password_edt.text.toString()
            val userName = userName_edt.text.toString()

            val call : Call<SigninResponseData> = SigninServiceImple.service.postSignin(
                SigninRequestData(email = email, password = password, userName = userName)
            )
            call.enqueue(object : Callback<SigninResponseData> {
                override fun onResponse(
                    call: Call<SigninResponseData>,
                    response: Response<SigninResponseData>
                ) {
                    response.takeIf {it.isSuccessful}
                        ?.body()
                        ?.let { it ->
                            val intent = Intent(this@MainActivity, SigninActivity::class.java)
                            startActivity(intent)
                        } ?: showError(response.errorBody())
                }

                override fun onFailure(call: Call<SigninResponseData>, t: Throwable) {
                }

            })


        }
    }

    private fun showError(error: ResponseBody?) {
        val e = error ?: return
        val ob = JSONObject(e.string())
        Toast.makeText(this, ob.getString("message"), Toast.LENGTH_SHORT).show()
    }
}