package com.example.schedules.dto;

import com.example.schedules.entity.Schedules;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SchedulesRequestDto {
    private int id;

    private String to_do;

    private String userName;

    private String password;

    private LocalDateTime create_at;

    private LocalDateTime update_at;

    //

    }

