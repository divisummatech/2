package javaoop.exercises._2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }


    /**
     *  1: Create a constructor inside Student that takes 'name' and 'age'
     *
     *     make sure to set the fields too using the 'this' keyword
     *
     *     Add a print statement to the constructor at the start saying "Constructing!"
     *     Add a print statement to the constructor at the start saying "Constructed!"
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentAges.size(); i++) {

            Student student = new Student(studentNames.get(i), studentAges.get(i));
            students.add(student);
        }
        public class Student {
            private String name;
            private int age;

            public Student(String name, int age) {
                System.out.println("Constructing!");
                this.name = name;
                this.age = age;
                System.out.println("Constructed!");
            }


        }

    }
}

    /**
     * 2: Add 3 more constructors to student, remember you need to change the parameters
     *    a constructor accepts in order to allow multiple.
     *
     *    a Constructor that takes only a student's age
     *    a Constructor that takes only a student's name
     *    a Constructor that does not take any parameters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        // Once you've added the correct constructors uncomment the code below, there should be errors!
//         List<Student> students = Arrays.asList(
//         new Student("Alice", 33),
//         new Student("Bob"),
//         new Student(33),
//         new Student()
//        );

        import java.util.Arrays;
import java.util.List;

        class Student {
            private String name;
            private int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public Student(String name) {
                this.name = name;
                this.age = 0;
            }

            public Student(int age) {
                this.name = "Unknown";
                this.age = age;
            }

            public Student() {
                this.name = "Unknown";
                this.age = 0;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        public class Main {
            public static void main(String[] args) {
                System.out.println("\nExercise 1:");
                List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");
                List<Integer> studentAges = Arrays.asList(23, 31, 38);
                List<Student> students = new ArrayList<>();

                for (int i = 0; i < studentAges.size(); i++) {
                    students.add(new Student(studentNames.get(i), studentAges.get(i)));
                }

                System.out.println("Students:");
                for (Student student : students) {
                    System.out.println(student.getName() + " (" + student.getAge() + ")");
                }

                System.out.println("\nExercise 2:");
                List<Student> students2 = Arrays.asList(
                        new Student("Alice", 33),
                        new Student("Bob"),
                        new Student(33),
                        new Student()
                );

                System.out.println("Students 2:");
                for (Student student : students2) {
                    System.out.println(student.getName() + " (" + student.getAge() + ")");
                }
            }
        }

    }
}
