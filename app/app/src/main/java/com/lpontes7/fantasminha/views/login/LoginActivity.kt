package com.lpontes7.fantasminha.views.login
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import com.lpontes7.fantasminha.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        verificarUsuarioLogado()

        binding.btEntrar.setOnClickListener {
            validarCampos()
        }
    }

    private fun validarCampos(){
        val email = binding.editEmail.text.toString()
        val senha = binding.editSenha.text.toString()

        if (email.isEmpty() || senha.isEmpty()){
            if (email.isEmpty()) binding.editEmail.error = "Campo obrigatório"
            if (senha.isEmpty()) binding.editSenha.error = "Campo obrigatório"
        }else{
           // autenticarUsuario()
        }
    }

    private fun verificarUsuarioLogado(){
    }

}