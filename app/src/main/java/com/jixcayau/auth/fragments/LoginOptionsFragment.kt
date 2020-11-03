package com.jixcayau.auth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.jixcayau.auth.Base.BaseFragment
import com.jixcayau.auth.R
import com.jixcayau.auth.databinding.CommonEditTextBinding
import com.jixcayau.auth.databinding.LoginOptionsFragmentBinding

class LoginOptionsFragment : BaseFragment() {

    private lateinit var binding: LoginOptionsFragmentBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        hideActionBar()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginOptionsFragmentBinding.inflate(LayoutInflater.from(requireActivity()));

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configEt(binding.lyEmailEditText, R.string.email, R.drawable.ic_baseline_person_24)
        configEt(binding.lyPasswordEditText, R.string.password, R.drawable.ic_baseline_lock_24)
    }

    private fun configEt(item: CommonEditTextBinding, text: Int, icon: Int) {
        item.textInput.hint = getString(text)
        item.textInput.startIconDrawable = ContextCompat.getDrawable(requireActivity(), icon)
    }
}