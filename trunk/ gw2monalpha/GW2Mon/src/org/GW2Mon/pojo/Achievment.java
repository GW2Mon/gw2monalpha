package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achievment {

	private int Id, Points, perCharakter;
	private AchievCat Achievcat;
	private AchievCat1 Achievcat1;
	private String NameGer, NameEng, TitelGer, TitelEng, DescGer, DescEng;

	public Achievment(int id, AchievCat achievcat, AchievCat1 achievcat1, int points,
			int percharakter, String nameGer, String NameEng, String descGer,
			String descEng, String titelGer, String titelEng) {
		this.setId(id);
		this.setAchievcat(achievcat);
		this.setAchievcat1(achievcat1);
		this.setNameEng(NameEng);
		this.setNameGer(nameGer);
		this.setDescEng(descEng);
		this.setDescGer(descGer);
		this.setPerCharakter(percharakter);
		this.setPoints(points);
		this.setTitelGer(titelGer);
		this.setTitelEng(titelEng);
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@ManyToOne(targetEntity=AchievCat.class)
	public AchievCat getAchievcat() {
		return Achievcat;
	}

	public void setAchievcat(AchievCat achievcat) {
		Achievcat = achievcat;
	}

	@ManyToOne(targetEntity=AchievCat1.class)
	public AchievCat1 getAchievcat1() {
		return Achievcat1;
	}

	public void setAchievcat1(AchievCat1 achievcat1) {
		Achievcat1 = achievcat1;
	}

	
	public int getPoints() {
		return Points;
	}

	public void setPoints(int points) {
		Points = points;
	}

	public int getPerCharakter() {
		return perCharakter;
	}

	public void setPerCharakter(int perCharakter) {
		this.perCharakter = perCharakter;
	}

	public String getNameGer() {
		return NameGer;
	}

	public void setNameGer(String nameGer) {
		NameGer = nameGer;
	}

	public String getNameEng() {
		return NameEng;
	}

	public void setNameEng(String nameEng) {
		NameEng = nameEng;
	}

	public String getTitelGer() {
		return TitelGer;
	}

	public void setTitelGer(String titelGer) {
		TitelGer = titelGer;
	}

	public String getTitelEng() {
		return TitelEng;
	}

	public void setTitelEng(String titelEng) {
		TitelEng = titelEng;
	}

	public String getDescGer() {
		return DescGer;
	}

	public void setDescGer(String descGer) {
		DescGer = descGer;
	}

	public String getDescEng() {
		return DescEng;
	}

	public void setDescEng(String descEng) {
		DescEng = descEng;
	}

}
