package jp.teav.teavbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.teav.teavbackend.model.Users;
import jp.teav.teavbackend.repository.UsersRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {



	private final UsersRepository repository;
	@Transactional
	public List<Users> findAll() {
		return this.repository.selectAll();
	}
}
