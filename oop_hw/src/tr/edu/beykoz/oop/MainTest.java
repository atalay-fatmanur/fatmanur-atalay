package tr.edu.beykoz.oop;

public class MainTest {

    public static void main(String[] args) {

        // student nesnesi oluştur
        student s1 = new student(
                "Fatmanur",
                "Atalay",
                3,
                "Computer Engineering"
        );

        // setter kullanımı
        s1.setGrade(4);

        // bilgileri yazdır (private method kullanılıyor)
        s1.printStudentInfo();

        // getter kullanımı örneği
        System.out.println("Student Name (getter): " + s1.getName());
    }
}