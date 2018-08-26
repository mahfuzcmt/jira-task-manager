package com.hmtmcse.tm

import grails.core.GrailsApplication

class UrlMappings {


    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/**"(controller: "dashboard", action: "index")


        "/"(controller: "dashboard", action: "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
