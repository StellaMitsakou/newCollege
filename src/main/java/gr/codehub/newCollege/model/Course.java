package gr.codehub.newCollege.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private String name;
    private List<Module> modules;

    public Course() {
        modules = new ArrayList<>();
    }
}
