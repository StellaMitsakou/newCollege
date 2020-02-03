package gr.codehub.newCollege.repository;

import gr.codehub.newCollege.model.College;
import gr.codehub.newCollege.model.Course;
import gr.codehub.newCollege.model.Student;

import java.util.List;

public class RepositoryReader {    //Edw ta syggentrwnei ola.
    public College readRepository(){
        CollegeReader collegeReader = new CollegeReader();
        College college = collegeReader.readCollegeData();

        StudentReader studentReader = new StudentReader();
        List<Student> students = studentReader.readAllStudentData();
        college.setStudents(students);

        CourseReader courseReader = new CourseReader();
        List<Course> courses = courseReader.readAllCourseData();
        //college.getCourses().addAll(courses);
        college.setCourses(courses);

        return college;
    }
}
