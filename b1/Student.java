import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double avgScore;

    public Student(String name, int age, double avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public void display() {
        System.out.printf("Tên: %s | Tuổi: %d | Điểm TB: %.2f\n", name, age, avgScore);
    }
}

