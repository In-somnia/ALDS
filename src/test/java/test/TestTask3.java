package test;

import org.junit.Test;
import test.Task3.Course;
import test.Task3.Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestTask3 {

    @Test
    public void checkTask3() {
        List<Course> courses = new ArrayList<>();
        Course javaCourse = new Course(LocalDate.of(2017, 1, 1),
                LocalDate.of(2017, 1, 10));
        Course bigDataCourse = new Course(LocalDate.of(2017, 1, 3),
                LocalDate.of(2017, 1, 7));
        Course jsCourse = new Course(LocalDate.of(2017, 1, 8),
                LocalDate.of(2017, 1, 12));
        Course testCourse = new Course(LocalDate.of(2017, 1, 13),
                LocalDate.of(2017, 1, 16));
        Course reactCourse = new Course(LocalDate.of(2017, 1, 2),
                LocalDate.of(2017, 1, 21));
        courses.add(javaCourse);
        courses.add(bigDataCourse);
        courses.add(jsCourse);
        courses.add(testCourse);
        courses.add(reactCourse);
        Task3 task3 = new Task3();
        List<Course> maxCoursesToAttend = task3.chooseMaxCourseNumber(courses);
        assertEquals(3, maxCoursesToAttend.size());
    }
}
