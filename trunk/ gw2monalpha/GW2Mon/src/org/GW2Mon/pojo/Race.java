package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Race {
	private String NameGer, NameEng, HintGer, HintEng;
	private int Id;
	private City Capital;

	public Race(int id, String nameGer, String nameEng, String hintGer,
			String hintEng, City capital) {
		this.Id = id;
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setHintGer(hintGer);
		this.setHintEng(hintEng);
		this.setCapital(capital);
	}

	public Race() {
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	@Id
	public int getId() {
		return this.Id;
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

	public String getHintGer() {
		return HintGer;
	}

	public void setHintGer(String hintGer) {
		HintGer = hintGer;
	}

	public String getHintEng() {
		return HintEng;
	}

	public void setHintEng(String hintEng) {
		HintEng = hintEng;
	}

	@ManyToOne(targetEntity = City.class)
	@JoinColumn(name = "Capital")
	public City getCapital() {
		return Capital;
	}

	public void setCapital(City capital) {
		Capital = capital;
	}
}
