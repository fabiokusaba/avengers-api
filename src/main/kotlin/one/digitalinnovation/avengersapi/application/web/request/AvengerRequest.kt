package one.digitalinnovation.avengersapi.application.web.request

data class AvengerRequest(
    val nick: String,
    val person: String,
    val description: String,
    val history: String
)
