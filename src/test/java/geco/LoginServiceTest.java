package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 21305507 on 22/11/2016.
 */
public class LoginServiceTest {

    private LoginService logins;

    @Before
    public void setUp() throws Exception {
        String[] loginsTab = new String[1];
        loginsTab[0] = "ABC";
        logins = new LoginService(loginsTab);
    }

    @Test
    public void loginExists() throws Exception {
        assertTrue(logins.loginExists("ABC"));
        assertFalse(logins.loginExists("XYZ"));
    }

    @Test
    public void addLogin() throws Exception {
        logins.addLogin("AAA");
        logins.addLogin("AAA");
        List<String> allLogins = logins.findAllLogins();
        assertEquals(3, allLogins.size());
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        List<String> allLogins = logins.findAllLoginsStartingWith("A");
        assertEquals(1, allLogins.size());
        logins.addLogin("AAA");
        allLogins = logins.findAllLoginsStartingWith("A");
        assertEquals(2, allLogins.size());
        allLogins = logins.findAllLoginsStartingWith("B");
        assertEquals(0, allLogins.size());
    }

    @Test
    public void findAllLogins() throws Exception {
        List<String> allLogins = logins.findAllLogins();
        assertEquals(1, allLogins.size());
        logins.addLogin("AAA");
        allLogins = logins.findAllLogins();
        assertEquals(2, allLogins.size());
    }
}
