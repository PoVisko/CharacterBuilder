package com.example.registracija;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final String VALID_CREDENTIALS_REGEX ="^[A-Za-z0-9.-]{5,13}$";
    private static final String VALID_EMAIL_ADDRESS_REGEX = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";


    public static boolean isValidCredentials(String credentials){
        Pattern credentialsPattern = Pattern.compile(VALID_CREDENTIALS_REGEX);
        Matcher credentialsMatcher = credentialsPattern.matcher(credentials);
        return credentialsMatcher.find();
    }

    public static boolean isValidEmail(String email){
        Pattern emailPattern = Pattern.compile(VALID_EMAIL_ADDRESS_REGEX);
        Matcher emailMatcher = emailPattern.matcher(email);
        return emailMatcher.find();
    }
}
