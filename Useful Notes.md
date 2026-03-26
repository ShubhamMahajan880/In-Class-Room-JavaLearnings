Notes -

Day 1:



0\) Standard SYntax or SOurce code will always given as -



class HelloWorld

{



&#x09;public static void main(String args\[])

&#x09;{

&#x09;	System.out.println("Hii, Eveeryone");

&#x09;}



}

\- In the naming convwntion first lwtwe must b capital of class name, if 2 words then both should be capital



1\) For compilation always use the command in the same directory -

\- Javac is the compiler responsible for compiling the file. We are asking for compilation by using javac

\- javac saying compile and check ths file with .java



Directory Path>javac filename.java

E:\\Java This Side\\Day 1>javac Helloworld.java



2\) aways use write naming convention while crating the class. Must be first letter capital and secondone too which is subsequent



This was about compilation and now for output -

3\) For running use the command in same directory as -

Directory Path>java CLASSNAME

E:\\Java This Side\\01\_Day 1>java HelloKodewala



\-------------------------------------------------------------------------------------------------------------------------------



Day 2:



Day 3:

\- When there is only empty class created within program and i am saving the .java file and compiling with compiler then compilation takes place, even no main method, compilation takes place BUT BUT BUT Exectuin is not possible as there is no MAIN METHOD. only COMPILATION happen



class AccountTrying

{



}



\- Next now we have the main method and we are trying to execute via CMD then it happens. compilation and execution both takes place successfully.

\- either we write anything within main method or not but the execution takes place as there is main method which is enough for execution.



class AccountTrying

{

&#x09;public static void main(String args\[])

&#x09;{

&#x09;

&#x09;}



}

\- if we dint use String\[] args OR String args\[] in the method declaration the it throws the error

\- There is must only ONE Main Method. Rest all the classes can be accerssed within the method or another classes can be handles by main method.

\- If there is no main method in the calss so wont work and give error.



\-------------------------------------------------------------------------------------------------------------------------------



Day 4: Understanding of full syntax -



class Gateway

{

&#x09;public static void main(String args\[])

&#x09;{

&#x09;	System.out.println("Payment Proceesses Gateways !!");

&#x09;}

}



public - without public it can't use outside the class. It;s public means can be used even outside the class within the program. If private or non-public then ca't be used outside the class. If not public then JVM won't able to call. When using public then anybody cna call the method outside the class. Here it's calling by JVM which is outside.

static - In java, a method can be called either by class or by object only. by using static can accessed by class name otherwise not. Accessing the class within the program - Payment. main() - from the payment vlas accessing the main method(function). to call main method - required by object or class which can done using by static keyword.

void - returns nothing to jvm, just calling

main - main method must be in main not in Main, otherwise gets error -

Error: Main method not found in class Gateway, please define the main method as:

&#x20;  public static void main(String\[] args)

or a JavaFX application class must extend javafx.application.Application

It's not a resereved keyword.



Make sure to remebr - COMPILER DOEN;T CHECK ANYTHING IT'S ONLY MAKE SURE - IS EVERYTHING AS PER THE STANDARD SYNTAX OR NOT, its A VALID METHOD OR NOT. EXECUTION IS RESPONSIBLE FOR CHECKING THE CORRECTENESS AND ISSUES



\-------------------------------------------------------------------------------------------------------------------------------



Day 5 :



\- JDK, JRE, JVM

JDK - Dev Tool + Compiler - responsible for development of program

JRE - Runtime Environment. All the features, functions responsible for pre built environment. like - System, String and all libraries and files

JVM - A virtum machine created while running/execution of program .



\- rt.java is responsible for one of the core run time environment of java

\- for checking teh classes adn rt enrirment we can use the command - jar -tvf rt.jar

\- for extracting(Unzip) rt environment - jar -xvf rt.jar



\- The name we assgine to method name, class name, variale name is called as - Identifier. An identifier cna newver be a reserved keyword. Can't use special charcaters except \_

\-------------------------------------------------------------------------------------------------------------------------------



Day 6



\- Static belong to ClASS \& Non-Static belongs to Object

\- varibales must be static here because using in the static class.

\- If there is a single line assignment(like defining the variable) then taht is the part of assignment only. Logical part will always within the main method or class

\- Remebr logic will always written withing the main method - its eitherassigning the value or updating the value, its always logical and must be within

Datatypes -



\- In Primitive datatypes, if we are n ot assigning anything then by default the value will be 0.

Checking Default Outputs when  cvalues are not assigned are -



Checling all datatypes's sizes as  -

Size of Default Byte Data is - 0

Size of Default Short Data is - 0

Size of Defaut Int Data is - 0

Size of Default Long Data is - 0

Size of Default Float Data is - 0.0

Size of Default Double Data is - 0.0

Size of Default Char Data is -

Size of Default String Data is - null

Size of Default Boolean Data is - false

&#x09;

\-------------------------------------------------------------------------------------------------------------------------------



Day 7\_18nth March





1\.	Static(Class Specific) Variable – Outside the Method

2\.	Instance (Object) Variable - Outside the Method

3\.	Local Variable – Declared Inside Method/block



\- Static belong to class and common for all the objects, Non-static(Instance) belongs to Object and every instance variable has different value and objects

\- Local Variables belongs to method only. (Main method or any method withing the class)

\- Duplicate varibales are stricktly not allowed in Java.



\- By Deault value of Non-Primitive DataTypes are always null

\- Static, Instance and Local.

Static belongs to class

Instance belongs to object.



when objkect belongs to the class - its an instance,

when its common for all - it's static



\- in static .. primitive have default vbalue as - 0 or 0.00, but when creating local variable within the local method ... it  must be assigned value before usiong ... otherwise throw error , no default value for local declared variables



\-----------------------------------------



&#x20;- always remember whenever taking the input from user using CLA then must be do everything inside main method or use STatic while declaring variable and all



class AdditionSystem

{

&#x09;

&#x09;

&#x09;public static void main(String args\[])

&#x09;{

&#x09;	String first = args\[0];

&#x09;	String second = args\[1];

&#x09;

&#x09;	int firstNumber = Integer.parseInt(first);

&#x09;	int secondNumber = Integer.parseInt(second);









\- when want to use static then -

class AdditionSystem

{

&#x20;   static String first;

&#x20;   static String second;



&#x20;   public static void main(String args\[])

&#x20;   {

&#x20;       first = args\[0];

&#x20;       second = args\[1];



\-------------------------------------------------------------------------------------------------------------------------------



Day 8\_23rd March



Oeprators in Java -



1 - Assignemnt Operator (=)

2 - Relational Operator - (!=) (>=) (<=)

3 - Logical Operator - AND(\&\&), OR (||)



Remember in myjavaversion -

userType.equals("GOLD")

\-------------------------------------------------------------------------------------------------------------------------------



Day 9\_24th March



Way to create method with objects -



1\) method call \& creation without static

public static void main(String args\[])

&#x09;{

&#x09;

&#x09;	CarInfo billing = new CarInfo();// creting object of class CarInfo

&#x09;									//Calling (using it) method

&#x09;

&#x09;	int finalAmount = billing.additionalExpense(10000, 300000);

&#x09;

&#x09;	System.out.println("So, the final amount paid is - "+finalAmount);

&#x09;

&#x09;}

&#x09;

&#x09;int additionalExpense(int insurance, int actualCost)

&#x09;{

&#x09;	int overExpense = actualCost - insurance;

&#x09;	return overExpense;

&#x09;}



\---

2\) using static method call and creation

public static void main(String args\[])

&#x09;	{

&#x09;

&#x09;		int finalAmount = CarInfo.additionalExpense(10000, 300000);

&#x09;

&#x09;		System.out.println("So, the final amount paid is - "+finalAmount);

&#x09;

&#x09;	}

&#x09;

&#x09;	static int additionalExpense(int insurance, int actualCost)

&#x09;	{

&#x09;		int overExpense = actualCost - insurance;

&#x09;		return overExpense;

&#x09;	}



&#x20;- always remember whenever taking the input from user using CLA then must be do everything inside main method or use STatic while declaring variable and all



class AdditionSystem

{

&#x09;

&#x09;

&#x09;public static void main(String args\[])

&#x09;{

&#x09;	String first = args\[0];

&#x09;	String second = args\[1];

&#x09;

&#x09;	int firstNumber = Integer.parseInt(first);

&#x09;	int secondNumber = Integer.parseInt(second);









\- when want to use static then -

class AdditionSystem

{

&#x20;   static String first;

&#x20;   static String second;



&#x20;   public static void main(String args\[])

&#x20;   {

&#x20;       first = args\[0];

&#x20;       second = args\[1];



\-------------------------------------------------------------------------------------------------------------------------------





Day 10\_25th March



Access Modifiers in Java  -



\- I n java for the variale, if not writing anything means its **default**

\- Private var - responsible for using it **within** the class only, can;t be accessed outside the class or by any other class







Package in Java  - Package can be considered as Folder Structures/Directory for organized and correct, unique users and all



\- Every class is a part of some package, if not providing then there is always a **default package**.

\- The naming convention of the package is **reverse** of the company domain wise.

company domain - kodewala.com

Packgae namingconvetion - package com.kodewala



* The first line of java is always responsible for package file declarartion
* within the **same** package if variable is **default** then other class can **access**. When var is **private** then still **can't access** by any **other class** even within the **same package**
* **class is also default until and unless no any access modifier used**
* **If a class is public, then file name MUST match class name**



**-> If the var is default then it can be accessible by other classes within the same package**

**while using different package in new file - make sure to do public to method in the file from where we want access**

**-> But when i changed the package in a new file and trying to accesing the default value from previous file then it's not accessible**





**Same Packge  - Default - Accessible, Private - NOTAccesible**

**Different package - Default - NOTAccessible , Private - NOTAccessible**





Default sope withon -> same package and can be access by any of the class.

Pvt scope within the class



\----



Private -> Visible within the class only, other class can;t use it.

Default -> With in Packages(Variable declared deefault\[Amount] in order Class, this will be avaialble in other class with in same packages only

Protected -> (Default + sub classes(child classes in different packages))

Public -> Anywhere



\-------------------------------------------------------------------------------------------------------------------------------



Day 11\_26th March

