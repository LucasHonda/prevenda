package br.com.stts.prevenda

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        products.setOnClickListener {
            println("PRODUTOS")

            val intent = Intent(this, ProductsActivity::class.java)
            // To pass any data to next activity
            // intent.putExtra("keyIdentifier", value)
            // start your next activity
            startActivity(intent)

        }

        shoppingcart.setOnClickListener {
            println("Carrinho")
        }

        previoussales.setOnClickListener {
            println("Vendas anteriores")
        }

        add.setOnClickListener {
            println("Cadastro de produtos")
        }

        warehouse.setOnClickListener {
            println("Estoque")
        }

        settings.setOnClickListener {
            println("Configurações")
        }
    }
}
