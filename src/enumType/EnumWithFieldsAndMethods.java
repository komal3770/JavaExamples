package enumType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Enum is a special type of class in java which have collection of constants.
 * Enum can have variables and methods
 * **/


enum DAY {
	MONDAY(3){

		@Override
		public int getValue2() {
			return value2;
		}
	},
	TUUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	
	private int value;
	final static int value2=0;
	DAY(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getValue2() {
		return 0;
	}
	
}

public class EnumWithFieldsAndMethods {

	public static void main(String[] args) {
		TreeSet<DAY> enumSet = new TreeSet<DAY>();
		enumSet.add(DAY.SATURDAY);
		enumSet.add(DAY.FRIDAY);
		enumSet.add(DAY.MONDAY);
		enumSet.add(DAY.MONDAY);
		enumSet.add(DAY.MONDAY);
		enumSet.add(DAY.SUNDAY);
		
		System.out.println("===================Using Treeset==============");
		for(DAY d : enumSet) {
			System.out.println(d);
		}
		
		List<DAY> listEnum = new ArrayList<DAY>();
		listEnum.add(DAY.SATURDAY);
		listEnum.add(DAY.FRIDAY);
		listEnum.add(DAY.MONDAY);
		listEnum.add(DAY.SUNDAY);
		Collections.sort(listEnum);
		System.out.println("====================List==================");
		for(DAY d : listEnum) {
			System.out.println(d);
		}
		
		
	}

}
