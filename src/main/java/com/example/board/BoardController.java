package com.example.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	public final static String PATH_NAME = "board";

	@RequestMapping("/hello")
	public String hello() {
		return "/" + PATH_NAME + "/hello";
	}
}
