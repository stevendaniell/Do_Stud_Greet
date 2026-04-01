package com.stugreet;

public class GreetingPortal {
    
    public String greetStudent(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            return "Welcome, Student!";
        }
        return "Hello, " + studentName.trim() + "! Welcome to the Student Portal.";
    }
    
    public String getGreetingByTime(String studentName, int hour) {
        String timeGreeting;
        if (hour >= 5 && hour < 12) {
            timeGreeting = "Good morning";
        } else if (hour >= 12 && hour < 17) {
            timeGreeting = "Good afternoon";
        } else if (hour >= 17 && hour < 21) {
            timeGreeting = "Good evening";
        } else {
            timeGreeting = "Good night";
        }

        if (studentName == null || studentName.trim().isEmpty()) {
            return timeGreeting + ", Student!";
        }
        return timeGreeting + ", " + studentName.trim() + "!";
    }

    public String getPortalVersion() {
        return "Student Greeting Portal v1.0";
    }

    public static void main(String[] args) {
        GreetingPortal portal = new GreetingPortal();
        System.out.println(portal.greetStudent("John Doe"));
        System.out.println(portal.getGreetingByTime("Jane Smith", 10));
    }
}
