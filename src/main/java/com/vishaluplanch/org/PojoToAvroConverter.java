package com.vishaluplanch.org;


import com.vishaluplanch.org.pojo.LoanDetailPojo;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PojoToAvroConverter {

    public static void main(String[] args) throws IOException {
        Schema schema = ReflectData.get().getSchema(LoanDetailPojo.class);
        File schemaFile = new File("src/main/resources/loan-detail.avsc");
        FileWriter fileWriter = new FileWriter(schemaFile);
        fileWriter.append(schema.toString(true));
        fileWriter.close();


        List<String> list = new ArrayList<>();

        List<java.lang.CharSequence> ss = new ArrayList<>();



        ss.add("hell world");
        ss.add("hell world");
        ss.add("hell world");
        ss.add("hell world");
        ss.add("hell world");

        List<String> list1 = ss.stream().map(CharSequence::toString).collect(Collectors.toList());




    }
}
