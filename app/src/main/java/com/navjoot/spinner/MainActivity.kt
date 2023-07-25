package com.navjoot.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Spinner
import com.navjoot.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var staticSpinner : Spinner
    lateinit var dynamicSpinner : Spinner
     lateinit var staticSpinnerAdapter : ArrayAdapter<String>
    lateinit var dynamicSpinnerAdapter : ArrayAdapter<StudentModel>
     var staticList= arrayListOf<String>("A","B","C")
    var dynamicList = arrayListOf<StudentModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        staticSpinner =findViewById(R.id.staticSpinner)
        staticSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,staticList)
        staticSpinner.adapter = staticSpinnerAdapter
        dynamicList.add(StudentModel("C",6))
        dynamicList.add(StudentModel("D",7))
        dynamicSpinner =findViewById(R.id.dynamicSpinner)
        dynamicSpinnerAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,dynamicList)
        dynamicSpinner.adapter = dynamicSpinnerAdapter
    }
}