package Library;

import java.util.*;


public class EncapsulationThree {
    public static void main(String[] args) {
        Library obj = new Library();
        Scanner sc = new Scanner(System.in);
        obj.addBook("B101", "The Last Thing He Told Me");
        obj.addBook("B102", "Every Good Promise Fulfilled");
        obj.addBook("B103", "Keeper of Lost Children");
        obj.addBook("B104", "How to Be Alone");
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t\t\tWelcome to the Library");
        int chooseVal = 0;
        while (chooseVal != 4) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Show All Books");
            System.out.println("4. Exit. ");
            System.out.println("----------------------------------------------------------");
            chooseVal = sc.nextInt();
            switch (chooseVal) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the BookID and BookName: ");
                    String bookID = sc.nextLine();
                    String bookName = sc.nextLine();
                    obj.addBook(bookID, bookName);
                    break;
                case 2:
                    System.out.println("Available Books: ");
                    System.out.println(obj.getAllBooks());
                    System.out.println("Enter the BookID to Remove the Book: ");
                    String bookId = sc.nextLine();
                    obj.removeBook(bookId);
                    System.out.println("Book Removed Successfully!");
                    System.out.println("Available Books: ");
                    System.out.println(obj.getAllBooks());
                    break;
                case 3:
                    Map<String, String> map = obj.getAllBooks();
                    System.out.println("BookID:  BookName");
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + "  : " + entry.getValue());
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        System.out.println("Thank you for using our library!");
        System.out.println("----------------------------------------------------------");

    }
}


