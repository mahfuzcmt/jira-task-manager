package com.hmtmcse.tm.controllers

import com.hmtmcse.tm.TestTaskService
import grails.converters.JSON

class DashboardController {

    TestTaskService testTaskService

    def index() {
        render("Test")
    }

    def swagger(){
        def response = testTaskService.generate()
        render( response as JSON)
    }
}
