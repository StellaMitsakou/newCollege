package gr.codehub.newCollege.repository;

import gr.codehub.newCollege.controller.Registry;
import gr.codehub.newCollege.model.College;

public class CollegeReader {
    public College readCollegeData() {
        College c = Registry.getCollege();
        return c;
    }
}
