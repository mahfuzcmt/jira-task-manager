package com.hmtmcse.tm.controller.api

import com.hmtmcse.tm.User
import grails.converters.JSON

class ApiUserV2Controller {

    def index() {
        render(User.list() as JSON)
    }
}
