package com.tavares.kaique.nadadoridade

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)

        val idade = intent?.getStringExtra("IDADE")!!.toInt()

        if (idade >=5 && idade <=7 ){
            trocarText(texto = "Infantil A  - 5 Á 7 anos.")
            alterarImagemResultado(R.drawable.baby)
        }else if (idade >=8 && idade <=10){
            trocarText(texto = "Infantil B - 8 Á 10 anos.")
            alterarImagemResultado(R.drawable.baby)
        }else if (idade >=11 && idade <=13){
            trocarText(texto = "Juvenil A - 11 Á 13 anos.")
            alterarImagemResultado(R.drawable.juvenil)
        }else if (idade >=14 && idade <=17){
            trocarText(texto = "Juvenil B - 14 Á 17 anos.")
            alterarImagemResultado(R.drawable.juvenil)
        }else if (idade >18){
            trocarText(texto = "Adulto - Maiores de 18 .")
            alterarImagemResultado(R.drawable.nadador)
        }else {
            trocarText(texto = "Categoria Nula.")
            alterarImagemResultado(R.drawable.nadador)
        }
    }

    fun trocarText (texto:String){
        categoria.text = texto
    }

    fun alterarImagemResultado (idImagem: Int){
        ivContexto.setImageDrawable(ContextCompat.getDrawable(this, idImagem))
    }
}