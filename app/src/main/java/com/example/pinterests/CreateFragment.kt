package com.example.pinterests

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.PopupMenu
import com.example.pinterests.databinding.FragmentCreateBinding
import com.example.pinterests.databinding.FragmentHomeBinding


class CreateFragment : Fragment() {
    private lateinit var binding: FragmentCreateBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCreateBinding.inflate(inflater, container, false)

        binding.root.setOnClickListener {
            showPopupMenu(it)
        }
        return binding.root
    }



    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(requireContext(), view)
        popupMenu.inflate(R.menu.popup_menu)

        popupMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.ic_pin -> {
                    // Handle ic_pin click
                    true
                }
                R.id.ic_collage -> {
                    // Handle ic_collage click
                    true
                }
                R.id.ic_board -> {
                    // Handle ic_board click
                    true
                }
                else -> false
            }
        }

        popupMenu.show()
    }


    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            val popupMenu = PopupMenu(requireContext(), it)
            popupMenu.inflate(R.menu.popup_menu)

            popupMenu.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.ic_pin -> {
                        true
                    }

                    R.id.ic_collage -> {
                        true
                    }

                    R.id.ic_board -> {
                        true
                    }

                    else -> false
                }

            }
            popupMenu.show()
        }

    }*/


}