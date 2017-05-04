package com.ciandt.dojo.services;

import com.ciandt.dojo.models.Exam;

import java.io.IOException;
import java.util.List;

/**
 * Created by wcarvalho on 03/05/17.
 */
public interface ExamService {
    public List<Exam> listarExames() throws IOException;
}
