package com.jixcayau.auth.Base

import android.content.Context
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    private lateinit var mListener: OnFragmentInteractionListener

    interface OnFragmentInteractionListener {
        fun showActionBar()
        fun hideActionBar()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mListener = if (context is OnFragmentInteractionListener) {
            context
        } else {
            throw RuntimeException(
                context.toString() + " must implement OnFragmentInteractionListener"
            )
        }
    }

    protected fun showActionBar() {
        mListener.showActionBar()
    }

    protected fun hideActionBar() {
        mListener.hideActionBar()
    }

}