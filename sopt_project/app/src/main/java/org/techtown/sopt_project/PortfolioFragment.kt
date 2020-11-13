package org.techtown.sopt_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.portfolio_fragment.*

class PortfolioFragment : Fragment() {

    private lateinit var profileAdapter:ProfileAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.portfolio_fragment, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) { //https://stackoverflow.com/questions/37499698/android-fatal-exception-in-fragments
        //생명주기 때문에 onCreateView에서 하면 안된다는데 왜???
        super.onActivityCreated(savedInstanceState)

        profileAdapter = ProfileAdapter(context as SigninActivity)
        signin_rcv.adapter = profileAdapter

        val lm = LinearLayoutManager(context as SigninActivity)
        signin_rcv.layoutManager = lm

        profileAdapter.data = mutableListOf(
            ProfileData("이름", "shin", "11월 12일", "23살"),
            ProfileData("이름", "han", "11월 10일", "20살"),
            ProfileData("이름", "nam", "11월 11일", "21살"),
            ProfileData("이름", "kang", "11월 19일", "22살")
        )
        profileAdapter.notifyDataSetChanged()
    }
}