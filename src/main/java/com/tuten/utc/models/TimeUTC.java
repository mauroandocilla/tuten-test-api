package com.tuten.utc.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TimeUTC {
    @JsonProperty
    private @NonNull String time;

    @JsonProperty
    private @NonNull String timezone;
}
