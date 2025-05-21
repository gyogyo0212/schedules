package com.example.schedules.Repository;

import com.example.schedules.entity.Schedules;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulesRepository {
    Schedules saveSchedules(Schedules schedules);
}
