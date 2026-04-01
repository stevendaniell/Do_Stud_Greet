package com.stugreet;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingPortalTest {
    
    @Test
    public void testGreetStudent() {
        GreetingPortal portal = new GreetingPortal();
        assertEquals("Hello, John! Welcome to the Student Portal.", portal.greetStudent("John"));
    }
    
    @Test
    public void testGreetStudentEmpty() {
        GreetingPortal portal = new GreetingPortal();
        assertEquals("Welcome, Student!", portal.greetStudent(""));
    }
    
    @Test
    public void testGreetingByTime() {
        GreetingPortal portal = new GreetingPortal();
        assertTrue(portal.getGreetingByTime("Alice", 10).contains("Good morning"));
        assertTrue(portal.getGreetingByTime("Bob", 14).contains("Good afternoon"));
        assertTrue(portal.getGreetingByTime("Carol", 19).contains("Good evening"));
    }
}
