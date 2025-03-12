package com.example.m1w2d3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.m1w2d3.ui.theme.M1W2D3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        //I have to uncommint the line to see the run (only one at a time)

//        //1- Linear layout
//        setContentView(R.layout.activity_main)

//        //2- Relative layout
        setContentView(R.layout.relativelayout)

//        //3- Constraint layout
//        setContentView(R.layout.constraintlayout)

    }
}