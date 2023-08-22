//  In this code we learn how variables work in kotlin.
package kotlinpack;

fun main( args: Array<String>){
	println("Hello Kotlin")

// In kotlin we declare variables in two ways 

	var num = 10
	val num2 = 20

// In kotlin we don't need to declare datatype of variable kotlin automatic assigned datatype according which value we give us.
// "var num = 10" this is simple variable mean we can reassigned (change) values of variabales after declaration.
// "val num2 = 20" this is constant variable meam we can't reassigned (change) values of variables after declaration. 

	var x = 5
	x = 7 // ----> This is allow.

	val y = 8
	// y = 9 // -----> This is not allow beacuse this is constant.


// 1. If we assigne a particuller datatype to a variable. Write like this

// a. Numbers datatype
	var a: Int = 10000
	var f: Long = 1000000004
	var g: Short = 10
	var h: Byte = 1
	var d: Float = 100.00f
	var e: Double = 100.00

// a(i). Print the above variables
	println("Int value is $a")
	println("Long value is $f")
	println("Short value is $g")
	println("Byte value is $h")
	println("Float value is $d")
	println("Double value is $e")

// b. Char and String datatype 
	var b: Char
	b = 'K'
 	var c: String = "Kotlin"

 // b(i). Print the above variables
 	println("$b")
 	println(c)

// c Boolean datatype
	var i: Boolean = true
	var j: Boolean = false

// c(i). Print the above variables
	println("Value of variable i $i")
	println("Value of variable j $j")

// d. Array datatype
	var TextArray: IntArray = intArrayOf(1,2,3,4,5)

// d(i). Print the above variables
	println("Value of 3rd position : " +TextArray[2])

 
}