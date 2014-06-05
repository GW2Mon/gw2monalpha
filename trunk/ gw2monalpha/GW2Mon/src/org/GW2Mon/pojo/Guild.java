package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Guild {

	private int Id, MemberCount, GuildMerit, Influence;
	private Charakter Leader;
	private Account LeaderAcc;
	private String Name, Tag, Hint, GuildBanner, Commentary;

	public Guild(int id, String name, String tag, Charakter leader, Account leaderAcc,
			int memberCount, int guildmerit, int influence, String guildBanner,
			String hint, String commentary) {
		this.setId(id);
		this.setName(name);
		this.setTag(tag);
		this.setLeader(leader);
		this.setLeaderAcc(leaderAcc);
		this.setMemberCount(memberCount);
		this.setGuildBanner(guildBanner);
		this.setCommentary(commentary);
		this.setGuildMerit(guildmerit);
		this.setInfluence(influence);
		this.setHint(hint);
	}

	public int getMemberCount() {
		return MemberCount;
	}

	public void setMemberCount(int memberCount) {
		MemberCount = memberCount;
	}

	@ManyToOne(targetEntity=Charakter.class)
	public Charakter getLeader() {
		return Leader;
	}

	public void setLeader(Charakter leader) {
		Leader = leader;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(nullable=false)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Column(nullable=false)
	public String getTag() {
		return Tag;
	}

	public void setTag(String tag) {
		Tag = tag;
	}

	public int getGuildMerit() {
		return GuildMerit;
	}

	public void setGuildMerit(int guildMerit) {
		GuildMerit = guildMerit;
	}

	public int getInfluence() {
		return Influence;
	}

	public void setInfluence(int influence) {
		Influence = influence;
	}

	public String getCommentary() {
		return Commentary;
	}

	public void setCommentary(String commentary) {
		Commentary = commentary;
	}

	public String getHint() {
		return Hint;
	}

	public void setHint(String hint) {
		Hint = hint;
	}

	public String getGuildBanner() {
		return GuildBanner;
	}

	public void setGuildBanner(String guildBanner) {
		GuildBanner = guildBanner;
	}

	@ManyToOne(targetEntity=Account.class)
	public Account getLeaderAcc() {
		return LeaderAcc;
	}

	public void setLeaderAcc(Account leaderAcc) {
		LeaderAcc = leaderAcc;
	}
}
