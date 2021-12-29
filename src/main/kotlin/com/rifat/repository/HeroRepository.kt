package com.rifat.repository

import com.rifat.models.Hero
import com.rifat.models.HeroApiResponse

interface HeroRepository {
    val heores: Map<Int, List<Hero>>

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): HeroApiResponse
    suspend fun searchHeroes(name: String): HeroApiResponse

}