package com.hmtmcse.tm.controller

import com.hmtmcse.tm.User
import grails.rest.RestfulController

class TestRestController extends RestfulController{

    TestRestController() {
        super(User)
    }

}
