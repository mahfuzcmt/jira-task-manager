package com.hmtmcse.tm.controller

import com.hmtmcse.tm.TestTaskService
import com.hmtmcse.tm.User
import grails.converters.JSON

class DashboardController {

    TestTaskService testTaskService

    def index() {
        testTaskService.generate()
        render("Test")
    }
}
