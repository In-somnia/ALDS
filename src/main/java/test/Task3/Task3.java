package test.Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public List<Course> chooseMaxCourseNumber(List<Course> courses) {
        List<Course> maxCourseNumber = new ArrayList<>();

        while (courses.size() > 0) {
            LocalDate minEndDate = findMinEndDate(courses);
            maxCourseNumber = addMinCourse(courses, maxCourseNumber, minEndDate);
            courses.removeAll(maxCourseNumber);
            courses.removeAll(removeOverlappingCourses(courses, minEndDate));
        }
        return maxCourseNumber;
    }

    private LocalDate findMinEndDate(List<Course> courses) {
        LocalDate minEndDate = courses.get(0).getEndDate();
        for (Course c : courses) {
            if (c.getEndDate().compareTo(minEndDate) < 0) {
                minEndDate = c.getEndDate();
            }
        }
        return minEndDate;
    }

    private List<Course> addMinCourse(List<Course> courses, List<Course> courseList, LocalDate minEndDate) {
        for (Course c : courses) {
            if (c.getEndDate().equals(minEndDate)) {
                courseList.add(c);
            }
        }
        return courseList;
    }

    private List<Course> removeOverlappingCourses(List<Course> courses, LocalDate minEndDate) {
        List<Course> coursesForRemoval = new ArrayList<>();
        for (Course c : courses) {
            if (c.getStartDate().compareTo(minEndDate) <= 0 &&
                    c.getEndDate().compareTo(minEndDate) > 0) {
                coursesForRemoval.add(c);
            }
        }
        return coursesForRemoval;
    }
}
