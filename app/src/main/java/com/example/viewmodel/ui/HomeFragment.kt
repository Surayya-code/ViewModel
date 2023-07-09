package com.example.viewmodel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.R
import com.example.viewmodel.base.BaseFragment
import com.example.viewmodel.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private lateinit var  viewModel:HomeMVVM
    var number=0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(requireActivity())[HomeMVVM::class.java]
        setup()
        observedata()
    }

    private fun setup(){
     binding.btnFirst.setOnClickListener{
           viewModel.increaseNumber(number)
     }
        binding.btnSecond.setOnClickListener{
            viewModel.decreaseNumber(number)
        }
    }
    private fun observedata(){
      viewModel.counter.observe(viewLifecycleOwner){
              counterNumber->
          number=counterNumber
          binding.firstText.text=counterNumber.toString()


      }
    }
}