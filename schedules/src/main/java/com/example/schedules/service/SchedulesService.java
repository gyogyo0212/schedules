package com.example.schedules.service;

import com.example.schedules.dto.SchedulesRequestDto;
import com.example.schedules.dto.SchedulesResponseDto;

public interface SchedulesService {
    SchedulesResponseDto saveSchedules(SchedulesRequestDto requestDto);
}
