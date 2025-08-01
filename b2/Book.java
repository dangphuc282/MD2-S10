class Book {
    private String name;
    private String author;
    private int publishYear;

    public Book(String name, String author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.printf("Tên sách: %s | Tác giả: %s | Năm XB: %d\n", name, author, publishYear);
    }
}
