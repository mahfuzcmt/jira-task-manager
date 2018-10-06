package com.hmtmcse.tm.api

import com.hmtmcse.gs.GsApiActionDefinition

//import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.tm.User

class UserApiDefinition {

    static GsApiActionDefinition getUserList(){
        GsApiActionDefinition definition = new GsApiActionDefinition<User>(User)
        definition.includeOnlyProperty(["name", "email", "id"])
        return definition
    }
}
