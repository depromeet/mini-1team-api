package com.depromeet.team.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.depromeet.team.domain.CommentVO;
import com.depromeet.team.service.CommentService;

@RestController
@RequestMapping("/commentTest")
public class CommentController {
	@Autowired
	private CommentService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody CommentVO vo) {
		try {
			service.createComment(vo);
			return ResponseEntity.ok()
					.body("SUCCESS");
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest()
					.body(e.getMessage());
		}
	}
	
	@RequestMapping(value = "/{movie_seq}/all", method = RequestMethod.GET)
	public ResponseEntity<List<CommentVO>> list(@PathVariable("movie_seq") long movie_seq) {
		try {
			return ResponseEntity.ok()
					.body(service.listAllComment(movie_seq));
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest()
					.body(null);
		}
	}
	
	@RequestMapping(value = "/{seq}", method = { RequestMethod.PUT, RequestMethod.PATCH })
	public ResponseEntity<String> update(@PathVariable("seq") long seq, @RequestBody CommentVO vo) {
		try {
			vo.setSeq(seq);
			service.updateComment(vo);
			return ResponseEntity.ok()
					.body("SUCCESS");
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest()
					.body(e.getMessage());
		}
	}
	
	@RequestMapping(value = "/{seq}", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable("seq") long seq) {
		try {
			service.deleteComment(seq);
			return ResponseEntity.ok()
					.body("SUCCESS");
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest()
					.body(e.getMessage());
		}
	}
}
