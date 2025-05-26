package com.example.schedules.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class CreateSchedulesResponseDto {
    private long id;

    private String toDo;

    private String userName;

    private String passWord;

    private LocalDateTime createAt;

    private LocalDateTime modifiedAt;




    //

}
