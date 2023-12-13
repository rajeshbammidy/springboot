package com.rajeshbammidi.SpringDemo;

import com.rajeshbammidi.SpringDemo.dao.StudentDao;
import com.rajeshbammidi.SpringDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * To component scan the other packages use the below
 *
 * @SpringBootApplication(scanBasePackageClasses = {"com.rajeshbammidi.util"})
 */

@SpringBootApplication
public class SpringDemoApplication {


    public static int solve(int n, int a[], int m, int b[], int k) {
        int result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            result += findIndexOf(b, curr, k);
        }
        return result;
    }

    private static int findIndexOf(int[] b, int curr, int k) {
        int beg = 0;
        int end = b.length - 1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (curr + b[mid] >= k) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return beg;
    }

    public static void main(String[] args) {
        System.out.println("afk".compareTo("aaa"));
        //SpringApplication.run(SpringDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDao studentDao) {
        return runner -> {
            getAllStudents(studentDao);
        };
    }

    private void getAllStudents(StudentDao studentDao) {
        List<Student> students = studentDao.findAll();
        System.out.println(students);
    }

    private void readStudent(StudentDao studentDao) {
        Student student = new Student("rajesh", "bammidi", "rbammidi@gamil.com");
        studentDao.save(student);
        System.out.println(studentDao.findById(student.getId()));
    }

    private void createStudent(StudentDao studentDao) {
        System.out.println("Creating student");
        Student student = new Student("rajesh", "bammidi", "rbammidi@gamil.com");
        studentDao.save(student);
        System.out.println("Student saved");
    }

}
