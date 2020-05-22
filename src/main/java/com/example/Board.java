package com.example;

import java.util.Date;

public class Board {

	private int number;
	private String id;
	private String title;
	private String date;

	public Board(int number, String id, String title, String date) {

		// TODO Auto-generated constructor stub
		super();

		this.number = number;
		this.id = id;
		this.title = title;
		this.date = date;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
