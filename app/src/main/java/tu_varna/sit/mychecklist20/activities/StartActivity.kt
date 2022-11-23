package tu_varna.sit.mychecklist20.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import tu_varna.sit.mychecklist20.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding : ActivityStartBinding? = null
        val logo: ImageView
        // val splashScreen = installSplashScreen()  // suzdavame splashscreen
        super.onCreate(savedInstanceState)
        //  ImageView ivImageView = findViewbyId(R.id.id_animation);
        //  logo.setBackgroundResource(R.drawable.starticon);
        // startIcon = (AnimationDrawable) ivImageView.getBackground();

        binding =ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        nextActivity()

    }

    private fun nextActivity(){
        GlobalScope.launch {
            delay(3000)
            var intent = Intent(this@StartActivity,LogInActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}