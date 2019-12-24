package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of members: ");
        int numberOfMembers = scanner.nextInt();
        System.out.println();
        ChatService.initMembers(numberOfMembers);
        String memberName;
        while (true) {
            System.out.println("Choose one of the options");
            System.out.println("1. Start chatting");
            if (scanner.nextInt() == 1) {
                System.out.print("Enter your name to start chatting: ");
                memberName = scanner.next();
                if (ChatService.isMember(memberName)) ChatService.startChat(memberName);
                else {
                    System.out.println("There is no member with this name");
                    System.out.println("Try again");
                }
            } else {
                System.out.println("Enter valid number");
                break;
            }
        }
    }
}