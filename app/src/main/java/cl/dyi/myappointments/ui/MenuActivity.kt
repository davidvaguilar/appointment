package cl.dyi.myappointments.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.dyi.myappointments.PreferenceHelper
import cl.dyi.myappointments.PreferenceHelper.set
import cl.dyi.myappointments.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnCreateAppointment.setOnClickListener{
            val intent = Intent(this, CreateAppointmentActivity::class.java)
            startActivity(intent)
        }

        btnMyAppointment.setOnClickListener {
            val intent = Intent(this, AppointmentsActivity::class.java)
            startActivity(intent)
        }

        btnLogOut.setOnClickListener{
            clearSessionPreferences()
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }

    private fun clearSessionPreferences(){
        // PreferenceManager.getDefaultSharedPreferences()   // cl.dyi.myappointments
        /*
        val preferences = getSharedPreferences("general", Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putBoolean("session", false)
        editor.apply()
        */
        val preferences = PreferenceHelper.defaultPrefs(this)
        preferences["session"] = false
    }
}
