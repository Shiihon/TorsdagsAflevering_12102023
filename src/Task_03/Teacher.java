package Task_03;

import java.util.ArrayList;

public class Teacher extends Person{
    public ArrayList<String> canTeach;
    public ArrayList <String> currentCourses;
    public Teacher(String name, ArrayList <String> currentCourses, ArrayList<String> canTeach) {
        super(name);
        this.currentCourses = currentCourses;
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course) && !currentCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
