package com.psw.blog.test;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Getter
//@Setter
//@AllArgsConstructor
@Data
@NoArgsConstructor
public class Member {
	private int id;
	private String userNM;
	private String passWD;

	@Override
	public String toString() {
		return "Member [id=" + id + ", userNM=" + userNM + ", passWD=" + passWD + "]";
	}

	// 빌드 패턴, 원하는 것만 세팅할 수 있게 된다.
	@Builder
	public Member(int id, String userNM, String passWD) {
		super();
		this.id = id;
		this.userNM = userNM;
		this.passWD = passWD;
	}
	

//	Lombok 적용으로 인해 삭제
//	public Member(int id, String userNM, String passWD) {
//		super();
//		this.id = id;
//		this.userNM = userNM;
//		this.passWD = passWD;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getUserNM() {
//		return userNM;
//	}
//
//	public void setUserNM(String userNM) {
//		this.userNM = userNM;
//	}
//
//	public String getPassWD() {
//		return passWD;
//	}
//
//	public void setPassWD(String passWD) {
//		this.passWD = passWD;
//	}
//
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", userNM=" + userNM + ", passWD=" + passWD + "]";
//	}

}
