package com.order.wchart.utils;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    protected static ObjectMapper mapper = new ObjectMapper();
    protected static JsonFactory factory = mapper.getJsonFactory();

    public static String toString(Object o) throws Exception {
        return mapper.writeValueAsString(o);
    }

    public static Object toObject(String s, Class clazz) throws Exception {
        return mapper.readValue(s, clazz);
    }
}
