package gr.codehub.newCollege.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Attendance {
    private Student student;
    private Mark mark;
    private int year;

}
