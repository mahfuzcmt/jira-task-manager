package com.hmtmcse.jid.controllers

import com.hmtmcse.jid.PhoneBookService
import grails.converters.JSON

class ContactNumberController {

    PhoneBookService phoneBookService

    def number() {
        [numbers: phoneBookService.getContactNumbersByContactId(params.id)]
    }

    def delete(Integer id){
        render(phoneBookService.deleteContactNumber(id) as JSON)
    }
}
