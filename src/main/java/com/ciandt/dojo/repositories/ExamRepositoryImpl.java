package com.ciandt.dojo.repositories;

import com.ciandt.dojo.models.Exam;
import com.ciandt.dojo.util.ExamsCsvFileParser;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

/**
 * Created by wcarvalho on 03/05/17.
 */
@Repository
public class ExamRepositoryImpl implements ExamRepository {

    private static final String path = "/home/CIT/wcarvalho/Git/dojo-pod7-java/src/main/resources/exams.csv";

    @Override
    public List<Exam> listarExames() throws IOException {
        ExamsCsvFileParser parser = new ExamsCsvFileParser(path);
        return parser.ReadCsvBody();
    }
}
