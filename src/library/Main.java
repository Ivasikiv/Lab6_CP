package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library a = new Library("input.json");
        int userChoice = menu();
        while(true) {
            switch(userChoice) {
                case 1:
                    a.sortByYear();
                    System.out.println(a.getAllAvailableBooks());
                    break;
                case 2:
                    System.out.println(a.get2BooksEmails()+"\n\n");
                    break;
                case 3:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter author: ");
                    String auth = input.nextLine();
                    System.out.println("Number of books written by " + auth + " and taken from the library: " + a.authorCount(auth) + "\n\n");
                    break;
                case 4:
                    System.out.println("The largest number of books taken by one person: " + a.largestBookCount() + "\n\n");
                    break;
                case 5:
                    a.newsLetters();
                    break;
                case 6:
                    a.debtors();
                    break;
                case 7:
                    a.printAllTickets();
                    break;
                case 8:
                    a.lendBook();
                    System.out.println("Book was successfully lent!\n\n");
                    break;
                case 9:
                    a.returnBook();
                    System.out.println("Book was successfully returned!\n\n");
                    break;
                case 10:
                    a.save();
                    break;
                default:
                    System.out.println("Wrong input!\n\n");
            }
            userChoice = menu();
        }
    }

    public static int menu() {
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an action:");
        System.out.println("1 - Sort by publication year");
        System.out.println("2 - Get email addresses of users who borrowed more than 2 books");
        System.out.println("3 - Check how many people borrowed books from a selected author");
        System.out.println("4 - Maximum number of books borrowed by a single person");
        System.out.println("5 - News");
        System.out.println("6 - Get a list of debtors");
        System.out.println("7 - Print all tickets");
        System.out.println("8 - Borrow a book");
        System.out.println("9 - Return a book");
        System.out.println("10 - Save");
        selection = input.nextInt();
        return selection;
    }
}
