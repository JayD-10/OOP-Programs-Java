class Book {
    String title;
    Book(String title) { this.title = title; }
    public String toString() { return title; }
}

class BookshopInventory {
    Book[] inventory = new Book[10];
    int count = 0;

    void addBook(String title) {
        if (count < inventory.length) inventory[count++] = new Book(title);
    }

    void displayInventory() {
        for (int i = 0; i < count; i++) System.out.println(inventory[i]);
    }

    public static void main(String[] args) {
        BookshopInventory shop = new BookshopInventory();
        shop.addBook("Java Basics");
        shop.addBook("Python Intro");
        shop.displayInventory();
    }
}
