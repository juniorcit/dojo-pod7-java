package com.ciandt.dojo.util;

import com.ciandt.dojo.models.Exam;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by wcarvalho on 03/05/17.
 */
public class ExamsCsvFileParserTest {

    private static final String path = "/home/CIT/wcarvalho/Git/dojo-pod7-java/src/main/resources/exams.csv";

    @Test
    public void readCsvHead() throws Exception {
        ExamsCsvFileParser examsReader = new ExamsCsvFileParser(path);
        List<String> heads = examsReader.ReadCsvHead();
        Assert.assertNotNull(heads);
        Assert.assertEquals(3,heads.size());
        Assert.assertEquals("name",heads.get(0));
        Assert.assertThat(heads, Matchers.contains("name", "code", "price"));
        Assert.assertThat(heads, Matchers.notNullValue());

    }

    @Test
    public void readCsvBody() throws Exception {
        ExamsCsvFileParser examsReader = new ExamsCsvFileParser(path);
        List<Exam> examBody = examsReader.ReadCsvBody();

        Assert.assertThat(examBody, Matchers.notNullValue());
        Assert.assertEquals(229, examBody.size());
/*        Assert.assertThat(examBody,
                Matchers.hasToString((
                        new Exam("ACIDO FOLICO", "28.01.006-0", 22.1)).toString()));*/
    }
}
