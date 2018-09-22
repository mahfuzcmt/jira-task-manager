package com.hmtmcse.tm

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.GsApiDefinition


class UserDefinitionService extends GsApiDefinition{


    def getUserList(){
        definition = new GsApiActionDefinition<User>(User)
        definition.includeOnlyProperty(["name", "email"])
        return definition
    }


}
