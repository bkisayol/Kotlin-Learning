package com.example.rentalcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.rentalcar.databinding.FragmentOnboardingThreeBinding


class OnboardingFragmentThree : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentOnboardingThreeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_three, container, false)
        binding.onboardingThreeContinueButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_onboardingFragmentThree_to_onboardingFragmentFour))
        return binding.root
    }

}