package com.example.myapplication

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    var cli:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cli = findViewById(R.id.cli)
        cli?.setOnClickListener(View.OnClickListener {
            GlobalScope.launch(Dispatchers.Main) {
                val pro = ProgressDialog(this@MainActivity)
                pro.setCancelable(true)
                pro.show()
               val res =  withContext(Dispatchers.IO){
                    Thread.sleep(5000)
                    Log.e("TAG", "onCreate: ${Thread.currentThread().name}" )
                   "dakf"
                }
                Log.d("TAG", "onCreate: "+res)
                val res1 =  withContext(Dispatchers.IO){
                    Thread.sleep(5000)
                    Log.e("TAG", "onCreate: ${Thread.currentThread().name}" )
                    "dakf"
                }
                Log.d("TAG", "onCreate: "+res1)
                val res2 =  withContext(Dispatchers.IO){
                    Thread.sleep(5000)
                    Log.e("TAG", "onCreate: ${Thread.currentThread().name}" )
                    "dakf"
                }
                Log.d("TAG", "onCreate: "+res2)
                pro.dismiss()
            }
        })
    }
}