package cl.dyi.myappointments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.dyi.myappointments.model.Appointment
import kotlinx.android.synthetic.main.item_appointment.view.*

class AppointmentAdapter(private val appointments:ArrayList<Appointment>)
    : RecyclerView.Adapter<AppointmentAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvAppointmentId = itemView.tvAppointmentId
        val tvDoctorName = itemView.tvDoctorName
        val tvScheduledDate = itemView.tvScheduledDate
        val tvScheduledTime = itemView.tvScheduledTime

        fun bind(appointment: Appointment) {
            tvAppointmentId.text = itemView.context.getString(R.string.item_appointment_id, appointment.id)
            tvDoctorName.text = appointment.doctorName
            tvScheduledDate.text = itemView.context.getString(R.string.item_appointment_date, appointment.scheduleDate)
            tvScheduledTime.text = itemView.context.getString(R.string.item_appointment_time, appointment.scheduleTime)
        }
    }

    // Inflates XML items
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_appointment, parent, false)
        )
    }

    // Number of elements
    override fun getItemCount(): Int {
        return appointments.size
    }

    // Binds data
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val appointment = appointments[position]

        holder.bind(appointment)

    }
}