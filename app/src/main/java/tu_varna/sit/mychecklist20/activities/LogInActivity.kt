package tu_varna.sit.mychecklist20.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tu_varna.sit.mychecklist20.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {

    var binding : ActivityLogInBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonLogIn?.setOnClickListener {
            goToMain()
        }

        binding?.makeRegistration?.setOnClickListener {
            goToRegister()
        }
    }

    private fun goToMain(){
        val intent = Intent(this@LogInActivity,MainActivity::class.java)
        startActivity(intent)
    }

    private fun goToRegister(){
        val intent = Intent(this@LogInActivity,RegisterActivity::class.java)
        startActivity(intent)
    }
}