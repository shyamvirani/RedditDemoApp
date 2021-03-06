package com.reddit.redditapp.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subreddit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subredditId;
	
	@NotBlank(message = "Community name is required")
	private String name;
	
    @NotBlank(message = "Description is required")
	private String description;
	
	private Instant createdDate;
    
    @OneToMany(fetch = FetchType.LAZY,cascade = javax.persistence.CascadeType.REMOVE)
	private List<Post> posts;
	

	@ManyToOne(fetch = FetchType.LAZY,cascade=javax.persistence.CascadeType.REMOVE)
	private User user;

}
