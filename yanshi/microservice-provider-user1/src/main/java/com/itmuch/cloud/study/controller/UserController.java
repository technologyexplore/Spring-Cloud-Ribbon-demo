package com.itmuch.cloud.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;

@RestController
public class UserController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		LOG.warn("服务3 findById接口");
		User findOne = this.userRepository.findOne(id);
		return findOne;
	}
}
