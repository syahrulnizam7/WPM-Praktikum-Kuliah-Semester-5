package com.example.navigationdrawer.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawer.R


/**
 * A simple [Fragment] subclass.
 * Use the [fragment_halaman_send.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment_halaman_send : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_halaman_send, container, false)
    }

}