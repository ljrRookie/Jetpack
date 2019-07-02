package com.ljr.jetpack_navigation.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.ljr.jetpack_navigation.R


class LoginActivity : AppCompatActivity() {

    //lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*val host:MyNavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as MyNavHostFragment
        navController = host.navController*/

    }

    override fun onBackPressed() {
        super.onBackPressed()


        //navController.navigateUp()
    }
}
