package org.example.repository;

import org.example.entity.Guard;
import org.example.entity.Student;
import org.example.entity.Teacher;

public class RegistrationUtil {
    //register for teacher
    //register for student
    //register for guard

    public static int register(Teacher teacher){
        teacher.setAge(teacher.getAge()+1);
        if (teacher.getAge()<18) return -1;

        // registration
        return 0;
    }

    public static int register(Student student){
        if (student.getAge()>18) return -1;

        // registration
        return 0;
    }

    public static int register(Guard guard){
        return 0;
    }

    //ученика регистрируем только если ему меньше 18, если больше - то возвращаем -1
    //охранника регистрируем в любом случае
}
