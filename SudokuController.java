package com.example.Sudoku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Sudoku.model.SudokuInput;


@Controller
@RequestMapping("/puzzle")
public class SudokuController {

    @GetMapping("/sudoku")
    public String showSudokuInput(Model model) {
        SudokuInput sudokuInput = new SudokuInput();
        sudokuInput.setSudoku(new int[9][9]);
        model.addAttribute("sudokuInput", sudokuInput);
        return "SudokuView";
    }

    @PostMapping("/solve")
    public String solveSudoku(@ModelAttribute("sudokuInput") SudokuInput sudokuInput) {
        // Implement Sudoku solving logic here and return the result
        return "sudoku-result"; 
    }
}
