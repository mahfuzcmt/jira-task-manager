package com.hmtmcse.tm

import grails.core.GrailsApplication

class UrlMappings {


    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        println("Core URL Mapping")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
