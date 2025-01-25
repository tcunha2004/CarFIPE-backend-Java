package com.tcunha2004.CarFIPE.service.ConvertData;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class ConvertData {
    static ObjectMapper mapper =new ObjectMapper();

    public static <T> T getData(String json, Class<T> classe){
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> getList(String json, Class<T> classe){
        CollectionType list = mapper.getTypeFactory().constructCollectionType(List.class, classe);
        try {
            return mapper.readValue(json, list);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
