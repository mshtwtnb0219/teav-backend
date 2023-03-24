package jp.teav.teavbackend.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {

	// ユーザID
	private Long id;
	
	// ユーザ名
	private String name;
	
	// 自己紹介
	private String introduction;
	
	// フォロー数
	private Long followings;
	
	// フォロワー数 
	private boolean followers;
	
	// 作成日時
	private Date created_at;
	
	// 更新日時
	private Date updated_at; 
	
	
	
}
