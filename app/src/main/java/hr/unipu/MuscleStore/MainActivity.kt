package hr.unipu.MuscleStore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.widget.SwitchCompat
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);


        val toSettingsCardButton: CardView = findViewById(R.id.settingsButton)


        toSettingsCardButton.setOnClickListener {
            // Handle click event, for example, start a new activity
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

    }
}