package com.rifat.plugins

import com.rifat.routes.getAllHeroes
import com.rifat.routes.root
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
    }
}
