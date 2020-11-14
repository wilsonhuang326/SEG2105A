package com.example.lab7;

import org.junit.Test;

import static org.junit.Assert.*;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import android.util.Patterns;
import androidx.annotation.Nullable;

public class MainActivityTest {


    //create one JUnit test here
//    @Test
//    public void nameOfTest() {
//
//    }
    @Test
    public void validate_firstname_false(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidUsername("users");
//        assertEquals(true, result);
        assertThat(result, is(false));
    }
    @Test
    public void validate_lastname_false(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidLastname("tests");
//        assertEquals(true, result);
        assertThat(result, is(false));

    }
    @Test
    public void validate_email_false(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidEmail("email@gmail.coms");
//        assertEquals(true, result);
        assertThat(result, is(false));

    }
    @Test
    public void validate_password_false(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidPassword("admins");
//        assertEquals(true, result);
        assertThat(result, is(false));

    }

    @Test
    public void validate_firstname_true(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidUsername("user");
//        assertEquals(true, result);
        assertThat(result, is(true));
    }
    @Test
    public void validate_lastname_true(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidLastname("test");
//        assertEquals(true, result);
        assertThat(result, is(true));

    }
    @Test
    public void validate_email_true(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidEmail("email@gmail.com");
//        assertEquals(true, result);
        assertThat(result, is(true));

    }
    @Test
    public void validate_password_true(){
//        assertThat(MainActivity.("name@email.com")).isTrue();
//        MainActivity mainActivity=new MainActivity();
        boolean result=MainActivity.isValidPassword("admin");
//        assertEquals(true, result);
        assertThat(result, is(true));

    }



}
