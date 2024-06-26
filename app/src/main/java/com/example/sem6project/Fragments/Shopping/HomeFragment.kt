package com.example.sem6project.Fragments.Shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.sem6project.Fragments.category.*
import com.example.sem6project.R
import com.example.sem6project.adapter.HomeViewpagerAdapter
import com.example.sem6project.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment:Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val catergoriesfragments= arrayListOf<Fragment>(
            MainCategoryFragment(),
            TableFragment(),
            ChairFragment(),
            CupboardFragment(),
            AccessoryFragment(),
            FurnitureFragment()
        )

        binding.viewpagerHome.isUserInputEnabled=false

        val viewPager2Adapter=HomeViewpagerAdapter(catergoriesfragments,childFragmentManager,lifecycle)
        binding.viewpagerHome.adapter=viewPager2Adapter
        TabLayoutMediator(binding.tabLayout,binding.viewpagerHome){ tab,position->
            when(position){
                0-> tab.text="Main"
                1-> tab.text="Chair"
                2-> tab.text="Cupboard"
                3-> tab.text="Table"
                4-> tab.text="Accessory"
                5-> tab.text="Furniture"
            }
        }.attach()
    }
}