package com.ciandt.dojo.util;

import com.ciandt.dojo.models.Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.lang.reflect.Executable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wcarvalho on 03/05/17.
 */
public class ExamsCsvFileParser {

    private static final String cvsSplitBy = ",";
    private final Reader source;

    public ExamsCsvFileParser(String filePathCsv) throws IOException {
        this.source = Files.newBufferedReader(Paths.get(filePathCsv), Charset.forName("UTF-8"));
    }

    public  List<String> ReadCsvHead(){
        try (BufferedReader br = new BufferedReader(source)) {
            return br.lines()
                    .findFirst()
                    .map(line -> Arrays.asList(line.split(cvsSplitBy)))
                    .get();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

    }

    public List<Exam> ReadCsvBody() {
        try (BufferedReader br = new BufferedReader(source)) {
            return br.lines()
                    .skip(1)
                    .map(line -> mapExam(line))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private Exam mapExam(String line) {
        String[] pieces = line.split(cvsSplitBy);

        Double price;
        try{
            price = Double.parseDouble(pieces[2]);
        } catch (Exception e) {
            price = -1.0;
        }

        return new Exam(pieces[0], pieces[1], price);
    }

}
