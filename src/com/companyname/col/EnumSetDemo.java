package com.companyname.col;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Weekday
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * The EnumSet class provides a Set implementation that is based on a bitset. Its elements are constants
that must come from the same enum, which is specified when the enum set is created. Null elements are
not permitted; any attempt to store a null element results in a thrown NullPointerException.
 *
 */
class EnumSetDemo
{
	public static void main(String[] args)
	{
		Set<Weekday> daysOff = EnumSet.of(Weekday.SUNDAY, Weekday.MONDAY);
		Iterator<Weekday> iter = daysOff.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
			
		System.out.println("\nAllOf ...");
		// allOf() returns an EnumSet instance that contains all of an enum’s constants,
		// where this method’s solitary argument is a class literal that identifies the enum
		Set<Weekday> allWeekDays = EnumSet.allOf(Weekday.class);
		iter = allWeekDays.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("\nRange ...");
		// range() returns an EnumSet instance containing a range of an enum’s elements (with the range’s limits
		//as specified by this method’s two arguments)
		for (Weekday wd : EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY))
			System.out.println(wd);
	}
}