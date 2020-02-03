package gr.codehub.newCollege.repository;

import gr.codehub.newCollege.model.Course;
import gr.codehub.newCollege.util.Util;

import java.util.ArrayList;
import java.util.List;

public class CourseReader {
    public List<Course> readAllCourseData() {
        List<Course> courses = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Course c = readCourseData();
            courses.add(c);
        }
        return courses;
    }

    public Course readCourseData() {
        Course course = new Course();
        String name = Util.randomName("Course");
        course.setName(name);
        ModuleReader moduleReader = new ModuleReader();
        course.setModules(moduleReader.readAllModuleData());
        return course;
    }
}
