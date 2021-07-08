package com.lpontes7.fantasminha.views.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lpontes7.fantasminha.BuildConfig


import com.lpontes7.fantasminha.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        binding.tvVersao.text = ("v."+BuildConfig.VERSION_NAME)

        verificarUsuarioLogado()

        binding.btEntrar.setOnClickListener {
            validarCampos()
        }
    }

    private fun validarCampos() {
        val email = binding.editEmail.text.toString()
        val senha = binding.editSenha.text.toString()

        if (email.isEmpty() || senha.isEmpty()) {
            if (email.isEmpty()) Toast.makeText(this, "Preencha o email", Toast.LENGTH_SHORT).show()
            if (senha.isEmpty()) Toast.makeText(this, "Preencha a senha", Toast.LENGTH_SHORT).show()
        } else {
            // autenticarUsuario()
        }
    }

    private fun verificarUsuarioLogado() {
    }

}