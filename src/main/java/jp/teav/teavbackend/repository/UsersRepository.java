package jp.teav.teavbackend.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.teav.teavbackend.model.Users;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UsersRepository {
	

	private final JdbcTemplate jdbcTemplate;

	public List<Users> selectAll() {
		String sql = "select id ,name,introduction,followings,followers,created_at,updated_at from teavdb.users;";
		List<Map<String, Object>> syainList = jdbcTemplate.queryForList(sql);
		List<Users> list = new ArrayList<>();
		for (Map<String, Object> syain : syainList) {
			list.add(new Users(
					(long) syain.get("id"),
					(String) syain.get("name"),
					(String) syain.get("introduction"),
					(long) syain.get("followings"),
					(boolean) syain.get("followers"),
					(Date) syain.get("created_at"),
					(Date) syain.get("updated_at")));
		}
		return list;
		
	}

}
