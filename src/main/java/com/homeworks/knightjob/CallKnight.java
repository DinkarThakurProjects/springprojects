package com.homeworks.knightjob;

import com.homeworks.knightjob.knights.BraveKnight;
import com.homeworks.knightjob.knights.DameslRescuingKnight;
import com.homeworks.knightjob.knights.Knight;

public class CallKnight {

	public static void main(String[] args) throws Exception {
		Knight damselresquer = new DameslRescuingKnight();
		damselresquer.embarkOnQuest();
	}
}
