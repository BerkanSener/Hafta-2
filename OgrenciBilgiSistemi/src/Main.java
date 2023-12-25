public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mehmet", "333", "TRH");
        Teacher t2 = new Teacher("Kadir", "222", "FZK");
        Teacher t3 = new Teacher("Erdi","111","BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("Münevver", "147", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(90,80,70,60,50,40);
        s1.isPass();


        Student s2 = new Student ("Ayşe","369","3", tarih, fizik, biyoloji);
        s2.addBulkExamNote(55,65,75,85,35,45);
        s2.isPass();

        Student s3 = new Student ("Hasan","258", "2", tarih, fizik, biyoloji);
        s3.addBulkExamNote(80,90,70,50,60,40);
        s3.isPass();
    }
}