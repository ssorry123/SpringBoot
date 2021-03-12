package com.psw.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 게시글
 * @author 박서원
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int boardId;

	@Column(nullable = false, length = 50)
	private String boardTitle;

	@Lob // 대용량데이터
	private String boardContent; // html 태그가 섞임

	@ColumnDefault("0")
	private int boardCount; // 조회수

	// FK
	// DB는 객체를 저장할 수 없어서 외래키를 사용하지만
	// 자바는 객체를 저장할 수 있어서 외래키를 사용하지 않는다.
	@ManyToOne // 연관관계, Many(board), One(user)
	@JoinColumn(name = "userId") // db에는 userId로 저장된다.
	private User user;

	@CreationTimestamp
	private Timestamp createDate;
}
