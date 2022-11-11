package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		School.demo();		
	}

/*
 * Q.
 *  * Create a School class with TWO Lists of Students:
 *         List<Student> studentRoster (using Student API)
 *         List<Person> personRoster (using Person API)
 *     5 POINTS - add method to add Students to Student List
 *     5 POINTS - add method to add Students to Person List
 *     5 POINTS - add method to sort Students to Student List
 *     5 POINTS - add method to sort Students to Person List
 *    10 POINTS - Override toString() to show both Lists     
 *
 * Add 5 Students to EACH List
 *     10 POINTS - Person is super class
 *     10 POINTS - Student is derived subclass of Person
 * 
 * Sort EACH List of students 4 TIMES: 
 *     10 POINTS 1. by ID, and show both Lists
 *     10 POINTS 2. by Age, and show both Lists
 *     10 POINTS 3. by Last Name, and show both Lists
 *     20 POINTS 4. by GPA, and show both Lists
 * 
 */
	
	/*
	 * CONSOLE OUTPUT
	 * 
Sort by ID: 
### Student List ###
Student [id= 8, lastName= Lee, age= 26, gpa= 3.3]
Student [id= 12, lastName= Scott, age= 25, gpa= 4.0]
Student [id= 21, lastName= Hall, age= 23, gpa= 3.7]
Student [id= 33, lastName= Carter, age= 23, gpa= 3.8]
Student [id= 50, lastName= Adams, age= 21, gpa= 3.5]

### Person List ###
Person [id= 1, age= 24, lastName= Johnson]
Person [id= 2, age= 20, lastName= Lopez]
Person [id= 9, age= 19, lastName= Smith]
Person [id= 10, age= 22, lastName= Martin]
Person [id= 30, age= 23, lastName= Hill]

Sort by Age: 
### Student List ###
Student [id= 50, lastName= Adams, age= 21, gpa= 3.5]
Student [id= 21, lastName= Hall, age= 23, gpa= 3.7]
Student [id= 33, lastName= Carter, age= 23, gpa= 3.8]
Student [id= 12, lastName= Scott, age= 25, gpa= 4.0]
Student [id= 8, lastName= Lee, age= 26, gpa= 3.3]

### Person List ###
Person [id= 9, age= 19, lastName= Smith]
Person [id= 2, age= 20, lastName= Lopez]
Person [id= 10, age= 22, lastName= Martin]
Person [id= 30, age= 23, lastName= Hill]
Person [id= 1, age= 24, lastName= Johnson]

Sort by Last Name: 
### Student List ###
Student [id= 50, lastName= Adams, age= 21, gpa= 3.5]
Student [id= 33, lastName= Carter, age= 23, gpa= 3.8]
Student [id= 21, lastName= Hall, age= 23, gpa= 3.7]
Student [id= 8, lastName= Lee, age= 26, gpa= 3.3]
Student [id= 12, lastName= Scott, age= 25, gpa= 4.0]

### Person List ###
Person [id= 30, age= 23, lastName= Hill]
Person [id= 1, age= 24, lastName= Johnson]
Person [id= 2, age= 20, lastName= Lopez]
Person [id= 10, age= 22, lastName= Martin]
Person [id= 9, age= 19, lastName= Smith]

Sort by GPA: 
### Student List ###
Student [id= 8, lastName= Lee, age= 26, gpa= 3.3]
Student [id= 50, lastName= Adams, age= 21, gpa= 3.5]
Student [id= 21, lastName= Hall, age= 23, gpa= 3.7]
Student [id= 33, lastName= Carter, age= 23, gpa= 3.8]
Student [id= 12, lastName= Scott, age= 25, gpa= 4.0]

### Person List ###
Person [id= 30, age= 23, lastName= Hill]
Person [id= 1, age= 24, lastName= Johnson]
Person [id= 2, age= 20, lastName= Lopez]
Person [id= 10, age= 22, lastName= Martin]
Person [id= 9, age= 19, lastName= Smith]
	 */

}
