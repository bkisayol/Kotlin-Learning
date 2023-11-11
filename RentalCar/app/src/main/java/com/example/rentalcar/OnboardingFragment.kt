package com.example.rentalcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.rentalcar.databinding.FragmentOnboardingBinding
import androidx.navigation.Navigation


class OnboardingFragment : Fragment() {
        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            val binding:  FragmentOnboardingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding, container, false)
            binding.onboardingContinueButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_onboardingFragment_to_onboardingFragmentTwo))
            setHasOptionsMenu(true)
            return binding.root
        }
        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        // Inflate the menu; this adds items to the action bar if it is present. super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)
        }

}