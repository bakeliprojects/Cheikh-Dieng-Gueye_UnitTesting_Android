package com.bakeli.androidunittesting;
import org.junit.Test;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class EmailTest {

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertThat(EmailValidator.isValidEmail("name@email.com"), is(true));
    }

    @Test
    public void emailValidator_IncorrectEmail_ReturnsFalse() {
        assertThat(EmailValidator.isValidEmail("@email.com"), is(true));
    }

    @Test
    public void emailValidator_DoubleSign_ReturnsFalse() {
        assertThat(EmailValidator.isValidEmail("name@@email.com"), is(true));
    }

    @Test
    public void emailValidator_WithoutEnding_ReturnsFalse() {
        assertThat(EmailValidator.isValidEmail("name@email"), is(true));
    }

    @Test
    public void emailValidator_WithoutKeySign_ReturnsFalse() {
        assertThat(EmailValidator.isValidEmail("nameemail.com"), is(true));
    }

}