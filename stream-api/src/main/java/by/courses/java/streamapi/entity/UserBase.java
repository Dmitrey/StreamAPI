package by.courses.java.streamapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.stream.IntStream;

@Data
@AllArgsConstructor(staticName = "of")
public class UserBase {

    private String name;

    private int age;

}