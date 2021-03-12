package com.psw.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 응답(html)
// @Controller

// 사용자가 요청 -> 응답(data)
@RestController
public class HttpControllerTest {

	/*
	 * (수신 시)
	 * 
	 * @RequestParam 또는 만들어 놓은 객체로 받을 수 있다.
	 */

	/*
	 * GET 방식은 (요청 시)쿼리 스트링 방식만 가능하다. ex)
	 * http://localhost:8080/http/post?id=123&passWD=321
	 */
	// 어노테이션으로 하나씩 받기
	// 요청을 보낼 때 인자를 모두 쿼리스트링으로 보내주어야 오류가 나지 않는다.
	// (NULL을 허용하지 않는다)
	@GetMapping("/http/get1")
	public String getTest1(@RequestParam int id, @RequestParam String passWD) {
		return "겟1\n" + id + " " + passWD;
	}

	// 객체로 파람 받기
	@GetMapping("/http/get2")
	public String getTest2(Member member) {
		return "겟2\n" + member.toString();
	}

	// 빌더 패턴 테스트
	@GetMapping("/http/build")
	public String buildTest() {
		Member m = Member.builder().userNM("홍길동").id(123).passWD("123123").build();
		return m.toString();
	}

	/*
	 * post, put, delete 방식 (요청 시) 쿼리 스트링, Body 등 다양한 방법 가능하다.
	 */
	// x-www-form-urlencoded
	@PostMapping("/http/post1")
	public String postTest1(Member member) {
		return "포스트1\n" + member.toString();
	}

	// raw(text), body data
	@PostMapping("/http/post2")
	public String postTest2(@RequestBody String text) {
		return "포스트2\n" + text;
	}

	// raw(json), (application/json)
	// Message converter 가 json 데이터를 바꿔서 member에 넣어준다.
	@PostMapping("/http/post3")
	public String postTest3(@RequestBody Member member) {
		return "포스트3\n" + member.toString();
	}

	// Lombok 테스트
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member member) {
		return "풋\n" + member.getId() + ", " + member.getUserNM() + ", " + member.getPassWD();
	}

	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "델리트";
	}

}
