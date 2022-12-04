package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

//    void testStudents(ArrayList<lambda.Student> arrayList, lambda.StudentCheck check) {
//        for (lambda.Student a : arrayList)
//            if (check.check(a)) System.out.println(a);
//    }
    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student a : arrayList)
            if (predicate.test(a)) System.out.println(a);
    }
    public static double avgOfSmth (List<Student> studentList, Function<Student, Double> function){
        double result=0;
        for (Student s:studentList) {
            result+=function.apply(s);
        }
        result=result/studentList.size();
        return result;
    }


    void printStudentGrade(ArrayList<Student> arrayList, double grade) {
        for (Student a : arrayList) {
            if (a.getAvgGrade() > grade) System.out.println(a);
        }
    }

    void printStudentAge(ArrayList<Student> arrayList, int age) {
        for (Student a : arrayList) {
            if (a.getAge() > age) System.out.println(a);
        }
    }

    void printStudentMix(ArrayList<Student> arrayList, int age, int course, char sex) {
        for (Student a : arrayList) {
            if (a.getAge() > age && a.getCourse() > course && a.getSex() == sex) {
                System.out.println(a);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {

        Student std1 = new Student("Ivan", 'm', 25, 2, 5.5);
        Student std2 = new Student("Petr", 'm', 22, 1, 5.8);
        Student std3 = new Student("Elena", 'f', 23, 3, 5.4);
        Student std4 = new Student("Andrey", 'm', 22, 3, 5.5);
        Student std5 = new Student("Mariy", 'f', 24, 4, 4.8);
        ArrayList<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);
        StudentInfo studentInfo = new StudentInfo();
//       studentInfo.printStudentGrade((ArrayList<lambda.Student>) students, 5);
//        System.out.println("------------------");
//       studentInfo.printStudentAge((ArrayList<lambda.Student>) students, 22);
//        System.out.println("----------------------");
//        studentInfo.printStudentMix((ArrayList<lambda.Student>) students, 20, 2, 'm');
//        studentInfo.testStudents(students, new lambda.CheckOverGrade());
//        System.out.println("--------");
//        studentInfo.testStudents(students, new lambda.StudentCheck() {
//            @Override
//            public boolean check(lambda.Student student) {
//                return student.getAge()>24;
//            }
//        });
//        System.out.println("----------------");
//        studentInfo.testStudents(students, student -> {return student.getAge()>24;});
//        System.out.println("----------------");
//        studentInfo.testStudents(students, student -> {return student.getAvgGrade()>5.5;});
//        System.out.println("----------------");
//        studentInfo.testStudents(students, student ->
//        {return (student.getAge()>21) && student.getCourse() >2 && student.getAvgGrade()>5.4;});
//        Collections.sort(students, new Comparator<lambda.Student>() {
//            @Override
//            public int compare(lambda.Student o1, lambda.Student o2) {
//                return o1.getCourse()-o2.getCourse();
//            }
//        });
//        System.out.println(students);
//        System.out.println("-------------");
//        Collections.sort(students,(s1, s2)-> s1.getCourse()-s2.getCourse());
//        System.out.println(students);
        Predicate<Student> predicate= student -> student.getAge()>22;
        Predicate<Student> predicate1= student -> student.getSex()=='m';
  //      studentInfo.testStudents(students,predicate);
        System.out.println("--------------");
//        studentInfo.testStudents(students,predicate.and(predicate1));
//        studentInfo.testStudents(students,predicate.or(predicate1));
//       studentInfo.testStudents(students,predicate.negate());
        double v = StudentInfo.avgOfSmth(students, student -> student.getAvgGrade());
        System.out.println(v);
        double v1 = StudentInfo.avgOfSmth(students, student -> Double.valueOf(student.getAge()));
        System.out.println(v1);


    }
}

interface StudentCheck {
    boolean check(Student student);
}

class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student student) {
        return  student.getAvgGrade() > 5;
    }
}