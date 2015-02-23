//cloned from Brian Capoch Repo
// Commented by Thaddeus Albert 2/23/2015` 
public class Car {/
// creates a public class named car
	public String make;
// two public data types one is a list and the other is an integer, the list is the make of the car and the int is the year
	public int year;
// The upper portion of this code is the data        
/* ----------------------------------------------------------------- */
// below this line is the behavior of the data
Car () {
// this constructor has two data members 
	make = "Unknown";
	year = 2015;
	}
// this constructor calls the string "make" 
Car (String thisMake) {
	this();
	make = thisMake;
	}
/// this final constructor calls both "make" and the "year or int"
Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}
// Not a constructor writes new line print out make and year 
public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
