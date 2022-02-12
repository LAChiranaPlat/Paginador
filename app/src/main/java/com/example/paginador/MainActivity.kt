package com.example.paginador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list:ArrayList<Screen>
        list= ArrayList()

        list.add(Screen("","huarseral","Developer...","Saber mas"))
        list.add(Screen("","mikymjg","Support Tic...","Saber mas"))
        list.add(Screen("","Jandro","Manager Resources...","Saber mas"))


        val vPager=findViewById<ViewPager2>(R.id.viewPager)
        val myAdapter=adapterViewPager(list)

        vPager.adapter=myAdapter

        //val controlador=TabLayoutMediator()

    }

}