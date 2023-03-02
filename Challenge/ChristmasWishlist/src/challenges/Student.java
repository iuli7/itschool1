package challenges;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList student = new ArrayList<>();
        ArrayList graduateStudent = new ArrayList();

        student.add("Iuli");
        student.add("Roxana");
        student.add("Andreea");
        student.add("Roberta");
        student.add("Tudor");
        student.add("Radu");
        student.add("Denis");
        graduateStudent.addAll(student);

        for(int i=0;i<graduateStudent.size();i++){
            System.out.println(graduateStudent.get(i));
        }
    }
}
