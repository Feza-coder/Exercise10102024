package org.Melissa.Develhope.carproject;

// Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

public class DefangedIPAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        String ipAddress = "182.192.1.6";
        String defangedAddress = defangIPaddr(ipAddress);
        System.out.println("Original IP Address: " + ipAddress);
        System.out.println("Defanged IP Address: " + defangedAddress);
    }
}