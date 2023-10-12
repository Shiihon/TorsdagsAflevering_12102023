package Task_03;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses = new ArrayList<>(asList("Biology", "Chemistry"));
        ArrayList <String> currentCourses = new ArrayList<>();

        Student studentA = new Student("Chad", passedCourses, currentCourses);

        currentCourses.add("Maths");
        currentCourses.add("Geography");
        passedCourses.add("Biology");
        passedCourses.add("Chemistry");

        System.out.println(studentA.addCourse("Maths"));
        System.out.println(studentA.addCourse("Danish"));

        ArrayList<String> canTeachT = new ArrayList<>();
        ArrayList <String> currentCourseT = new ArrayList<>();

        Teacher teacherA = new Teacher("Signe", canTeachT, currentCourseT);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Signe", new ArrayList<>(), new ArrayList<>()));
        persons.add(new Student("Nico", new ArrayList<>(asList("Java 1.0", "Math")), new ArrayList<>()));

    }
}
