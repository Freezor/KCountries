package de.owahu.kcountries.data

import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val code: String,
    val name: String
)
