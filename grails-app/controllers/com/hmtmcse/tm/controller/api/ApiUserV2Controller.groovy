package com.hmtmcse.tm.controller.api

import com.hmtmcse.tm.User
import grails.converters.JSON
import grails.rest.RestfulController

class ApiUserV2Controller{


    def index() {
        render(User.list() as JSON)
        println("Yes")
    }

    def xyz() {
        JSON.registerObjectMarshaller(User){
            def output = [:]
            output['id'] = it.id
            return output
        }
        render(User.list() as JSON)
    }
}
