package ch012inheritance.exercises;

import domainentities.User;
import domainobject.TestAppEnv;

//Exercise: Create a User that is composed of TestAppEnv
public class UserTestAppEnv extends User {

    public String getUrl() {
        return TestAppEnv.getUrl();
    }
}
