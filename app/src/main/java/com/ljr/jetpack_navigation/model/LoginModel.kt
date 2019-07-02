package com.ljr.jetpack_navigation.model

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.contentValuesOf
import androidx.databinding.ObservableField
import com.ljr.jetpack_navigation.MainActivity

class LoginModel constructor(name:String,pwd:String,context:Context) {
    val userName = ObservableField<String>(name)
    val passWord = ObservableField<String>(pwd)
    val context = context

    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s:CharSequence){
        userName.set(s.toString())
    }
    /**
     *密码改变回调的函数
     */
    fun onPwdChanged(s:CharSequence,start:Int,before:Int,count:Int){
        passWord.set(s.toString())
    }
    fun login(){
        if(userName.get().equals("ljr") && passWord.get().equals("123456")){
            Toast.makeText(context,"登录成功",Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }


}