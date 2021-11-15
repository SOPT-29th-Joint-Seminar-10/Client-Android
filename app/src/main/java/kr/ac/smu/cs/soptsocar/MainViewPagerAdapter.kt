package kr.ac.smu.cs.soptsocar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainViewPagerAdapter (fragmentActivity: FragmentActivity):
        FragmentStateAdapter(fragmentActivity){
        val fragments=mutableListOf<Fragment>()

        override fun getItemCount()=fragments.size

        override fun createFragment(position: Int): Fragment =fragments[position]
    }
