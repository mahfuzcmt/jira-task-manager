package com.hmtmcse.tm

import com.hmtmcse.gs.GsUrlMappingUtil
import com.hmtmcse.gs.data.GsControllerActionData


class TestTaskService {

    def generate() {
        GsUrlMappingUtil.getUrlMappingData().each { GsControllerActionData controllerActionData ->
            println(controllerActionData.controllerName + " " + controllerActionData.controllerUrlName + " " + controllerActionData.controllerRealName)
        }
    }


}
