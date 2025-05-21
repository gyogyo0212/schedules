package com.example.schedules.dto;

import com.example.schedules.entity.Schedules;

import java.time.LocalDateTime;

public class SchedulesResponseDto {
    private int id;

    private String to_do;

    private String userName;

    private String password;

    private LocalDateTime create_at;

    private LocalDateTime update_at;


    //
    public SchedulesResponseDto(Schedules schedules){
        this.id = schedules.getId();
        this.to_do = schedules.getTo_do();
        this.userName = schedules.getUserName();
        this.password = schedules.getPassword();
        this.create_at = schedules.getCreate_at();
        this.update_at = schedules.getUpdate_at();

    }
}
