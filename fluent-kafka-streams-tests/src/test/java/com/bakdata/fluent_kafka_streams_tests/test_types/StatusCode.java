package com.bakdata.fluent_kafka_streams_tests.test_types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusCode {
    int code;
    String definition;
}