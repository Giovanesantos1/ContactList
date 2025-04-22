package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
    }
}

val contacts = listOf(
    Contact(
        "Giovane",
        "(55) 21 99275-3451",
        R.drawable.sample2
    ),
    Contact(
        "Myllena",
        "(55) 21 97592-5134",
        R.drawable.sample1
    ),
    Contact(
        "Kiara",
        "(55) 21 91543-2957",
        R.drawable.sample3
    ),
    Contact(
        "Tutti",
        "(55) 21 97834-9210",
        R.drawable.sample4
    ),
    Contact(
        "Carol",
        "(55) 21 90945-7895",
        R.drawable.sample5
    ),
    Contact(
        "Isa",
        "(55) 21 98954-0022",
        R.drawable.sample6
    ),
    Contact(
        "Kim",
        "(55) 21 98031-8345",
        R.drawable.sample7
    ),
    Contact(
        "Douglas",
        "(55) 21 96737-7699",
        R.drawable.sample8
    ),
    Contact(
        "Enzo",
        "(55) 21 98904-7985",
        R.drawable.sample9
    ),
    Contact(
        "Paulo",
        "(55) 21 98547-6544",
        R.drawable.sample10
    ),
    Contact(
        "Juliana",
        "(55) 21 98907-8908",
        R.drawable.sample11
    ),
    Contact(
        "Roque",
        "(55) 21 95234-5434",
        R.drawable.sample12
    ),
    Contact(
        "Patricia",
        "(55) 21 96593-6834",
        R.drawable.sample13
    ),
    Contact(
        "Gustavo",
        "(55) 21 97895-5632",
        R.drawable.sample14
    ),
    Contact(
        "Bianca",
        "(55) 21 99798-7583",
        R.drawable.sample15
    ),
    Contact(
        "Ingrid",
        "(55) 21 92635-6836",
        R.drawable.sample16
    ),

)