import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Nhập tên sinh viên: ");
                    String nameAdd = scanner.nextLine();
                    manager.add(new Student(nameAdd));
                    break;

                case "2":
                    try {
                        System.out.print("Nhập vị trí cần sửa (bắt đầu từ 1): ");
                        int indexUpdate = Integer.parseInt(scanner.nextLine()) - 1;
                        System.out.print("Nhập tên mới: ");
                        String newName = scanner.nextLine();
                        manager.update(indexUpdate, new Student(newName));
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ.");
                    }
                    break;

                case "3":
                    try {
                        System.out.print("Nhập vị trí cần xóa (bắt đầu từ 1): ");
                        int indexDelete = Integer.parseInt(scanner.nextLine()) - 1;
                        manager.delete(indexDelete);
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ.");
                    }
                    break;

                case "4":
                    manager.display();
                    break;

                case "5":
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}