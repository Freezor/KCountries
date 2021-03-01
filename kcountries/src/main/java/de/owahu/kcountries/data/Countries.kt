package de.owahu.kcountries.data

import kotlinx.serialization.Serializable

@Serializable
data class Countries(
    val countries: List<Country>
)