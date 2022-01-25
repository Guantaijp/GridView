package com.example.gridview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

data class LangListAdapter(var langaugeList:List<language>, var activity: Activity) : BaseAdapter(){

    override fun getItem(position: Int): Any {
        return langaugeList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return langaugeList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = View.inflate(activity,R.layout.layout_adapter,null)

        val tv_num = view.findViewById<TextView>(R.id.tv_number) as TextView
        val tv_lang = view.findViewById<TextView>(R.id.tv_lang) as TextView
        val img_lang=view.findViewById<ImageView>(R.id.im_lang)


        tv_num.text= (position+1).toString()+"."
        tv_lang.text=langaugeList.get(position).name
        val lang_pic=langaugeList.get(position).img_icon
//img_lang.drawable =langaugeList.get(position).img_icon
        img_lang.setImageResource(lang_pic)



        return view
    }

}