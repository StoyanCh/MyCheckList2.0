package tu_varna.sit.mychecklist20.activities

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import tu_varna.sit.mychecklist20.*
import tu_varna.sit.mychecklist20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageMenu.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.navigationView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.myTasks -> replaceFragment(MyTasksFragment(),it.title.toString() )
                R.id.toDo -> replaceFragment(ToDoFragment(), it.title.toString())
                R.id.importantTasks -> replaceFragment(ImportantTasksFragment(), it.title.toString())
                R.id.todayTasks -> replaceFragment(TodayTaskFragment(), it.title.toString())
                R.id.calendar -> replaceFragment(TodayTaskFragment(), it.title.toString())
                //  R.id.menuSetting -> replaceFragment(SettingsFragment(), it.title.toString())
            }
            true

        }


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment, title : String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.drawerLayout, fragment)
        fragmentTransaction.commit()
        binding.drawerLayout.closeDrawers()
        setTitle(title)
    }

}

