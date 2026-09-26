package edu.iau.cshj.csc402.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import edu.iau.cshj.csc402.lab3.ui.theme.CSC402Lab3t123Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CSC402Lab3t123Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StudentCard(
                        student = Student(
                            name = "jouri alshurie",
                            program = "Computer Science - Level 4",
                            gpa = "4.62",
                            email = "220001234@iau.edu.sa",
                            city = "Jubail, Eastern Province"
                        ),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}