package com.example.campsitecommander

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    private val itemNames = arrayListOf<String>()
    private  val categories = arrayListOf<String>()
    private val quantities = arrayListOf<Int>()
    private val comments = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtItem= findViewById<EditText>(R.id.edtItem)
        val edtCategory= findViewById<EditText>(R.id.edtCategory)
        val edtQuantity= findViewById<EditText>(R.id.edtQuantity)

        val btnAdd= findViewById<EditText>(R.id.btnAddGear)
        val btnDetailedViewActivity= findViewById<EditText>(R.id.btnSaveGear)
        val txtTotal= findViewById<EditText>(R.id.txtDetails)


        //Dummy Data

        itemNames.add("Tent")
        categories.add("Shelter")
        quantities.add(1)
        comments.add("4-people waterproof")

        itemNames.add("Marshmellow")
        categories.add("Food")
        quantities.add(3)
        comments.add("For S'MORES")

        itemNames.add("Flashlight")
        categories.add("Safety")
        quantities.add(2)
        comments.add("check batteries")

        updateTotal(txtTotal)

        btnAdd.setOnClickListener {
            if (
                edtItem.text.isEmpty()||
                edtCategory.text.isEmpty()||
                edtQuantity.text.isEmpty()
            )
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
