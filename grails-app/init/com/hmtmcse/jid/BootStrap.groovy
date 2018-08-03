package com.hmtmcse.jid

import com.hmtmcse.jirahelper.JIRACommunicator
import grails.util.Holders

class BootStrap {


    def init = { servletContext ->
        JIRACommunicator.JIRA_URL = Holders.config.jid.jiraServer
        AppInitializationService.initialize()
    }

    def destroy = {
    }
}
