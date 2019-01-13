package core.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    @Scheduled(cron = "${scheduler.cron}")
    public void testScheduling() {
        System.out.println("Scheduling test");
    }

}