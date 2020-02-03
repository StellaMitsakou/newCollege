package gr.codehub.newCollege.controller;

import gr.codehub.newCollege.model.Course;
import gr.codehub.newCollege.model.Student;
import gr.codehub.newCollege.repository.RepositoryReader;
import gr.codehub.newCollege.service.CollegeServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {
    private CollegeServices collegeServices;

    public CollegeController() {
        collegeServices = new CollegeServices();
    }

    @GetMapping("courses")
    public List<Course> getCourses() {
        List<Course> courses = collegeServices.getCourses();
        return courses;
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = collegeServices.getStudents();
        return students;
    }
}
