package com.pedroalcantara.reactive.config;

import com.pedroalcantara.reactive.converter.ZonedDateTimeConverterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.Arrays;

@Configuration
public class MongoConverters {

    @Bean
    public MongoCustomConversions mongoCustomConversions() {
        return new MongoCustomConversions(
                Arrays.asList(
                        ZonedDateTimeConverterFactory.getDeserializer(),
                        ZonedDateTimeConverterFactory.getSerializer()
                )
        );
    }
}

