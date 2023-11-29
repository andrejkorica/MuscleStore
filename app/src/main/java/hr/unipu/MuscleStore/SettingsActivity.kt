package hr.unipu.MuscleStore

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat

class SettingsActivity : AppCompatActivity() {

    private lateinit var darkModeSwitch: SwitchCompat
    private lateinit var sharedPreferences: SharedPreferences
    private fun toggleDarkMode(isChecked: Boolean){
        if(isChecked)
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        sharedPreferences.edit().putBoolean("darkMode", AppCompatDelegate.
        getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
            .apply()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings);
        sharedPreferences = getPreferences(Context.MODE_PRIVATE)

        darkModeSwitch = findViewById(R.id.darkSwitch)
        darkModeSwitch.isChecked = sharedPreferences.getBoolean("darkMode", false)

        darkModeSwitch.setOnCheckedChangeListener { _, isChecked ->
            toggleDarkMode(isChecked)
        }


    }




}