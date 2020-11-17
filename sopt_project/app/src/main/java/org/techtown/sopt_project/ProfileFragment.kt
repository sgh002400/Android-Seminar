package org.techtown.sopt_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.profile_fragment.*

class ProfileFragment : Fragment() {

    private lateinit var viewPagerAdapter: TabLayoutAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewPagerAdapter = TabLayoutAdapter(childFragmentManager)
        viewPagerAdapter.fragments = listOf(

            ProfileFragment(),
            PortfolioFragment(),
            SettingFragment()
        )
        profileVP.adapter = viewPagerAdapter

        TabLayout.setupWithViewPager(profileVP)
        TabLayout.apply {
            getTabAt(0)?.text = "Info"
            getTabAt(1)?.text = "Other"
        }
    }
}