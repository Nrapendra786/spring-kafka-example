package com.nrapendra.stock;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration
public class KafkaContainerDevMode {

    @Bean
    @ServiceConnection
    public KafkaContainer kafka() {
        //user can switch between cp-kafka:7.4.0  and cp-kafka:latest
        return new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"))
                .withKraft()
                .withReuse(true);
    }

}
