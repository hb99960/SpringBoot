package com.ioc.coupling;

public class MongoDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
