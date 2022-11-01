package it.parisio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppSerialization 
{
    public static ObjectMapper om = new ObjectMapper();

    public static String serializeToString(Classe c) throws JsonProcessingException{
        return om.writeValueAsString(c);
    }

    public static void serializeToFile(Classe c, String file){
        try {
            om.writeValue(new File(file), c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main( String[] args ) throws JsonProcessingException
    {   
        Alunno a = new Alunno("francesco", "parisio", new Date(2004, 10, 9));
        Alunno b = new Alunno("Alunno", "Alunni", new Date(2002, 10, 4));

        ArrayList<Alunno> al = new ArrayList<>();
        al.add(a);
        al.add(b);

        Classe c = new Classe(5, "B", "05-TW", al);

        System.out.println(serializeToString(c));
        serializeToFile(c,"classe.json");
    }
}
