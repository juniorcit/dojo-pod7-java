package com.ciandt.dojo.controllers;

import com.ciandt.dojo.models.Exam;
import com.ciandt.dojo.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Created by wcarvalho on 03/05/17.
 */
@RestController
public class ExamController {

    @Autowired
    private ExamService examService;

    @RequestMapping("/exams")
    public List<Exam> listarTodos(){
        try {
            return examService.listarExames();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
