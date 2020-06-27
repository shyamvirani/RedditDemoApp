package com.reddit.redditapp.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {
	
	private String authenticationToken;
    private String username;
    private String refreshToken;
    private Instant expiresAt;

}
