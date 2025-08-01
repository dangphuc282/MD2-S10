import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class AttendanceManager implements Manage<Student> {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void add(Student student) {
        studentList.add(student);
        System.out.println("Thêm sinh viên thành công.");
    }

    public void update(int index, Student student) {
        if (index >= 0 && index < studentList.size()) {
            studentList.set(index, student);
            System.out.println("Cập nhật sinh viên thành công.");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
            System.out.println("Xóa sinh viên thành công.");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    public void display() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.print((i + 1) + ". ");
                studentList.get(i).display();
            }
        }
    }
}

