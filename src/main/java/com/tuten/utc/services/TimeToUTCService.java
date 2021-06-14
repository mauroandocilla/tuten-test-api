package com.tuten.utc.services;

import com.tuten.utc.models.TimeUTC;
import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeFormatter;

@Service
public class TimeToUTCService {
    private final TimeUTC timeUTC;

    public TimeToUTCService(TimeUTC timeUTC) {
        this.timeUTC = timeUTC;
    }

    public String convert() {
        try {
            int hours = Integer.parseInt(timeUTC.getTimezone());

            LocalDate now = LocalDate.now();
            LocalTime time = LocalTime.parse(timeUTC.getTime());
            LocalDateTime dateTime = LocalDateTime.of(now, time);

            OffsetDateTime timeUtc = dateTime.atOffset(ZoneOffset.UTC);

            ZoneOffset offset = ZoneOffset.ofHours(hours);
            OffsetDateTime offsetTime = timeUtc.withOffsetSameInstant(offset);

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
            return fmt.format(offsetTime);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
