import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        System.out.print("Nhập tên sinh viên: ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập tuổi: ");
                        int age = Integer.parseInt(scanner.nextLine());

                        System.out.print("Nhập điểm trung bình: ");
                        double avgScore = Double.parseDouble(scanner.nextLine());

                        Student student = new Student(name, age, avgScore);
                        studentList.add(student);
                        System.out.println("Thêm sinh viên thành công!");
                    } catch (NumberFormatException e) {
                        System.out.println("Lỗi nhập liệu: Tuổi và điểm trung bình phải là số.");
                    }
                    break;

                case "2":
                    if (studentList.isEmpty()) {
                        System.out.println("Danh sách sinh viên trống.");
                    } else {
                        for (Student s : studentList) {
                            s.display();
                        }
                    }
                    break;

                case "3":
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
