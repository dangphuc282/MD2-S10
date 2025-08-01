interface Manage<T> {
    void add(T item);
    void update(int index, T item);
    void delete(int index);
    void display();
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Tên sinh viên: " + name);
    }
}