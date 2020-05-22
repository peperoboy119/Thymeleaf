package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Board;

@Controller
public class testController {

	@RequestMapping(value = "/home")
	public String main() {
		return "index";
	}

	@RequestMapping(value = "/another")
	public String home() {
		return "myTest";
	}

	@RequestMapping(value = "/board")
	public String board(Model model) {

		List<Board> boardlist = new ArrayList<Board>();

		boardlist.add(new Board(1, "id1", "title1", "2020-05-22"));
		boardlist.add(new Board(2, "id2", "title2", "2020-05-22"));
		boardlist.add(new Board(3, "id3", "title3", "2020-05-22"));

		model.addAttribute("boardlist", boardlist);

		return "board";

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView m) {
		m.setViewName("index");
		m.addObject("message", "입력세요");
		return m;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView send(@RequestParam("text_edit") String str, ModelAndView m) {
		m.addObject("message", "Hello Spring " + str);
		m.addObject("value", str);
		m.setViewName("index");
		return m;
	}

}
