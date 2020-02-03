package gr.codehub.newCollege.repository;

import gr.codehub.newCollege.controller.Registry;
import gr.codehub.newCollege.model.Attendance;
import gr.codehub.newCollege.model.Mark;
import gr.codehub.newCollege.model.Module;
import gr.codehub.newCollege.model.Student;
import gr.codehub.newCollege.util.Util;

import java.util.ArrayList;
import java.util.List;

public class AttendanceReader {
    private Module module;
    public AttendanceReader(Module module) {
        this.module = module;
    }

    public List<Attendance> readAllAttendanceData() {
        List<Attendance> attendances = new ArrayList<>();
        for (int i = 1; i <= 10; i++) { //Gia kathe enan apo tis attendances tou College diavazw tous mathites.
            Student student = Registry.chooseRandomCollegeStudent();
            Attendance a = readAttendanceData(student);
            attendances.add(a);
        }
        return attendances;
    }

    public Attendance readAttendanceData(Student student) {  //An hthela na diavasw apo tin vash authn thn methodo tha peiraza!
        Attendance attendance = new Attendance();
        Mark mark = new Mark();
        mark.setResult(Util.randomInt(10, 20));
        mark.setMarkerName("Stella");
        attendance.setYear(Util.randomInt(2010, 2020));
        attendance.setMark(mark);
        attendance.setStudent(student);
        return attendance;
    }


}
