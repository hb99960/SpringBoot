package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "User Details from Database : Loose Coupling";
    }
}
