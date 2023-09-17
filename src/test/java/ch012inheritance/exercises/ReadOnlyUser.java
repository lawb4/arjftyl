package ch012inheritance.exercises;

import domainentities.User;

public class ReadOnlyUser extends User {

    // There is no need to explicitly define a default constructor for a Child class
    /*public ReadOnlyUser() {
        super();
    }*/

    @Override
    public String getPermission() {
        return "ReadOnly";
    }
}
