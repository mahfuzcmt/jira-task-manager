package com.hmtmcse.tm

class BootStrap {

    def init = { servletContext ->
        println("Called Core Bootstrap")
        [1,2,3,4,5,6,7,8,9,10].each {
            print(it)
            new User(name: "Name " + it, email: "email " + it, password: "xxx " + it, uuid: "uuid " + it).save(flush:true)
        }


    }

    def destroy = {
    }
}
