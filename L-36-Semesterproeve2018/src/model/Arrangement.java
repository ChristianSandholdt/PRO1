package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Arrangement {
    private final String title;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private double price;

    public Arrangement(String title, LocalDate date, LocalTime startTime,
                       LocalTime endTime, double price) {
        this.title = title;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public String getTitle() {
        return title;
    }
}

