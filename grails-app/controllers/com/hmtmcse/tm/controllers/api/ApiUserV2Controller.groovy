package com.hmtmcse.tm.controllers.api


import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.tm.api.UserApiDefinition
import com.hmtmcse.tm.UserDefinitionService

class ApiUserV2Controller extends GsRestProcessor {


    UserDefinitionService userDefinitionService

    @Override
    void swaggerInit() {
        tagDescription = "This API Responsible For User Management"
    }
//
//
//    def index() {
//
//        userDefinitionService.getUserList()
//
//        render(User.list() as JSON)
//    }
//
//
//    def gs(){
//        return list(userDefinitionService.getUserList())
//    }
//
//    def gsGet(){
//        return get(userDefinitionService.getUserList())
//    }
//
//    def xyz() {
//        GsUrlMappingUtil.getUrlMappingData().each { GsControllerActionData urls ->
//
//        }
//        gsReadResponse(null)
//    }
//
//    def customMarshaller() {
//        JSON.registerObjectMarshaller(User){
//            def output = [:]
//            output['id'] = it.id
//            return output
//        }
//        render(User.list() as JSON)
//    }

    def getList(){
        return list(UserApiDefinition.getUserList())
    }
//
//    def postList(){
//        render([name:"postList"] as JSON)
//    }
//
//    def postCreate(){
//        render([name:"postCreate"] as JSON)
//    }
//
//    def postCreateUser(){
//        render([name:"postCreateUser"] as JSON)
//    }
//
//    def postCreateUserAndRole(){
//        render([name:"postCreateUserAndRole"] as JSON)
//    }
//
//    def deleteDelete(){
//        render([name:"deleteDelete"] as JSON)
//    }


}
