package cl.dyi.myappointments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cl.dyi.myappointments.model.Appointment
import kotlinx.android.synthetic.main.activity_appointments.*

class AppointmentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointments)

        val appointments = ArrayList<Appointment>()
        appointments.add(Appointment(1, "Medico Test", "12/12/2019", "3:30 PM"))
        appointments.add(Appointment(2, "Medico BB", "08/12/2019", "1:30 PM"))
        appointments.add(Appointment(3, "Medico CC", "17/12/2019", "7:30 PM"))

        rvAppointments.layoutManager = LinearLayoutManager(this)  // GridLayoutManager
        rvAppointments.adapter = AppointmentAdapter(appointments)


    }


}
