package org.techtown.sopt_project

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.lang.IllegalStateException

class SigninViewPagerAdapter(fm : FragmentManager)
    : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    var fragments = listOf<Fragment>()

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment = when(position) {
        0 -> ProfileFragment()
        1 -> PortfolioFragment()
        2 -> SettingFragment()

        else -> throw IllegalStateException("Unexpected position $position")
    }
}
