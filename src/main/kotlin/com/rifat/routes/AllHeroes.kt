package com.rifat.routes

import com.rifat.models.HeroApiResponse
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import java.lang.NumberFormatException
import java.net.SocketException

fun Route.getAllHeroes() {
    get("/boruto/heroes") {
       try {
           val page = call.request.queryParameters["page"]?.toInt() ?: 1


           call.respond(message = page)
       }catch (e: NumberFormatException) {
           call.respond(
               message = HeroApiResponse(
                   success = false,
                   message = "only numbers allowed",
               ),
               status = HttpStatusCode.BadRequest
           )
       }catch (e: SocketException) {

       }
    }
}