package com.rifat.models

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class HeroApiResponse(
    val success: Boolean,
    val message: String? = null,
    val previousPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList()
)
