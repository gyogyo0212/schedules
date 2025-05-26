package com.example.schedules.controller;

import com.example.schedules.dto.CreateSchedulesRequestDto;
import com.example.schedules.dto.CreateSchedulesResponseDto;
import com.example.schedules.service.SchedulesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class SchedulesController {

    private final SchedulesService schedulesService;

    @PostMapping
    public ResponseEntity<CreateSchedulesResponseDto> createSchedule(
            @RequestBody CreateSchedulesRequestDto schedulesRequestDto) {

        CreateSchedulesResponseDto responseDto = schedulesService.save(
                schedulesRequestDto.getToDo(),
                schedulesRequestDto.getUserName(),
                schedulesRequestDto.getPassWord()
        );

        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
    }
}
