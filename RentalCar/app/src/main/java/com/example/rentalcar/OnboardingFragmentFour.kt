package com.example.rentalcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.rentalcar.databinding.FragmentOnboardingFourBinding


class OnboardingFragmentFour : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentOnboardingFourBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_four, container, false)
        binding.onboardingFourContinueButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_onboardingFragmentFour_to_onboardingFragment))
        return binding.root
    }

}