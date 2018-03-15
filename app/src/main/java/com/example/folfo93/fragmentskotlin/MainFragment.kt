package com.example.folfo93.fragmentskotlin

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import org.jetbrains.anko.support.v4.toast


class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_main, container)
    }


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Le damos funcionalidad al boton
        main_button.setOnClickListener {
            //Mostramos toast
            toast("Mensaje: ${main_editText.text}")
            main_textview.text = main_editText.text

            //Utilizamos 'activity' para indicar el context; al ser un fragment, el context es la activity que lo contiene.
            val datos = Intent(activity,Main2Activity::class.java)
            datos.putExtra("key1","valor1")
            startActivity(datos)
        }
    }
}
