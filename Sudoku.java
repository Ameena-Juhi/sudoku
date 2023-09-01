package com.example.Sudoku.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sudoku {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rowId;
	
	@Column
	private int Column2;
	@Column
	private int Column3;
	@Column
	private int Column4;
	@Column
	private int Column5;
	@Column
	private int Column6;
	@Column
	private int Column7;
	@Column
	private int Column8;
	@Column
	private int Column9;
	
	@Column
	private int Column1;
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	public int getColumn1() {
		return Column1;
	}
	public void setColumn1(int column1) {
		Column1 = column1;
	}
	public int getColumn2() {
		return Column2;
	}
	public void setColumn2(int column2) {
		Column2 = column2;
	}
	public int getColumn3() {
		return Column3;
	}
	public void setColumn3(int column3) {
		Column3 = column3;
	}
	public int getColumn4() {
		return Column4;
	}
	public void setColumn4(int column4) {
		Column4 = column4;
	}
	public int getColumn5() {
		return Column5;
	}
	public void setColumn5(int column5) {
		Column5 = column5;
	}
	public int getColumn6() {
		return Column6;
	}
	public void setColumn6(int column6) {
		Column6 = column6;
	}
	public int getColumn7() {
		return Column7;
	}
	public void setColumn7(int column7) {
		Column7 = column7;
	}
	public int getColumn8() {
		return Column8;
	}
	public void setColumn8(int column8) {
		Column8 = column8;
	}
	public int getColumn9() {
		return Column9;
	}
	public void setColumn9(int column9) {
		Column9 = column9;
	}
	
	

}
