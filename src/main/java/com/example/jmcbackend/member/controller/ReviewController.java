package com.example.jmcbackend.member.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @PostMapping
    public ResponseEntity<String> writeReview(Principal principal) {

        String userId = principal.getName();
        return ResponseEntity.ok().body("리뷰 등록이 완료 되었습니다." + userId);
    }
}
