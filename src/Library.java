import java.util.ArrayList; // Dynamic array
import java.util.Collections; // For sorting lists
import java.util.Comparator; // Compares objects by the value of their title field
import java.util.List; // ArrayList is an implementation of this interface
import java.util.stream.Collectors; // Collects the filtered items back into the list

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    // Добавление элемента в библиотеку
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Вывод всех элементов библиотеки
    public void displayItems() {
        System.out.println("\n===== All Books =====");
        for (LibraryItem item : items) {
            System.out.println(item);
        }
        System.out.println("=====================\n");
    }

    // Поиск элемента по названию
    public LibraryItem findItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    // Вывод доступных (не занятых) элементов
    public void displayAvailableItems() {
        List<LibraryItem> availableItems = items.stream()
                .filter(item -> !item.isBorrowed())
                .collect(Collectors.toList());
        System.out.println("\n===== Available Books =====");
        for (LibraryItem item : availableItems) {
            System.out.println(item);
        }
        System.out.println("===========================\n");
    }

    // Сортировка списка по названию
    public void sortItems() {
        Collections.sort(items, Comparator.comparing(LibraryItem::getTitle));
    }

    // Сортировка и вывод отсортированного списка
    public void displaySortedItems() {
        sortItems(); // Сортирует список
        System.out.println("\n===== Sorted Books =====");
        displayItems(); // Выводит отсортированный список
    }
}
