/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author M Lepota
 */
package com.mycompany.VALIDATOR.JAVA;

/**
 *
 * @author M Lepota
 */
public class Validator { 

    public static boolean checkUsername(String username) {
        return username.matches("^(?=.*_).{1,5}$");
    }

    public static boolean checkPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
    }

    public static boolean checkCellphone(String cellphone) {
        return cellphone.matches("^\\+27\\d{9}$");
    }
}