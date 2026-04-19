

package com.mycompany.project1prog1;

/**
 *
 * @author M Lepota
 */
public class Project1prog1 {

    public static void main(String[] args) {
        package com.mycompany.project1prog;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void testValidUsername() {
        assertTrue(Validator.checkUsername("ab_cd"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(Validator.checkUsername("abcdef"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(Validator.checkPassword("Password1!"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(Validator.checkPassword("pass"));
    }

    @Test
    public void testValidCellphone() {
        assertTrue(Validator.checkCellphone("+27831234567"));
    }

    @Test
    public void testInvalidCellphone() {
        assertFalse(Validator.checkCellphone("0831234567"));
    }

