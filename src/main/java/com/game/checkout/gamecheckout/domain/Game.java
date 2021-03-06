package com.game.checkout.gamecheckout.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GameId")
	private Long gameId;

	@NotNull(message = "Game title cannot be null")
	@Column(name = "Title")
	private String title;

	@Min(value = 1, message = "Game must require at least one player.")
	@Column(name = "MinPlayerCount")
	private Integer minPlayerCount;

	@Max(value = 10000, message = "I highly doubt there's that many players.")
	@Column(name = "MaxPlayerCount")
	private Integer maxPlayerCount;

	@Column(name = "PlayTime")
	private Integer playTime;

	@Column(name = "Age")
	private Integer age;

	@Column(name = "Complexity")
	private String complexity;

	@Column(name = "Designer")
	private String designer;

	@Column(name = "Publisher")
	private String publisher;

	@Column(name = "YearPublished")
	private String yearPublished;

	@Column(name = "Rating")
	private String rating;

	@Column(name = "DateAdded")
	private LocalDateTime dateAdded;

	@Column(name = "LastModified")
	private LocalDateTime lastModified;
	
	public enum Status {
		OUT,
		AVAILABLE;
		
		public Status toggle() {
			if (this.equals(OUT)) {
				return AVAILABLE;
			}
			else {
				return OUT;
			}
		}
	}
	
	private Status status;
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public Game() {}
	
	public Game(String title, Integer minPlayerCount, Integer maxPlayerCount, Integer playTime, Integer age, String complexity,
			String designer, String publisher, String yearPublished, String rating, Status status, LocalDateTime dateAdded,
			LocalDateTime lastModified) {
		super();
		this.title = title;
		this.minPlayerCount = minPlayerCount;
		this.maxPlayerCount = maxPlayerCount;
		this.playTime = playTime;
		this.age = age;
		this.complexity = complexity;
		this.designer = designer;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.rating = rating;
		this.status = status;
		this.dateAdded = dateAdded;
		this.lastModified = lastModified;
	}

	public Long getGameId() {
		return gameId;
	}

	public String getTitle() {
		return title;
	}

	public Integer getMinPlayerCount() {
		return minPlayerCount;
	}

	public Integer getMaxPlayerCount() {
		return maxPlayerCount;
	}

	public Integer getPlayTime() {
		return playTime;
	}

	public Integer getAge() {
		return age;
	}

	public String getComplexity() {
		return complexity;
	}

	public String getDesigner() {
		return designer;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public String getRating() {
		return rating;
	}

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMinPlayerCount(Integer minPlayerCount) {
		this.minPlayerCount = minPlayerCount;
	}

	public void setMaxPlayerCount(Integer maxPlayerCount) {
		this.maxPlayerCount = maxPlayerCount;
	}

	public void setPlayTime(Integer playTime) {
		this.playTime = playTime;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	public void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}
	
}