package day7.libraryProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main (String[] args) {

        List<Book> library = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String req = "Y";

        do {
            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();


            Book book = new Book(bookId, title);
            library.add(book);

            System.out.print("\ndo you want to add another book [Y/N]: ");
            req = sc.nextLine();

        }while(req.equalsIgnoreCase("Y"));
        System.out.println();

        displayLibraryStock(library);
    }

    private static void displayLibraryStock(List<Book> library){
        System.out.println("\n================== EDUREKA LIBRARY ==================" );
        for(Book bk: library){
            System.out.println(bk); //call toString()
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
