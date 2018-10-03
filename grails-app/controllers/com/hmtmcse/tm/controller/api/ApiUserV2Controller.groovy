package com.hmtmcse.tm.controller.api

import com.hmtmcse.gs.GsUrlMappingUtil
import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gs.data.GsApiVersionActionsData
import com.hmtmcse.gs.data.GsControllerActionData
import com.hmtmcse.tm.User
import com.hmtmcse.tm.UserDefinitionService
import grails.converters.JSON

class ApiUserV2Controller extends GsRestProcessor {


    UserDefinitionService userDefinitionService

    def index() {

        userDefinitionService.getUserList()

        render(User.list() as JSON)
    }


    def gs(){
        return list(userDefinitionService.getUserList())
    }

    def gsGet(){
        return get(userDefinitionService.getUserList())
    }

    def xyz() {
        GsUrlMappingUtil.getUrlMappingData().each { GsControllerActionData urls ->

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

    def getList(){
        render([name:"getList"] as JSON)
    }

    def postList(){
        render([name:"postList"] as JSON)
    }

    def postCreate(){
        render([name:"postCreate"] as JSON)
    }

    def postCreateUser(){
        render([name:"postCreateUser"] as JSON)
    }

    def postCreateUserAndRole(){
        render([name:"postCreateUserAndRole"] as JSON)
    }

    def deleteDelete(){
        render([name:"deleteDelete"] as JSON)
    }


}
