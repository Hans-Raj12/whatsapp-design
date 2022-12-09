package com.example.whatsapp_design

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> return CHATS()
            1-> return STATUS()
            2-> return CALLS()
        }
        return CHATS()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0-> return "CHATS"
            1-> return "STATUS"
            2-> return "CALLS"
        }
        return null
    }
}