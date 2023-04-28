package com.example.exam_online.controller;

import com.example.exam_online.entity.Question;
import com.example.exam_online.exception.CustomException;
import com.example.exam_online.response.ResponseHandler;
import com.example.exam_online.service.QuestionnaireService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/questionnaire")
public class QuestionnaireController {
    @Autowired
    private QuestionnaireService questionnaireService;

    @Operation(description = "get questions from code and id exam")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "successfully get questions from code"),
            @ApiResponse(responseCode = "404", description = "not found questions from code",
                    content = @Content(schema = @Schema(implementation = ResponseHandler.class)))
    })
    @GetMapping("/getQuestionnaireByCode/{code}")
    public ResponseHandler<List<Question>> getQuestionsByCode(@PathVariable int code) throws CustomException {
        List<Question> result = questionnaireService.getQuestionsFromCode(code);
        ResponseHandler<List<Question>> responseHandler = new ResponseHandler<List<Question>>("successfully get questions from code",
                                                                                              HttpStatus.OK.value(), result);
        return responseHandler;
    }
}
