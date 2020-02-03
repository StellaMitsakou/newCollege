package gr.codehub.newCollege.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Module {
    private String name;
    private List<Attendance> attendances;

    public Module() {
        attendances = new ArrayList<>();
    }
}
