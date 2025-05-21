package com.example.schedules.entity;

import com.example.schedules.dto.SchedulesRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedules {
    @Setter
    private int id;

    private String to_do;

    private String userName;

    private String password;

    private LocalDateTime create_at;

    private LocalDateTime update_at;



    //AllargsConsttutor 가 있어서 이게 필요가 없다.
//    public Schedules(int id, String to_do, String userName, String password, LocalDateTime create_at, LocalDateTime update_at){
//        this.id = id;
//        this.to_do = to_do;
//        this.userName = userName;
//        this.password = password;
//        this.create_at = create_at;
//        this.update_at = update_at;
//    }

    //
//    public void update(SchedulesRequestDto dto){
//        this.userName = dto.getUserName();
//        this.password = dto.getPassword();
//        this.to_do = dto.getTo_do();
//    }

}
