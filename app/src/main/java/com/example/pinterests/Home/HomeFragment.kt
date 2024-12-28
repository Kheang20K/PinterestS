package com.example.pinterests.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.pinterests.Adapter.Adapter
import com.example.pinterests.R
import com.example.pinterests.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter
    private lateinit var list : ArrayList<Int>
    private lateinit var detailImagelist: Array<Int>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = binding.RecyclerViewRv
        val layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)
        list = ArrayList()
        list.add(R.drawable.img)
        list.add(R.drawable.img_1)
        list.add(R.drawable.img_2)
        list.add(R.drawable.img_3)
        list.add(R.drawable.img_4)

        detailImagelist = arrayOf(
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4
        )


        adapter = Adapter(list)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object  : Adapter.OnItemClickListener{
            override fun onItemClick(item: Int) {
                val intent = Intent(requireContext(),DetailActivity::class.java)
                intent.putExtra("image",item)
                startActivity(intent)
            }
        })



    }
    




}
