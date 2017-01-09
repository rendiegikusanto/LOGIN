package com.rendi.tutorial.login;

/**
 * Created by user on 1/4/2017.
 */

public class AppVar {

    //URL to our login.php file, url bisa diganti sesuai dengan alamat server kita
    public static final String LOGIN_URL = "https://ariganesha.000webhostapp.com/probal/login.php";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "User_Name";
    public static final String KEY_PASSWORD = "Password";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";
}
