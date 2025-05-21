package com.example.schedules.controller;

import com.example.schedules.dto.SchedulesRequestDto;
import com.example.schedules.dto.SchedulesResponseDto;
import com.example.schedules.service.SchedulesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedules")
public class SchedulesController {
    //속성
    private final SchedulesService schedulesService;
    //주입된 의존성을 변경할 수 없어 객체의 상태를 안전하게 유지할 수 있다 .
    // private final Map<Integer, Schedules>schedulessList = new HashMap<>();
    //생성자
    //클래스가 필요로 하는 의존성을 생성자를 통해 전달하는 방식

    public SchedulesController(SchedulesService schedulesService){
        this.schedulesService = schedulesService;
    }
    //기능
    @GetMapping("/hello")
    public String helloApi(){
        return "ggg";
    }

    @PostMapping
    public ResponseEntity<SchedulesResponseDto>createSchedule(@RequestBody SchedulesRequestDto schedulesRequestDto){


        // 식별자가 1씩 증가하도록
        // Integer schedulesId = schedulesList.isEmpty() ? 1 : collections.max(schedulesList.keyset())+1;

        return new ResponseEntity<>(schedulesService.saveSchedules(schedulesRequestDto), HttpStatus.CREATED);


    }

}
