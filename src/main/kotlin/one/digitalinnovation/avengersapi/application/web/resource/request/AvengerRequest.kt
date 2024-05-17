package one.digitalinnovation.avengersapi.application.web.resource.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import one.digitalinnovation.avengersapi.domain.avenger.Avenger

data class AvengerRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val nick: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val person: String,

    val description: String? = "",

    val history: String? = ""
) {
    fun toAvenger() = Avenger(nick, person, description, history)
}
