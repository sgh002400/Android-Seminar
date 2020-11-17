package org.techtown.sopt_project

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabLayoutAdapter(fm : FragmentManager)
    : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    var fragments = listOf<Fragment>()

    override fun getItem(position: Int): Fragment = when(position) {
        0 -> InfoFragment()
        1 -> OtherFragment()

        else -> throw IllegalStateException("Unexpected position $position")
    }
    override fun getCount(): Int = 2

}