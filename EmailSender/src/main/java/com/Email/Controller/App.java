package com.Email.Controller;

public class App {
    public static void main(String[] args) {

        GEmailSender gEmailSender = new GEmailSender();
        String to = "sh7sangam@gmail.com";
        String from = "jaiswarhitesh647@gmail.com";
        String subject = "Sending email using Gmail";
        String text = "This is a example email send using gmail and java program with out less secure app";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }

    }
}
