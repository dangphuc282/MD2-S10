import java.util.LinkedList;
import java.util.Scanner;
public class UserManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<User> userList = new LinkedList<>();

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng theo email");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Nhập tên người dùng: ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập email: ");
                        String email = scanner.nextLine();

                        System.out.print("Nhập số điện thoại: ");
                        String phone = scanner.nextLine();

                        userList.add(new User(name, email, phone));
                        System.out.println("Thêm người dùng thành công!");
                    } catch (Exception e) {
                        System.out.println("Lỗi nhập liệu.");
                    }
                    break;

                case "2":
                    System.out.print("Nhập email người dùng cần xóa: ");
                    String emailToDelete = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < userList.size(); i++) {
                        if (userList.get(i).getEmail().equalsIgnoreCase(emailToDelete)) {
                            userList.remove(i);
                            System.out.println("Xóa người dùng thành công!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy người dùng với email đã nhập.");
                    }
                    break;

                case "3":
                    if (userList.isEmpty()) {
                        System.out.println("Danh sách người dùng trống.");
                    } else {
                        for (User u : userList) {
                            u.display();
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