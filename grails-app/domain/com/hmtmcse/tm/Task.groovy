package com.hmtmcse.tm

class Task {



    Task parent

    static hasMany = [subTask: Task]

    static constraints = {
        parent(nullable: true)
    }
}
