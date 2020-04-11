package com.atilsamancioglu.fragmentktl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_fragment.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val viewGroup = inflater.inflate(R.layout.first_fragment,container,false)
        val textView =  viewGroup.findViewById<TextView>(R.id.textView)
        textView.text = "1st Fragment Example"

        //textView.text = "1st Fragment Example"


        return viewGroup

        //return inflater.inflate(R.layout.first_fragment,container,false)
    }


}