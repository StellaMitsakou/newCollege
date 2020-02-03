package gr.codehub.newCollege.repository;

import gr.codehub.newCollege.model.Module;
import gr.codehub.newCollege.util.Util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ModuleReader {
    //Calendar c = GregorianCalendar.getInstance(); //To GregorianCalendar einai ena registry.
    public List<Module> readAllModuleData() {
        List<Module> modules = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Module c = readModuleData();
            modules.add(c);
        }
        return modules;
    }

    public Module readModuleData() {
        Module module = new Module();
        String name = Util.randomName("Module");
        module.setName(name);
        AttendanceReader attendanceReader = new AttendanceReader(module);
        module.setAttendances(attendanceReader.readAllAttendanceData());
        return module;
    }
}
