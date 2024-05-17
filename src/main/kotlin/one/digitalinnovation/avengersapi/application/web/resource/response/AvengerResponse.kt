package one.digitalinnovation.avengersapi.application.web.resource.response

import one.digitalinnovation.avengersapi.domain.avenger.Avenger

data class AvengerResponse(
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
) {
    companion object {
        fun from(avenger: Avenger) = AvengerResponse(
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.description,
            history = avenger.history
        )
    }
}
