package assignment_42_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import assignment_42.EmailValidator;

public class EmailValidatorTest {

    // Create an instance of EmailValidator to test its methods
    private EmailValidator emailValidator = new EmailValidator();

    @Test
    public void testIsValidEmail() {
        assertTrue(emailValidator.isValidEmail("user@example.com"));
        assertFalse(emailValidator.isValidEmail("invalid_email"));
        assertFalse(emailValidator.isValidEmail("user@.com"));
        assertFalse(emailValidator.isValidEmail("user@com"));
        assertFalse(emailValidator.isValidEmail("user@company@com"));
        assertFalse(emailValidator.isValidEmail(null));
    }

    @Test
    public void testIsCorporateEmail() {
        assertFalse(emailValidator.isCorporateEmail("user@example.com"));
        assertTrue(emailValidator.isCorporateEmail("kellywakasa@company.com"));
        assertFalse(emailValidator.isCorporateEmail("employee@company.org"));
        assertFalse(emailValidator.isCorporateEmail("employee@companycom"));
        assertFalse(emailValidator.isCorporateEmail("employee@company"));
        assertFalse(emailValidator.isCorporateEmail(null));
    }

    
}
