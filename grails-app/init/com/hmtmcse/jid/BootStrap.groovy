package com.hmtmcse.jid

class BootStrap {


    def init = { servletContext ->
        AppInitializationService.initialize()
    }

    def destroy = {
    }
}
