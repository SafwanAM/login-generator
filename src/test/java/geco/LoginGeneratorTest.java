package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 21305507 on 22/11/2016.
 */
public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForPaulDurand() throws Exception {
        String PDUR = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("PDUR", PDUR);
    }

    @Test
    public void generateLoginForJohnRalling() throws Exception {
        String JRAL = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals("JRAL2", JRAL);
    }

    @Test
    public void generateLoginForPaulDuurand() throws Exception {
        String PDUR = loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertEquals("PDUR", PDUR);
    }
}