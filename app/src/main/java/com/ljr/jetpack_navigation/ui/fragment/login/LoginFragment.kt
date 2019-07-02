package com.ljr.jetpack_navigation.ui.fragment.login


import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ljr.jetpack_navigation.databinding.FragmentLoginBinding
import com.ljr.jetpack_navigation.model.LoginModel


/**
 * A simple [Fragment] subclass.
 *
 */
class LoginFragment : androidx.fragment.app.Fragment() {

    lateinit var loginModel:LoginModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //第一种 binding：
       /*val binding:FragmentLoginBinding =  DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )*/
        //第二种 binding：
        val binding = FragmentLoginBinding.inflate(
            inflater
            , container
            , false
        )
        loginModel = LoginModel("", "", context!!)
        binding.model = loginModel
        binding.activity = activity
        // return inflater.inflate(R.layout.fragment_login, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      /*  mCancel = view.findViewById(R.id.txt_cancel)
        mLogin = view.findViewById(R.id.btn_login)
        mAccount = view.findViewById(R.id.et_account)

        mLogin.setOnClickListener {

        }

        mCancel.setOnClickListener {
            activity?.onBackPressed()
        }*/

        val name = arguments?.getString("name")
        if(!TextUtils.isEmpty(name)){
            loginModel.userName.set(name)
        }
       // mAccount.setText(name)
    }



}
