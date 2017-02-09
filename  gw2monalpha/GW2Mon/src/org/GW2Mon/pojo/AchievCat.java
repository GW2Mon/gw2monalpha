package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AchievCat {

	private int Id;
	private String NameGer, NameEng;

	/**
	 * @category constructor
	 * @param id
	 * @param nameGer
	 * @param nameEng
	 */
	public AchievCat(int id, String nameGer, String nameEng) {
		this.setId(id);
		this.NameGer = nameGer;
		this.NameEng = nameEng;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Id
	public int getId() {
		return Id;
	}

	/**
	 * @category setter
	 * @param id
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable=false)
	public String getNameGer() {
		return NameGer;
	}

	/**
	 * @category setter
	 * @param nameGer
	 */
	public void setNameGer(String nameGer) {
		NameGer = nameGer;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable = false)
	public String getNameEng() {
		return NameEng;
	}

	/**
	 * @category setter
	 * @param nameEng
	 */
	public void setNameEng(String nameEng) {
		NameEng = nameEng;
	}
}
