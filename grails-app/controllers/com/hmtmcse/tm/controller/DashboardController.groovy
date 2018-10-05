package com.hmtmcse.tm.controller

import com.hmtmcse.tm.TestTaskService
import grails.converters.JSON

class DashboardController {

    TestTaskService testTaskService

    def index() {
        testTaskService.generate()
        render("Test")
    }

    def swagger(){
        render( testTaskService.generate() as JSON)
    }
}
