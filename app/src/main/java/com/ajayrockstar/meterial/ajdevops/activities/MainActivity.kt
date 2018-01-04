package com.ajayrockstar.meterial.ajdevops.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
<<<<<<< HEAD:app/src/main/java/com/ajayrockstar/meterial/ajdevops/activities/MainActivity.kt
import android.widget.Toast
=======
>>>>>>> master:app/src/main/java/com/ajayrockstar/meterial/ajdevops/activities/MainActivity.kt
import com.ajayrockstar.meterial.ajdevops.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_linux -> {
<<<<<<< HEAD:app/src/main/java/com/ajayrockstar/meterial/ajdevops/activities/MainActivity.kt
                showToast("its linux");


            }
            R.id.nav_git -> {
                showToast("its git");

            }
            R.id.nav_chef -> {
                showToast("its chef");

            }
            R.id.nav_jenkins -> {
                showToast("its jenkins");

            }
            R.id.nav_docker -> {
                showToast("its docker");

            }
            R.id.nav_ansible -> {
                showToast("its ansible");

            }
            R.id.nav_aws -> {
                showToast("its aws");
=======
                // Handle the camera action

            }
            R.id.nav_git -> {

            }
            R.id.nav_chef -> {

            }
            R.id.nav_jenkins -> {

            }
            R.id.nav_docker -> {

            }
            R.id.nav_ansible -> {
>>>>>>> master:app/src/main/java/com/ajayrockstar/meterial/ajdevops/activities/MainActivity.kt

            }
            R.id.nav_share -> {
                showToast("its share");

            }
            R.id.nav_send -> {
                showToast("its send");

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun showToast(msg: String) {
        Toast.makeText(this@MainActivity, "" + msg, Toast.LENGTH_SHORT).show();

    }
}
