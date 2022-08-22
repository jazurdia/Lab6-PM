package com.example.lab6

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [thirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class thirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var addBtn: ImageButton
    private lateinit var dwSongs: TextView

    private var contador: Int = 0

    override fun onViewCreated(view: View, savedInstanceState:Bundle?){
        addBtn = view.findViewById(R.id.add_btn)
        dwSongs = view.findViewById(R.id.dw_songs)
        setListeners()

        super.onViewCreated(view, savedInstanceState)

    }

    private fun setListeners(){
        addBtn.setOnClickListener {
            contador++
            dwSongs.text = contador.toString() + " songs"
        }
    }


}