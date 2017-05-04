package com.ciandt.dojo.services;

import com.ciandt.dojo.models.Exam;
import com.ciandt.dojo.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by wcarvalho on 03/05/17.
 */
@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository repository;

    @Override
    public List<Exam> listarExames() throws IOException {
        return repository.listarExames();
    }
}
