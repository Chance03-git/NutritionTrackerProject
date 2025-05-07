package com.example.project5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


const val ENTRY_EXTRA = "ENTRY_EXTRA"

class EntryActivity : AppCompatActivity() {
    private lateinit var foodEntryView: EditText
    private lateinit var caloriesEntryView: EditText
    private lateinit var submitButtonView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)

        foodEntryView = findViewById(R.id.foodEntry)
        caloriesEntryView = findViewById(R.id.caloriesEntry)
        submitButtonView = findViewById(R.id.submitButton)

        submitButtonView.setOnClickListener {
            Log.d("EntryActivity", "submit clicked")
            val intent = Intent(this, ListActivity::class.java)
            val food = DisplayFood(foodEntryView.text.toString(), caloriesEntryView.text.toString().toLong())
            intent.putExtra(ENTRY_EXTRA, food)
            this.startActivity(intent)
        }
    }
}
