package com.homeworks.knightjob;

//Here you’re using a mock object 
//framework known as Mockito to 
//create a mock implementation of 
//the Quest interface.

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.homeworks.knightjob.knights.BraveKnight;
import com.homeworks.knightjob.quests.Quest;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() throws Exception {
		Quest mockQuest = mock(Quest.class);
		BraveKnight Knight = new BraveKnight(mockQuest);
		Knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
