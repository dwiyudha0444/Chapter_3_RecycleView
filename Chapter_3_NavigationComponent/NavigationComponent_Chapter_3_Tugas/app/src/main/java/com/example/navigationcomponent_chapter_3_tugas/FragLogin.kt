package com.example.navigationcomponent_chapter_3_tugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent_chapter_3_tugas.databinding.FragmentFragLoginBinding

class FragLogin : Fragment() {
    lateinit var binding: FragmentFragLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFragLoginBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener{
            findNavController().navigate(R.id.action_fragLogin_to_homeFragment)
        }

        binding.registerButton.setOnClickListener{
            findNavController().navigate(R.id.action_fragLogin_to_fragRegister)
        }
    }


}