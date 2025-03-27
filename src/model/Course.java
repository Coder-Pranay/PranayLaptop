package model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Course {
    int id;
    String name;
    String description;
    String duration;
    int fees;
}
