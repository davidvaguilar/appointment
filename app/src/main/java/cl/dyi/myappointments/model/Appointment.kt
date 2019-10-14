package cl.dyi.myappointments.model

data class Appointment(
    val id: Int,
    val doctorName: String,
    val scheduleDate: String,
    val scheduleTime: String
)