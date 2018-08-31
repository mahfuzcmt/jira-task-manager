package com.hmtmcse.tm.controller.api

import com.hmtmcse.gs.GsUrlMappingUtil
import com.hmtmcse.gs.controller.GsRestfulController
import com.hmtmcse.gs.data.GsApiVersionActionsData
import com.hmtmcse.tm.User
import grails.converters.JSON

class ApiUserV2Controller extends GsRestfulController{


    def index() {
        render(User.list() as JSON)
        println("Yes")
    }

    def xyz() {
        GsUrlMappingUtil.getUrlMappingData().each { GsApiVersionActionsData urls ->
            println(urls.versionPrefix)
        }
        render("Hi")
    }
}
