package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AchievCat1 {

	private int Id, SumPoints, CountAchiev;
	private AchievCat Achievcat;
	private String NameGer, NameEng;
	
	public AchievCat1(int id, String nameGer, String nameEng,AchievCat achievcat,int countAchiev,int sumPoints) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setAchievcat(achievcat);
		this.setCountAchiev(countAchiev);
		this.setSumPoints(sumPoints);
	}

	@ManyToOne(targetEntity=AchievCat.class)
	public AchievCat getAchievcat() {
		return Achievcat;
	}

	public void setAchievcat(AchievCat achievcat) {
		Achievcat = achievcat;
	}

	public int getSumPoints() {
		return SumPoints;
	}

	public void setSumPoints(int sumPoints) {
		SumPoints = sumPoints;
	}

	public int getCountAchiev() {
		return CountAchiev;
	}

	public void setCountAchiev(int countAchiev) {
		CountAchiev = countAchiev;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
}
