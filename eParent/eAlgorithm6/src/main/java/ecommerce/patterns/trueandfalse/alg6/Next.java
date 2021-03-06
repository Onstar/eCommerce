package ecommerce.patterns.trueandfalse.alg6;

import java.util.List;

import ecommerce.patterns.trueandfalse.gonext.INext;
import ecommerce.patterns.trueandfalse.gonext.Next1;

public class Next {

	private static INext[] nexts;
	static{
		nexts = new INext[]{new Next1()};
	}
	
	static public boolean go2First(List<Boolean> result, int length, int current) {
		
		boolean go2First = false;
		for(int i=0; i<nexts.length && !go2First; i++){
			go2First = nexts[i].go2First(result, length, current);
		}
		return go2First;
	}

}
