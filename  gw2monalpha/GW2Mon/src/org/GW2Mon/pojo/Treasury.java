package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Treasury {
	private int Id, Coin, Karma, BadgeOfHonor, Laurel, FractalRelic,
			GuildCommendation, AscalonianTear, SealOfBeetletun, DeadlyBloom,
			ManifestoOfTheMoletariate, FlameLegionCharrCarving, SymbolOfKoda,
			KnowledgeCrystal, ShardOfZhaitan;

	public Treasury(int id, int coin, int karma, int badgeOfHonor, int laurel,
			int fractalRelic, int guildCommendation, int ascalonianTear,
			int sealOfBeetletun, int deadlyBloom,
			int manifestoOfTheMoletariate, int flameLegionCharrCarving,
			int symbolOfKoda, int knowledgeCrystal, int shardOfZhaitan) {
		this.setId(id);
		this.setCoin(coin);
		this.setKarma(karma);
		this.setBadgeOfHonor(badgeOfHonor);
		this.setLaurel(laurel);
		this.setFractalRelic(fractalRelic);
		this.setGuildCommendation(guildCommendation);
		this.setAscalonianTear(ascalonianTear);
		this.setSealOfBeetletun(sealOfBeetletun);
		this.setDeadlyBloom(deadlyBloom);
		this.setManifestoOfTheMoletariate(manifestoOfTheMoletariate);
		this.setFlameLegionCharrCarving(flameLegionCharrCarving);
		this.setSymbolOfKoda(symbolOfKoda);
		this.setKnowledgeCrystal(knowledgeCrystal);
		this.setShardOfZhaitan(shardOfZhaitan);
	}

	public Treasury() {
	}

	public int getKarma() {
		return Karma;
	}

	public void setKarma(int karma) {
		Karma = karma;
	}

	public int getFractalRelic() {
		return FractalRelic;
	}

	public void setFractalRelic(int fractalRelic) {
		FractalRelic = fractalRelic;
	}

	public int getLaurel() {
		return Laurel;
	}

	public void setLaurel(int laurel) {
		Laurel = laurel;
	}

	public int getCoin() {
		return Coin;
	}

	public void setCoin(int coin) {
		Coin = coin;
	}

	public int getBadgeOfHonor() {
		return BadgeOfHonor;
	}

	public void setBadgeOfHonor(int badgeOfHonor) {
		BadgeOfHonor = badgeOfHonor;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getGuildCommendation() {
		return GuildCommendation;
	}

	public void setGuildCommendation(int guildCommendation) {
		GuildCommendation = guildCommendation;
	}

	public int getAscalonianTear() {
		return AscalonianTear;
	}

	public void setAscalonianTear(int ascalonianTear) {
		AscalonianTear = ascalonianTear;
	}

	public int getSealOfBeetletun() {
		return SealOfBeetletun;
	}

	public void setSealOfBeetletun(int sealOfBeetletun) {
		SealOfBeetletun = sealOfBeetletun;
	}

	public int getDeadlyBloom() {
		return DeadlyBloom;
	}

	public void setDeadlyBloom(int deadlyBloom) {
		DeadlyBloom = deadlyBloom;
	}

	public int getSymbolOfKoda() {
		return SymbolOfKoda;
	}

	public void setSymbolOfKoda(int symbolOfKoda) {
		SymbolOfKoda = symbolOfKoda;
	}

	public int getFlameLegionCharrCarving() {
		return FlameLegionCharrCarving;
	}

	public void setFlameLegionCharrCarving(int flameLegionCharrCarving) {
		FlameLegionCharrCarving = flameLegionCharrCarving;
	}

	public int getManifestoOfTheMoletariate() {
		return ManifestoOfTheMoletariate;
	}

	public void setManifestoOfTheMoletariate(int manifestoOfTheMoletariate) {
		ManifestoOfTheMoletariate = manifestoOfTheMoletariate;
	}

	public int getKnowledgeCrystal() {
		return KnowledgeCrystal;
	}

	public void setKnowledgeCrystal(int knowledgeCrystal) {
		KnowledgeCrystal = knowledgeCrystal;
	}

	public int getShardOfZhaitan() {
		return ShardOfZhaitan;
	}

	public void setShardOfZhaitan(int shardOfZhaitan) {
		ShardOfZhaitan = shardOfZhaitan;
	}

}
