package br.com.stts.prevenda

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import com.github.rubensousa.floatingtoolbar.FloatingToolbar
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity: AppCompatActivity(){

    var param = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_products)

        fab_back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        //-- -- Definição da barra de filtros -- --//
        filterToolbar.attachFab(fab)

        //-- -- Clique do botão da barra de filtros -- --//
        fab.setOnClickListener {
            filterToolbar.show()
        }

        filterToolbar.setClickListener(object : FloatingToolbar.ItemClickListener {
            override fun onItemClick(item: MenuItem) {
                val id = item.itemId

                if (id === R.id.filter_name) {
                    param = "name"
                }else if (id === R.id.filter_price){
                    param = "price"
                }else if (id === R.id.filter_stock) {
                    param = "stock"
                }
            }

            override fun onItemLongClick(item: MenuItem) {

            }
        })


    }
}