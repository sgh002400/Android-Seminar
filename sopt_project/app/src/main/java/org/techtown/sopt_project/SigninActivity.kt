package org.techtown.sopt_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlin.properties.Delegates

class SigninActivity : AppCompatActivity(){
    private lateinit var viewPagerAdapter : SigninViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        viewPagerAdapter = SigninViewPagerAdapter(supportFragmentManager) //이걸로 sample~에서 fm : 이걸 넘겨줌
        viewPagerAdapter.fragments = listOf(

            ProfileFragment(),
            PortfolioFragment(),
            SettingFragment()
        )
        sample_viewpager.adapter = viewPagerAdapter

        //뷰페이저 슬라이드 했을 때 그에 대응되는 하단 탭 변경
        sample_viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {}

            override fun onPageSelected(position: Int) {
                sample_bottom_navi.menu.getItem(position).isChecked = true
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })


        // 하단 탭을 눌렀을 때 뷰페이저 화면 변경

        sample_bottom_navi.setOnNavigationItemSelectedListener {
            var index by Delegates.notNull<Int>()

            when(it.itemId) {
                R.id.menu_profile -> index = 0
                R.id.menu_portfolio -> index = 1
                R.id.menu_settings -> index = 2
            }
            sample_viewpager.currentItem = index
            true
        }



    }






}