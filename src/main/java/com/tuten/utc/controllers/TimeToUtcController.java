package com.tuten.utc.controllers;

import com.tuten.utc.models.TimeUTC;
import com.tuten.utc.payloads.TimeToUTCResponse;
import com.tuten.utc.services.TimeToUTCService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class TimeToUtcController {
    @PostMapping("/timetoutc")
    public TimeToUTCResponse convertTimeToUTC(@RequestBody TimeUTC timeUTC) throws ParseException {
        TimeToUTCService timeToUTCService = new TimeToUTCService(timeUTC);
        return new TimeToUTCResponse(timeToUTCService.convert(), "utc");
    }
}
