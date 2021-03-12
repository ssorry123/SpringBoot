package com.psw.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 유저
 * 
 * @author 박서원
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // DB에 등록할 것이다.
public class User {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에 연결된 DB넘버링 전략을 따라감.
	private int userId; // sequences(oracle) or auto_increment(mysql)

	@Column(nullable = false, length = 20)
	private String userNM;

	@Column(nullable = false, length = 100)
	private String userPW;

	@Column(nullable = false, length = 50)
	private String userEmail;

	// 주의, 쌍따옴표 안에 따옴표 있어야함.
	@ColumnDefault("'user'")
	private String userRole; // Enum을 쓰는게 좋다.

	@CreationTimestamp // 데이터가 삽입될때 자동 입력
	private Timestamp createDate;

}
