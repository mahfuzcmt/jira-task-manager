package com.hmtmcse.jid.controllers

import com.hmtmcse.jid.PhoneBookService

class DashboardController {

    PhoneBookService phoneBookService

    def index() {
        [report: phoneBookService.getReport()]
    }

    def create() {

    }
}
