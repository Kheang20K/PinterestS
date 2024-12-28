package com.example.pinterests.Notification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pinterests.Adapter.Adapter_notification
import com.example.pinterests.Data.DataClass_notification
import com.example.pinterests.R
import com.example.pinterests.databinding.FragmentUpdatesBinding


class UpdatesFragment : Fragment() {
    private lateinit var binding: FragmentUpdatesBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass_notification>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var moreOptionList: Array<Int>





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUpdatesBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageList = arrayOf(
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,


        )
        titleList = arrayOf(
            "title1",
            "title2",
            "title3",
            "title4",
        )
        moreOptionList = arrayOf(
            R.drawable.more_horiz_24,
            R.drawable.more_horiz_24,
            R.drawable.more_horiz_24,
            R.drawable.more_horiz_24,


        )
        /*recyclerView = binding.recyclerViewUpdate
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        dataList = arrayListOf<DataClass_notification>()
        getData()*/
        recyclerView = binding.recyclerViewUpdate
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        dataList = arrayListOf<DataClass_notification>()
        getData()
        recyclerView.adapter = Adapter_notification(dataList)

    }

    /*private fun getData(){
        for (i in imageList.indices){
            val dataClass1 = DataClass_notification(imageList[i], titleList[i], moreOptionList[i])
            dataList.add(dataClass1)
        }
        recyclerView.adapter = Adapter_notification(dataList)
    }*/
    private fun getData() {
        val minSize = minOf(imageList.size, titleList.size, moreOptionList.size) // Find minimum size
        for (i in 0 until minSize) { // Iterate up to minSize - 1
            val dataClass1 = DataClass_notification(imageList[i], titleList[i], moreOptionList[i])
            dataList.add(dataClass1)
        }
    }

}