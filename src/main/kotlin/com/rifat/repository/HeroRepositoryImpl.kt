package com.rifat.repository

import com.rifat.models.Hero
import com.rifat.models.HeroApiResponse

class HeroRepositoryImpl: HeroRepository {
    override val heores: Map<Int, List<Hero>>
        get() = TODO("Not yet implemented")
    override val page1: List<Hero>
        get() = TODO("Not yet implemented")
    override val page2: List<Hero>
        get() = TODO("Not yet implemented")
    override val page3: List<Hero>
        get() = TODO("Not yet implemented")
    override val page4: List<Hero>
        get() = TODO("Not yet implemented")
    override val page5: List<Hero>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHeroes(page: Int): HeroApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchHeroes(name: String): HeroApiResponse {
        TODO("Not yet implemented")
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}