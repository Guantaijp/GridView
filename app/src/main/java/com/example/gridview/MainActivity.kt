package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    var list_lang: GridView? = null
    var langaugeList: ArrayList<language> = ArrayList<language>()
    var adapter: LangListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list_lang= findViewById<GridView>(R.id.list_lang) as GridView
        addLangData()
        adapter = LangListAdapter(langaugeList, this)
        list_lang?.adapter = adapter
    }

    private fun addLangData() {
        val lang1 = language()
        lang1.name = "Android"
        lang1.img_icon=R.drawable.android
        langaugeList.add(lang1)

        val lang2 =language()
        lang2.name = "Kotlin"
        lang2.img_icon=R.drawable.kotlin
        langaugeList.add(lang2)

        val lang3 = language()
        lang3.name = "Java"
        lang3.img_icon=R.drawable.java
        langaugeList.add(lang3)

        val lang4 = language()
        lang4.name = "Python"
        lang4.img_icon=R.drawable.python
        langaugeList.add(lang4)

        val lang5 = language()
        lang5.name = "PHP"
        lang5.img_icon=R.drawable.php
        langaugeList.add(lang5)

        val lang6 = language()
        lang6.name = "React"
        lang6.img_icon=R.drawable.react
        langaugeList.add(lang6)

        val lang7 =language()
        lang7.name = "HTML"
        lang7.img_icon=R.drawable.html
        langaugeList.add(lang7)

        val lang8 = language()
        lang8.name = "MySql"
        lang8.img_icon=R.drawable.mysql
        langaugeList.add(lang8)


        val lang9 = language()
        lang9.name = "Laravel"
        lang9.img_icon=R.drawable.laravel
        langaugeList.add(lang9)
    }
}