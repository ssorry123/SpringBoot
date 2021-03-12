package com.psw.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 문자열(파일 경로)에 해당하는 파일을 리턴한다.
@Controller
public class TempControllerTest {

	// No YML version
//	// /blog/temp/home
//	@GetMapping("/temp/home")
//	public String tempHome() {
//		System.out.println("tempHome 호출");
//		// home.html 파일을 리턴한다
//		return "/home.html";
//	}
//	
//	@GetMapping("/temp/img")
//	public String tempImg() {
//		return "/a.img";
//	}

	@GetMapping("temp/jsp")
	public String tempJsp() {
		return "test";
	}
}
