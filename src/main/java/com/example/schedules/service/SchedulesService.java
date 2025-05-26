package com.example.schedules.service;

import com.example.schedules.dto.CreateSchedulesResponseDto;
import com.example.schedules.entity.Schedules;
import com.example.schedules.repository.SchedulesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchedulesService {

    private final SchedulesRepository schedulesRepository;


    public CreateSchedulesResponseDto save(
            String toDo,
            String userName,
            String password
    ) {
        Schedules schedules = new Schedules(toDo, userName, password);

        schedulesRepository.save(schedules);
        return new CreateSchedulesResponseDto(
                schedules.getId(),
                schedules.getToDo(),
                schedules.getUserName(),
                schedules.getPassWord(),
                schedules.getCreateAt(),
                schedules.getModifiedAt()
        );
    }
}
