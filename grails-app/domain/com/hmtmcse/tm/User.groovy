package com.hmtmcse.tm

class User {

    Integer id
    String name
    String email
    String password
    String uuid
    Boolean isExternal = false
    Date dateCreated
    Date lastUpdated
    Complexity complexity

    Double doubleNumber
    Float floatNumber
    Long longNumber


    static constraints = {
    }
}
