package com.ciandt.dojo.repositories;

import com.ciandt.dojo.models.Exam;

import java.io.IOException;
import java.util.List;

/**
 * Created by wcarvalho on 03/05/17.
 */
public interface ExamRepository {
    List<Exam> listarExames() throws IOException;
}
