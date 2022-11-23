package tu_varna.sit.mychecklist20.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tu_varna.sit.mychecklist20.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    var binding : ActivityRegisterBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding?.regButon?.setOnClickListener {
            register()
        }

        binding?.loginForgotPass?.setOnClickListener {
            logInForm()
        }
    }

    private fun register(){
        val intent = Intent(this@RegisterActivity,MainActivity::class.java)
        startActivity(intent)
    }

    private fun logInForm(){
        val intent = Intent(this@RegisterActivity,LogInActivity::class.java)
        startActivity(intent)
    }
}