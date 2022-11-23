package tu_varna.sit.mychecklist20.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import tu_varna.sit.mychecklist20.*

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.navigationView)

        // val navController=findNavController(R.id.fragmentContainerView) // az
       // val navController=findNavController(R.id.fragmentContainerView)
        // val setupActionBarWithNavController
        //binding.imageMenu.setOnClickListener {
        // binding.drawerLayout.openDrawer(GravityCompat.START)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
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
        // binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(binding.root)

    }

    private fun replaceFragment(fragment: Fragment, title : String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
