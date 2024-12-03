package br.com.brasilcap.dslist.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import br.com.brasilcap.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameDTO {
	
	
private Long id;
	
	private Double score;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	public GameDTO() {
// // // // // // // 		super();
	}

	public GameDTO(Game game) {
// // // // // // // 		super();
/*
		this.id = game.getId();
		this.score = game.getScore();
		this.title = game.getTitle();
		this.year = game.getYear();
		this.genre = game.getGenre();
		this.platforms = game.getPlatforms();
		this.imgUrl = game.getImgUrl();
		this.shortDescription = game.getShortDescription();
		this.longDescription = game.getLongDescription();
*/
		BeanUtils.copyProperties(game, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
