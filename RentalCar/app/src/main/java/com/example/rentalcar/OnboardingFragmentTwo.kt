package com.example.rentalcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.rentalcar.databinding.FragmentOnboardingTwoBinding

class OnboardingFragmentTwo : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentOnboardingTwoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_two, container, false)
        binding.onboardingTwoContinueButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_onboardingFragmentTwo_to_onboardingFragmentThree))
        return binding.root
    }

}