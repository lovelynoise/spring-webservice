package com.project.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.webservice.domain.PostsRepository;
import com.project.webservice.dto.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

	private PostsRepository postsRepository;

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}

	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto) {
		postsRepository.save(dto.toEntity());
	}

}
