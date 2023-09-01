package com.example.Sudoku.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Sudoku.entity.Sudoku;

public interface SudokuRepository extends CrudRepository<Sudoku, Integer> {
	
	

}
