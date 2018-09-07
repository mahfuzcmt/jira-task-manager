package com.hmtmcse.tm.controller

import com.hmtmcse.tm.User
import grails.converters.JSON

class DashboardController {

    def index() {
        render(User.list() as JSON)
    }
}
