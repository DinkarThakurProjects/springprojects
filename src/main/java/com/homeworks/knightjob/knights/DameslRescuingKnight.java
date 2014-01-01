package com.homeworks.knightjob.knights;

import com.homeworks.knightjob.quests.RescueDamselQuest;

public class DameslRescuingKnight implements Knight {

	private RescueDamselQuest quest;

	public DameslRescuingKnight() {
		quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() throws Exception {
		quest.embark();
	}
}
