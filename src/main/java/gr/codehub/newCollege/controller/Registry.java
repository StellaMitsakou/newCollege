package gr.codehub.newCollege.controller;

import gr.codehub.newCollege.model.College;
import gr.codehub.newCollege.model.Student;
import gr.codehub.newCollege.util.Util;

import java.util.List;

public class Registry {
    //Tin wra pou ftiaxnetai h efarmogh dimiourgeitai ena kai mono College, pou to kseroun oles oi klaseis parakatw.
    //Singleton Pattern.
    private static College college;

    static {  //Auto einai constructor gia static.
        college = new College();
    }

    public static College getCollege() {
        return college;
    }

    public static Student chooseRandomCollegeStudent() {
        List<Student> students = college.getStudents();
        return students.get(Util.randomInt(0, students.size() - 1));
    }
}
