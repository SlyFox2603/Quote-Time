package com.example.quotetime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InspireActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inspire)

        val backButton = findViewById<Button>(R.id.btnBackInspire)
        backButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        // List of inspirational quotes to draw from
        val inspireQuotes = listOf(
            "\"Believe you can and you’re halfway there.\" - Teddy Roosevelt",
            "\"Even if I knew that tomorrow the world would go to pieces, I would still plant my apple tree.\" - Martin Luther",
            "\"Life is 10% what happens to us and 90% how we react to it.\" - Dennis P. Kimbro",
            "\"Whether you think you can or think you can’t, you’re right.\" - Henry Ford",
            "\"The journey of a thousand miles begins with one step.\" - Lao Tzu",
            "\"Everything you can imagine is real.\" - Pablo Picasso",
            "\"In the middle of every difficulty lies opportunity.\" - Albert Einstein",
            "\"If you can dream it, you can do it.\" - Walt Disney",
            "\"Tough times never last, but tough people do.\" - Robert Schuller",
            "\"Try to be a rainbow in someone’s cloud.\" - Maya Angelou",
            "\"Do not let what you cannot do interfere with what you can do.\" - John Wooden",
            "\"You must be the change you wish to see in the world.\" - Mahatma Gandhi",
            "\"Weaknesses are just strengths in the wrong environment.\" - Marianne Cantwell",
            "\"Many of life’s failures are experienced by people who did not realize how close they were to success when they gave up.\" - Thomas Edison",
            "\"It always seems impossible until it’s done.\" - Nelson Mandela",
            "\"You are never too old to set another goal or to dream a new dream.\" - Malala Yousafzai"
        )

        val txtQuoteMotivate = findViewById<TextView>(R.id.txtQuoteInspire)
        var lastQuote: String? = null

        // Generate random quote without repeating previous quote
        fun generateRandomQuote() {
            var randomQuote: String
            do {
                randomQuote = inspireQuotes.random()
            } while (randomQuote == lastQuote)
            lastQuote = randomQuote
            txtQuoteMotivate.text = randomQuote
        }

        // Generate initial quote
        generateRandomQuote()

        // Generate a quote when the Get Another Quote button is pressed
        val regenButton = findViewById<Button>(R.id.btnRegenInspire)
        regenButton.setOnClickListener {
            generateRandomQuote()
        }
    }
}