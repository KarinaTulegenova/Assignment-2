import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryUser user = new LibraryUser("Karina Tulegenova");

        // adding books to the list
        library.addItem(new Book("1984"));
        library.addItem(new Book("Moby Dick"));
        library.addItem(new Book("The Great Gatsby"));
        library.addItem(new Book("My little Java"));
        library.addItem(new Book("Journey to the center of the earth"));
        System.out.print("Welcome to the library");
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {

            System.out.println("\nFunctions of DL: view, available, sort, borrow, return, exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("view")) {
                library.displayItems();

            } else if (command.equalsIgnoreCase("available")) {
                library.displayAvailableItems();

            } else if (command.equalsIgnoreCase("sort")) {
                library.sortItems();

                System.out.println("Sorted list of books");
            } else if (command.equalsIgnoreCase("borrow")) {
                System.out.print("Enter the name of the book ");
                LibraryItem item = library.findItem(scanner.nextLine());
                if (item != null) user.borrowItem(item);
                else System.out.println("Not available");

            } else if (command.equalsIgnoreCase("return")) {
                System.out.print("Enter the name of the book");
                LibraryItem item = library.findItem(scanner.nextLine());
                if (item != null) user.returnItem(item);
                else System.out.println("Not available");

            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Bye!");
                break;

            } else {
                System.out.println("Please enter a valid command");
            }
        }

        scanner.close();
    }
}
