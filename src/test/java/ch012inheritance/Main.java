package ch012inheritance;

import domainentities.AdminUser;
import domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {

    @Test
    public void emptyUserExampleTest() {
        EmptyUser eUser = new EmptyUser();
        assertEquals("username", eUser.getUsername());
        assertEquals("password", eUser.getPassword());
    }

    @Test
    public void userHasNormalPermissions() {
        User user = new User();
        assertEquals("Normal", user.getPermission());
    }

    @Test
    public void anAdminUserDefaultConstructor(){
        AdminUser adminUser = new AdminUser();
        assertEquals("adminuser", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }
    @Test
    public void anAdminUserHasElevatedPermissions(){
        AdminUser adminUser = new AdminUser("admin","Passw0rd");
        assertEquals("admin", adminUser.getUsername());
        assertEquals("Passw0rd", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }
}
