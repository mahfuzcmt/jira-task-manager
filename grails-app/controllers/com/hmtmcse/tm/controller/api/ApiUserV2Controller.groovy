package com.hmtmcse.tm.controller.api

import com.hmtmcse.gs.GsUrlMappingUtil
import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gs.data.GsApiVersionActionsData
import com.hmtmcse.tm.User
import com.hmtmcse.tm.UserDefinitionService
import grails.converters.JSON

class ApiUserV2Controller extends GsRestProcessor {


    UserDefinitionService userDefinitionService

    def index() {

        userDefinitionService.getUserList()

        render(User.list() as JSON)
        println("Yes")
    }


    def gs(){
        return list(userDefinitionService.getUserList())
    }

    def gsGet(){
        return get(userDefinitionService.getUserList())
    }

    def xyz() {
        GsUrlMappingUtil.getUrlMappingData().each { GsApiVersionActionsData urls ->
            println(urls.versionPrefix)
        }
        gsReadResponse(null)
    }

    def customMarshaller() {
        JSON.registerObjectMarshaller(User){
            def output = [:]
            output['id'] = it.id
            return output
        }
        render(User.list() as JSON)
    }
}
