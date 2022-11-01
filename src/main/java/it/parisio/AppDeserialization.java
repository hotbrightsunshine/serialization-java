package it.parisio;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppDeserialization {
    static ObjectMapper om = new ObjectMapper();

    public static Classe deserializeFromFile(String s) throws StreamReadException, DatabindException, IOException{
        return om.readValue(new File(s), Classe.class);
    }

    public static Classe deserializeFromString(String s) throws JsonMappingException, JsonProcessingException{
        return om.readValue(s, Classe.class);
    }

    public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
        System.out.println(deserializeFromFile("classe.json"));
    }
}
