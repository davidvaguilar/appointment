package cl.dyi.myappointments.io.response

import cl.dyi.myappointments.model.User

data class LoginResponse (
    val success: Boolean,
    val user: User,
    val jwt: String
)