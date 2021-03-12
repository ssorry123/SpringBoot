package com.psw.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	// com.cos.blog 패키지 이하를 스캔해서
			// 특정 어노테이션이 붙어있는 클래스 파일들을 new(IOC)해서 컨테이너에서 관리
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello String boot</h1>";
	}
}
