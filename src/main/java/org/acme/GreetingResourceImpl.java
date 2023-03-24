package org.acme;

public class GreetingResourceImpl implements GreetingResource {

    public String hello(String firstname) {
        return "Hello " + firstname;
    }
}