package com.homeworks.knightjob.knights;

import com.homeworks.knightjob.quests.Quest;

public class BraveKnight implements Knight {
	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() throws Exception {
		quest.embark();
	}
}
