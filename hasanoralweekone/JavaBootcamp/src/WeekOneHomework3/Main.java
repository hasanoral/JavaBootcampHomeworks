package WeekOneHomework3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //5 adet öğrenci nesnesi oluşturduk. Student classında kullandığımız constructor'u kullanıyoruz.
        Student student1 = new Student("Hasan Oral ",5005,3.90,new PersonalData(1999,7,20,10010));
        Student student2 = new Student("Gülce Şahin ",5006,4.00,new PersonalData(1998,7,10,60060));
        Student student3 = new Student("Kerem Alp Özecik ",5007,3.30,new PersonalData(1999,7,12,70070));
        Student student4 = new Student("Sercan Bayram ",5008,3.20,new PersonalData(1998,6,23,80080));
        Student student5 = new Student("Ahmet Çıtak ",5009,3.00,new PersonalData(1997,2,15,90090));

        //K129 isimli - 3 kapasiteli kurs nesnesi oluşturuyoruz.
        Course c = new Course("K129",3);

        //4 adet öğrenci ekleniyor ancak sadece 3'ü eklenebilecek çünkü course nesnemizin capacitysini 3 belirledik.
        c.addStudent(student1);
        c.addStudent(student2);
        c.addStudent(student3);
        c.addStudent(student4);

        //listeleme yapıyoruz.
        System.out.println(c.getName()+ " isimli kursun öğrencileri: ");
        c.list();

        //course nesnemizin kapasitesini 5 arttırdık.
        c.increaseCapacity();

        //en başta oluşturduğumuz diğer öğrenci nesnelerini ekliyoruz.
        c.addStudent(student4);
        c.addStudent(student5);

        //listeleme işlemi yapıyoruz.
        System.out.println(c.getName()+ " isimli kursun öğrencileri: ");
        c.list();

        //ilk öğrenciyi siliyoruz.
        c.dropStudent(student1);

        //listeleme işlemi yapıyoruz.
        System.out.println(c.getName()+ " isimli kursun öğrencileri: ");
        c.list();

        //K129'un öğrenci sayısı
        System.out.println("K129'un öğrenci sayısı: " + c.getNumberOfStudents());

        //K129'daki en iyi ort.'a sahip öğrencinin doğum tarihi
        System.out.println("K129'da en iyi ortalamaya sahip öğrencinin doğum tarihi: " +c.getBestStudent().getPd().getBirthDate().getYear() + " doğum ayı: " + c.getBestStudent().getPd().getBirthDate().getMonthValue());

        //Yeni kurs nesnesi oluşturuyoruz.
        Course c2 = new Course("K130");

        //Yeni açtığımız kursa bir önceki açtığımız kurstaki öğrencileri ekliyoruz.
        Student[] students = c.getStudents();
        for(int i=0; i < c.getNumberOfStudents(); i++)
            c2.addStudent(students[i]);

        //ilk kursumuzun içeriğini sıfırladık.
        c.clear();

        //ID'si 5005 olan öğrenci K129'dan düşürülünce oluşna sonucu yazdırıyoruz.
        System.out.println("ID'si 5005 olan öğrenci K129'dan drop işlemi yapıldı: " + c.dropStudent(student1));


        System.out.println(c2.getName()+ " isimli kursun öğrencileri: ");
        c2.list();

        //Yeni oluşturulan kursumuzdan en iyi öğrenciyi dropluyoruz.
        c2.dropStudent(c2.getBestStudent());


        System.out.println(c2.getName()+ " isimli kursun öğrencileri: ");
        c2.list();


        System.out.println("K130'da yaşı en genç olan öğrencinin ortalaması: " + c2.getYoungestStudent().getGpa());

        //kursların son hali
        System.out.println("K129 isimli kursun öğrencileri: ");
        c.list();
        System.out.println("K130 isimli kursun öğrencileri: ");
        c2.list();

    }
}
