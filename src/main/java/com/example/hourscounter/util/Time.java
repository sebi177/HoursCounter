package com.example.hourscounter.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Time {
    private Integer hours;
    private Integer minutes;

    @Override
    public String toString() {
        return String.format("%s:%s", hours, minutes);
    }
}
