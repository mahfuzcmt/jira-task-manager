package com.hmtmcse.tm.controllers

import com.hmtmcse.tm.User
import grails.rest.RestfulController

class TestRestController extends RestfulController{

    TestRestController() {
        super(User)
    }

}
