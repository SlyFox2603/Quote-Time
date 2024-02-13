package com.example.quotetime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MotivateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivate)

        val backButton = findViewById<Button>(R.id.btnBackMotivate)
        backButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        // List of motivational quotes to draw from
        val motivateQuotes = listOf(
            "\"The best way to predict the future is to create it.\" - Abraham Lincoln",
            "\"If you’re going through hell, keep going.\" - Winston Churchill",
            "\"Start where you are. Use what you have. Do what you can.\" - Arthur Ashe",
            "\"Better to do something imperfectly than to do nothing flawlessly.\" - Robert Schuller",
            "\"We aim above the mark to hit the mark.\" - Ralph Waldo Emerson",
            "\"Much of the stress that people feel doesn't come from having too much to do. It comes from not finishing what they’ve started.\" - David Allen",
            "\"Keep your eyes on the stars, and your feet on the ground.\" - Theodore Roosevelt",
            "\"If the decisions you make about where you invest your blood, sweat, and tears are not consistent with the person you aspire to be, you’ll never become that person.\" - Clayton M. Christensen",
            "\"Obstacles don’t have to stop you. If you run into a wall, don’t turn around and give up.\" - Michael Jordan",
            "\"If you can imagine it, you can achieve it; if you can dream it, you can become it.\" - William Arthur Ward",
            "\"It is during our darkest moments that we must focus to see the light.\" - Aristotle Onassis",
            "\"Real difficulties can be overcome; it is only the imaginary ones that are unconquerable.\" - Theodore N. Vail",
            "\"I can’t change the direction of the wind, but I can adjust my sails to always reach my destination.\" - Jimmy Dean",
            "\"I would rather die of passion than of boredom.\" - Vincent van Gogh",
            "\"Don’t judge each day by the harvest you reap but by the seeds that you plant.\" - Robert Louis Stevenson",
            "\"Find a victory in every defeat to remain hopeful, and find a defeat in every victory to remain humble.\" - Orrin Woodward"
        )

        val txtQuoteMotivate = findViewById<TextView>(R.id.txtQuoteMotivate)
        var lastQuote: String? = null

        // Generate random quote without repeating previous quote
        fun generateRandomQuote() {
            var randomQuote: String
            do {
                randomQuote = motivateQuotes.random()
            } while (randomQuote == lastQuote)
            lastQuote = randomQuote
            txtQuoteMotivate.text = randomQuote
        }

        // Generate initial quote
        generateRandomQuote()

        // Generate a quote when the Get Another Quote button is pressed
        val regenButton = findViewById<Button>(R.id.btnRegenMotivate)
        regenButton.setOnClickListener {
            generateRandomQuote()
        }
    }
}