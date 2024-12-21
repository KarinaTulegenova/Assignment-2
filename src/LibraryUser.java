public class LibraryUser {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public void borrowItem(LibraryItem item) {
        if (!item.isBorrowed()) {
            item.borrowItem();
            System.out.println(name + " borrowed: " + item.getTitle());
        } else {
            System.out.println("The item is already borrowed: " + item.getTitle());
        }
    }

    public void returnItem(LibraryItem item) {
        if (item.isBorrowed()) {
            item.returnItem();
            System.out.println(name + " returned: " + item.getTitle());
        } else {
            System.out.println("The item is already returned: " + item.getTitle());
        }
    }
}
