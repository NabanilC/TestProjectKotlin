package com.example.nabanilc.testprojectkotlin

import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.ProgressBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {
            /*val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)*/

            Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()



            val builder = AlertDialog.Builder(this@Main2Activity)

            builder.setMessage("Ok??")

            builder.setPositiveButton("YES"){_,_ ->
                Toast.makeText(this@Main2Activity,"Its Ok",Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No"){_,_ ->
                Toast.makeText(this@Main2Activity,"Not Ok",Toast.LENGTH_SHORT).show()
            }
            builder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(this@Main2Activity,"Maybe",Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()


            val progressDialog = ProgressDialog(this)
            progressDialog.setMessage("Loading ... ")
            progressDialog.show()


           //displays the progress bar
        }

    }
}
