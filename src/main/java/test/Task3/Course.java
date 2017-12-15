package test.Task3;

import java.time.LocalDate;

public class Course {
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @SuppressWarnings("WeakerAccess")
    public LocalDate getStartDate() {
        return startDate;
    }

    @SuppressWarnings("unused")
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @SuppressWarnings("WeakerAccess")
    public LocalDate getEndDate() {
        return endDate;
    }

    @SuppressWarnings("unused")
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
