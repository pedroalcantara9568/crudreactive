package com.pedroalcantara.reactive.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeConverterFactory {

    private ZonedDateTimeConverterFactory() {
    }

    public static Converter<String, ZonedDateTime> getDeserializer() {
        return new Converter<String, ZonedDateTime>() {
            @Override
            public ZonedDateTime convert(String source) {
                return ZonedDateTime.parse(source);
            }
        };
    }

    public static Converter<ZonedDateTime, String> getSerializer() {
        return new Converter<ZonedDateTime, String>() {
            @Override
            public String convert(ZonedDateTime source) {
                return source.format(DateTimeFormatter.ISO_INSTANT);
            }
        };
    }
}
