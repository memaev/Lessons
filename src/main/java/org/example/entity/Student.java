package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    private String id, name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Set<String> filterStudents(List<Student> students) {
        Set<String> uniqueStudentsNames = new HashSet<>();

        for(Student student : students) {
            uniqueStudentsNames.add(student.getName());
        }
        return uniqueStudentsNames;
    }
}
