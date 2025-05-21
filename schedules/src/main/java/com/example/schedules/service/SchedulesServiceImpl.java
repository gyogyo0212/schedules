package com.example.schedules.service;

import com.example.schedules.Repository.SchedulesRepository;
import com.example.schedules.dto.SchedulesRequestDto;
import com.example.schedules.dto.SchedulesResponseDto;
import com.example.schedules.entity.Schedules;
import org.springframework.stereotype.Service;

@Service
public class SchedulesServiceImpl implements SchedulesService {

    //속성
    private final SchedulesRepository schedulesRepository;


    //생성자
    public SchedulesServiceImpl(SchedulesRepository schedulesRepository){
        this.schedulesRepository = schedulesRepository;
    }

    //기능
    @Override
    public SchedulesResponseDto saveSchedules(SchedulesRequestDto requestDto){
        Schedules schedules = new Schedules(requestDto.getId(), requestDto.getTo_do(),requestDto.getUserName(), requestDto.getPassword(),requestDto.getCreate_at(), requestDto.getUpdate_at());

        //
        Schedules saveSchedules = schedulesRepository.saveSchedules(schedules);

        return new SchedulesResponseDto(saveSchedules);
    }

}
