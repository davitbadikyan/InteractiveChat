package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChatService {
    private static int memberInput;
    private static ChatMember[] chatMembers;
    private static String messageOfMember;
    private static String currentTime;

    public static ChatMember[] getMembers() {
        return chatMembers;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void initMembers(int numberOfMembers) {
        chatMembers = new ChatMember[numberOfMembers];
        for (int i = 0; i < numberOfMembers; i++) {
            chatMembers[i] = new ChatMember();
            System.out.print("Enter member name: ");
            chatMembers[i].setName(scanner.nextLine());
        }
        System.out.println();
    }

    public static boolean isMember(String memberName) {
        boolean isMember = false;
        for (int i = 0; i < chatMembers.length; i++) {
            if (memberName.equals(chatMembers[i].getName())) {
                isMember = true;
            }
        }
        return isMember;
    }

    public static void startChat(String memberName) {
        System.out.println("Welcome " + memberName);
        System.out.println("Choose one of the options");
        System.out.println("1. Send Massage");
        System.out.println("2. Exit Massage");
        memberInput = scanner.nextInt();
        if (memberInput == 1) typeMessage(memberName);
        if (memberInput == 2) {
            System.out.println("You have exited chat mode");
            System.out.println();
        }
    }
    public static void typeMessage(String memberName){
        while(true){
            currentTime = returnCurrentDate();
            System.out.print(currentTime + " " + memberName + ": ");
            Scanner scanner = new Scanner(System.in);
            messageOfMember = scanner.nextLine();
            if(messageOfMember.equals("2")) {
                System.out.println("You have exited from chat mode");
                System.out.println();
                break;
            }
            if(messageOfMember.equals("")) {

            }
        }
    }
    public static String returnCurrentDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return format.format(date).toString();
    }

}

