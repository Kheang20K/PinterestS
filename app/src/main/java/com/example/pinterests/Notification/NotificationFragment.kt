package com.example.pinterests.Notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import com.example.pinterests.databinding.FragmentNotificationBinding
import com.google.android.material.tabs.TabLayoutMediator

@Suppress("UNREACHABLE_CODE")
class NotificationFragment : Fragment() {
    private lateinit var binding: FragmentNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBinding.inflate(inflater, container, false)
        val fragmentList = listOf(
            UpdatesFragment(),
            InboxFragment()
        )

        val adapter = MyFragmentAdapter(
            fragmentList,
            childFragmentManager, // Use childFragmentManager
            lifecycle
        )

        binding.viewPage2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPage2) { tab, position ->
            tab.text = when (position) {
                0 -> "Updates"
                else -> "Inbox"
            }
        }.attach()

        return binding.root

    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = listOf(
            UpdatesFragment(),
            InboxFragment()
        )

        val adapter = MyFragmentAdapter(
            *//*fragmentList,
            childFragmentManager,*//*
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPage2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPage2){ tab, position ->
            tab.text = when(position){
                0-> "Updates"
                else -> "Inbox"
            }

        }.attach()
    }*/


}