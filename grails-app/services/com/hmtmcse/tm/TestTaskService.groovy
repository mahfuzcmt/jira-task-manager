package com.hmtmcse.tm

import com.hmtmcse.gs.GsConfigService
import com.hmtmcse.gs.GsReflectionUtil
import com.hmtmcse.gs.GsUrlMappingUtil
import com.hmtmcse.gs.GsUtil
import com.hmtmcse.gs.data.GsControllerActionData
import com.hmtmcse.swagger.definition.SwaggerConstant
import com.hmtmcse.swagger.definition.SwaggerDefinition
import com.hmtmcse.swagger.definition.SwaggerPath
import com.hmtmcse.swagger.definition.SwaggerPathParameter
import com.hmtmcse.swagger.definition.SwaggerPathResponse
import com.hmtmcse.swagger.definition.SwaggerProperty


class TestTaskService {

    private SwaggerDefinition swaggerDefinition = new SwaggerDefinition()

    def generate() {
        startSwagger("localhost:8080", GsUrlMappingUtil.apiPrefix())
        GsUrlMappingUtil.getUrlMappingData().each { GsControllerActionData controllerActionData ->
            println(controllerActionData.controllerName + " " + controllerActionData.controllerUrlName + " " + controllerActionData.controllerRealName)
            swaggerJsonByControllerData(controllerActionData)
        }
        return swaggerDefinition.getDefinition()
    }


    void swaggerJsonByControllerData(GsControllerActionData controllerActionData){
        String tagName = GsReflectionUtil.getPropertyValue(controllerActionData.controllerClass, "tagName")?: GsUtil.makeHumReadble(controllerActionData.controllerUrlName)
        String description = GsReflectionUtil.getPropertyValue(controllerActionData.controllerClass, "description")?: ""
        swaggerDefinition.addTag(tagName, description)


        first()
    }



    void startSwagger(String host, String basePath){
        swaggerDefinition = new SwaggerDefinition()
        swaggerDefinition.host(host)
        swaggerDefinition.basePath("/" + basePath)
        swaggerDefinition.scheme("http")
    }


    void first(){


        swaggerDefinition.addTag("Pet Server", "Everything about your Pets")

        SwaggerPath swaggerPath = swaggerDefinition.path()
        SwaggerPathParameter parameter = swaggerDefinition.pathParameter(SwaggerConstant.IN_BODY, "body")
        parameter.description("Pet object that needs to be added to the store");
        parameter.required().schema("Pet")

        swaggerPath.addTag("Pet Server")
        swaggerPath.summary("Add a new pet to the store")
        swaggerPath.addParameter(parameter)

        SwaggerPathResponse response = swaggerDefinition.pathResponse(SwaggerConstant.SUCCESS)
        response.description("Success").schema("array", "Pet")
        swaggerPath.addResponse(response)
        swaggerDefinition.startPaths("/v2/pet").addPath(SwaggerConstant.POST_METHOD, swaggerPath);


        SwaggerProperty  swaggerProperty = swaggerDefinition
                .property("id", "integer").format("int64")
                .property("name", "string").example("doggie");
        swaggerDefinition.addDefinition("Pet", "object").addProperties(swaggerProperty);

    }

}
