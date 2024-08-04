package com.loose.coupling;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching data from WebService : Loose coupling";
    }
}
