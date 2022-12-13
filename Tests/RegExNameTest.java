import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExStudentTest {


    @Test
    void getFirstName() {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("A");
        assertTrue(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FirstNameLetterJCapTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("J");
        assertTrue(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterJMoreFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Joe");
        assertFalse(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLettermFalse()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("m");
        assertFalse(tester1.getFirstName().matches("[A-Z]"));
    }

    @Test
    void FNLetterBTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("J");
        assertFalse(tester1.getFirstName().matches("[A-Z][a-z]]"));
    }

    @Test
    void FNLetterBLengthTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Jahsidhaiudhauidaiudhadiuahduiah");
        assertTrue(tester1.getFirstName().matches("[A-Z][a-z]*"));
    }

    @Test
    void FNWithHyphenTrue()
    {
        RegExStudent tester1 = new RegExStudent();
        tester1.setFirstName("Joe-Moma");
        assertTrue(tester1.getFirstName().matches("[a-z]+ ([-][A-Za-z])*"));
    }

    @Test
    void setFirstName() {
    }

    @Test
    void testToString() {
    }
}