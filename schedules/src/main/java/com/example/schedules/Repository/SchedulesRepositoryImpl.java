package com.example.schedules.Repository;

import com.example.schedules.entity.Schedules;
import com.example.schedules.service.SchedulesService;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@Repository
public class SchedulesRepositoryImpl implements SchedulesRepository {
    private final Map<Integer, Schedules> schedulesList = new HashMap<>();

    @Override
    public Schedules saveSchedules(Schedules schedules) {

        // 식별자 자동 생성
        Integer schedulesId = schedulesList.isEmpty() ? 1 : Collections.max(schedulesList.keySet()) +1;
        schedules.setId(schedulesId);

        schedulesList.put(schedulesId, schedules);

        return schedules;
    }
}
