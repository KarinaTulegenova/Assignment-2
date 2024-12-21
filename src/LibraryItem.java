import java.util.Objects;
//abstract is used thus it cannot be directly created. It serves as the basis for other classes that will inherit it.
public abstract class LibraryItem {
    private String title;
    private boolean isBorrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem() {
        isBorrowed = true;
    }

    public void returnItem() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return title + (isBorrowed ? " (Borrowed)" : " (Available)");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
