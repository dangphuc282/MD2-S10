public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Book> bookMap = new HashMap<>();

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách theo tên");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Nhập tên sách: ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập tên tác giả: ");
                        String author = scanner.nextLine();

                        System.out.print("Nhập năm xuất bản: ");
                        int year = Integer.parseInt(scanner.nextLine());

                        Book book = new Book(name, author, year);
                        bookMap.put(name.toLowerCase(), book);
                        System.out.println("Thêm sách thành công!");
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Năm xuất bản phải là số.");
                    }
                    break;

                case "2":
                    System.out.print("Nhập tên sách cần tìm: ");
                    String searchName = scanner.nextLine().toLowerCase();
                    if (bookMap.containsKey(searchName)) {
                        bookMap.get(searchName).display();
                    } else {
                        System.out.println("Không tìm thấy sách.");
                    }
                    break;

                case "3":
                    if (bookMap.isEmpty()) {
                        System.out.println("Danh sách sách trống.");
                    } else {
                        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
                            entry.getValue().display();
                        }
                    }
                    break;

                case "4":
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}