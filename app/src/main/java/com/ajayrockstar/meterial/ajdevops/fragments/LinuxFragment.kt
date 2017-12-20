package com.ajayrockstar.meterial.ajdevops.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ajayrockstar.meterial.ajdevops.R

/**
 * Created by admin on 12/20/2017.
 */
//1
class LinuxFragment : Fragment() {

   // https://www.raywenderlich.com/169885/android-fragments-tutorial-introduction-2

    //2
    companion object {

        fun newInstance(): LinuxFragment {
            return LinuxFragment()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.linux_fragment, container, false)
    }
}