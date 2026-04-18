Notes -

Day 1:



0\) Standard Syntax or Source code will always given as -



class HelloWorld

{



&#x09;public static void main(String args\[])

&#x09;{

&#x09;	System.out.println("Hii, Everyone");

&#x09;}



}

\- In the naming convention first letter must b capital of class name, if 2 words then both should be capital



1\) For compilation always use the command in the same directory -

\- Javac is the compiler responsible for compiling the file. We are asking for compilation by using javac

\- javac saying compile and check this file with .java

&#x09;

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

* static won;t work for args\[0]

Correct syntax -



class UnderstandingOR

{

&#x20;   static String packageCracked;

&#x20;   static String companyType;



&#x20;   public static void main(String args\[])

&#x20;   {

&#x20;       packageCracked = args\[0];

&#x20;       companyType = args\[1];





OR



public static void main(String args\[])

&#x09;	{

&#x09;

&#x09;		String packageCracked = args\[0];

&#x09;		System.out.println("Please enter the amount - "+packageCracked);

&#x09;		String companyType = args\[1];

&#x09;		int finalCTC = Integer.parseInt(packageCracked);

&#x09;		int minCTC = 15;



\------------

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



**Object can access ONLY its own class methods (and inherited ones)**

**👉 Object hamesha us class ka banta hai jiska method/variable use karna hai**



* kisi class ki koi method **default(no public/no private )** h to us **class me accessible he**, and **same package** me **dusri class**(file) me bhi **accessible he**
* leking jb us method ko **private** kr diya to.. us **class me** to **pure me accessible** h pr **dusri class**(file) me **accessible nhi** he bheale hi same package he
* when in **different package** - if method is **default or private Not acceesible** by different package and can be **only accessibe** in different package when **method declared as public**.

\-------------------------------------------------------------------------------------------------------------------------------



Day 11\_26th March



Conditional Statements(IF Else and If else if then else)



* When we declare method as static and don;t create the object to accessin the method from main method-

class UnderstandingControlFlow

{

&#x09;

&#x09;public static void main(String args\[])

&#x09;{

&#x09;	String packageCracked = args\[0];

&#x09;	System.out.println("Please enter the annual CTC - ");

&#x09;	int totalCompensation = Integer.parseInt(packageCracked);

&#x09;	UnderstandingControlFlow.classFlow(totalCompensation);

&#x09;

&#x09;}

&#x09;

&#x09;static void classFlow(int CTC)

&#x09;{

&#x09;	if(CTC>=15)

&#x09;	{

&#x09;		System.out.println("Great Start, Doing well, Enjoy the Jawani");

&#x09;	}

&#x09;	else

&#x09;	{

&#x09;		System.out.println("Need to do motre Hardwork for goals");

&#x09;	}

&#x09;

&#x09;

&#x09;}

&#x09;

}

\-------------------------

* When we access via object creation(from main method) as created particular method is non static



class UnderstandingControlFlow

{

&#x09;

&#x09;public static void main(String args\[])

&#x09;{

&#x09;	String packageCracked = args\[0];

&#x09;	System.out.println("Please enter the annual CTC - ");

&#x09;	int totalCompensation = Integer.parseInt(packageCracked);

&#x09;

&#x09;	UnderstandingControlFlow valAdded = new UnderstandingControlFlow();

&#x09;	valAdded.classFlow(totalCompensation);

&#x09;

&#x09;}

&#x09;

&#x09;public void classFlow(int CTC)

&#x09;{

&#x09;	if(CTC>=15)

&#x09;	{

&#x09;		System.out.println("Great Start, Doing well, Enjoy the Jawani");

&#x09;	}

&#x09;	else

&#x09;	{

&#x09;		System.out.println("Need to do motre Hardwork for goals");

&#x09;	}

&#x09;

&#x09;

&#x09;}

&#x09;

}

\-------------------------------------------------------------------------------------------------------------------------------



Day 12\_27th March



In Package -

When we want to execte in terms of package, then use . in the same was as the compilation



* FOr Compilation -

E:\\51 \_Shagun\\Java This Side\\In Class Room\\Day 12\_27th March>javac com/kodewala/3\_ScannerClasssIntro.java (Packedirectory/className)



* For Execution -

E:\\51 \_Shagun\\Java This Side\\In Class Room\\Day 12\_27th March>java com.kodewala.Message ((Packedirectory.className))



\----

Scanner class syntax -



Scanner scanner = new Scanner(System.in);

System.out.println("Please metion the name - ");

&#x09;

&#x09;	String name = scanner.next();

&#x09;	System.out.println("So, you entred - "+name);

&#x09;

&#x09;	scanner.close();

* System.in is responsible for establishing conection with console
* scanner.next() - is responsible for the next input in console. here scanner is object of Scanner classs.
* scanner.close(); - for closing the connection after taking all inputes.



* java.lang.\* package is responsible for all the packages(String, System and all inbnuilt). It's imlicitily internally implemented by compiler. \* - indicates all files in it

\_ All imports, All Packages are always begin before the class initialization.

&#x20;

\---

Loops -

* To perform the same task again \& again
* **For** loop is suitable when the input size is **fixed/static**. (let say length - 1 to 10, so 10 is fixed not go on  11)
* When i/p size is - **dynamic** - comes to **while** loop
* do while - it'll always ezxecute once no matter true or false.



\-------------------------------------------------------------------------------------------------------------------------------



Day 13\_30th March



* Kabhi bhi mehtod ka object nhi bnata hamesha class ka =object bnta he... and vo class ka object methods ko access krta he

In Eclipse -

\-------------------------------------------------------------------------------------------------------------------------------



Day 14\_31st March



Break - Break is used for **exit** from the **loop**. It'll exit just after matching the situation and using break;

Continue - continue is responsible for **skip** the **current situation only**. it'll skip only desired situation and then continue the rest all processes.

return - Return responsible for **exiting** from that **particular method**. Not from the entire class.



Switch CaSe Statements - better than if-else-if. It looks pretty well.

\-------------------------------------------------------------------------------------------------------------------------------



Day 15\_01st April



Object Creation -



* must remember - if the class consist main method and its public then definitely use **SAME** Class Name \& File Name.

\-------------------------------------------------------------------------------------------------------------------------------



Day 16\_02nd April



* Default constructor is always available in compiler until no constructor created.
* when multiple Constructors in the class then it'd be used based on the **no. of arguements as per constructors**.
* we **cannot** have more than **1** constructor with same no. of arguements and same datatypes.. it'll only consider to one(firstone)
* and this concept is called as - **Constructor Overloading.**
* Inheritance - Parents properties are available in the Child Class.
* Extend - is responsible keyword to **achieve inheritance** in java.

its like extending a parent class to  a class

class Order

{

&#x09;

}



public class SuperClassUnderstanding extends Order

{

&#x09;public static void main(String\[] args) {

&#x09;

&#x09;}

}

* In java, **Object class** - is the **parent** of all the classes implicitely. no need to use extend for object class, its **internnaly with every class**.

its Like -

class Order extends Object

{

&#x09;

}

* If any class have no parents then bby compiler having **Object class as parent**.

class Order DEFAULT PARENT Object CLASS

{

&#x09;

}

* for accessing the property of parent class - we need to **create the object of parent class also** first, to access via child classs.
* **first line** of **constructor** is either **super or this**. If not writing then **by default** it's **super**.
* **object** class having only one constructor which is with **no args**.
* First line of Constructor is either Super() OR This().
* Super() is **default** with **No args** and **implicitely implemented**.
* Super() will always call to super class constructor.
* for accessing the properties of parent or grandparent need to initialize to them also first - can be done by using super or child;
* uses this for the same constructor withnn class.
* Either super() would be sued or this() will be. COnstructor cannt do for both ata time.
* super() wil lalways call to super class constructor, while this() will always call to this class constructor of same class.

\-------------------------------------------------------------------------------------------------------------------------------



Day 17\_03rd April



* using this class performing constructor's work and overloading  concept

\-------------------------------------------------------------------------------------------------------------------------------



Day 18\_07th April



* Array in Java.

\-------------------------------------------------------------------------------------------------------------------------------



Day 19\_08th April



Blocks in Java - **100% Interview Specific**



1. IIB - Instance Init Block
2. SIB - Static Init Block



Static means - only once

Instance menas - for object.



* SIB  - initialized just after loading class in memory
* SIB will always execute first **(FOREVER)**, then main and then other things.
* Without Main method we can print - using static
* SIB Executed just after loaded the class.
* IIB loaded as the object created
* Remeber 1st) Line if Cosntructor always calls to super() OR this(), while 2nd) line always calls to IIB (Init Block)
* For every object creation, IIB will get executed. Jitne objects bneneg utni baar phle Init Block IIB aayga/print hoga
* Static will be outsde the main method and inside the public class(which having similar name as file nme)
* jitne **Init Block** bnayange **phle saare** vo **execute** hinge **then constructor** similarlly **befire next constructor's message again all Init's will execute first**. So, Jitne Initi Bnayenge utne saare phle execute honge phi hi constrcutor pr aayaga. Jitni baar object bnega  bnega itni baar saare Initis call hoge.





\-------------------------------------------------------------------------------------------------------------------------------



Day 20\_09th April



* Heap - In object in Java Store in **Heap**.
* String Constant Pool (SCP) - Inside the heap memory itself. where string classs objects stored..
* MetaSpace - anything which is static in java loads in metaSPace.
* Stack - Local variables/Method  Call/main inside the stack in memory.
* before java 8 version, Meatspace is called as PermGen(Permnant Generation)
* Garbage Collector responsible for remove unwanted obnjects form the memory.



* String  - A bunch of character is called as String in Java. String is a classs in java which will allow us to create String Object.



* Ways to create String Object -



1. Using Literals - String s = "Hello";
2. Using new keyword - String s = new String("Hello");



* == will alwasys compare the memory addresses of the object. if value same then sdame addresses assign in SCP, so if equal then say True.
* .equals will always compare the content inside string.





* String s = "Hello"; //SCP - Luterall always in SCP memory - 1 object created
* String s = new String("Hello"); // SCP + Heap. For new keywrods - its in HEAP Memory and for Literral its in SCP. - 2 object created. So Total 3 Objects of last 2 syntax.

&#x09;	String s1 = "Pune";//in SCP

&#x09;	String s2 = "Pune"; // 1 object created - not created new already in SCP



&#x09;	System.out.println(s1 == s2);//true - comparing by object address. On that Object addrsses references are same.



&#x09;	String s3 = "Amdavad"; // in S3 - SCP

&#x09;	String s4 = new String("Amdavad");// in S3 \& S4 - 2 object created - in SCP + Heap

&#x09;	String s5 = new String("Surat"); // in S3 \& S5 - 3 objects created, SCP + (SCP + Heap)





&#x09;	System.out.println(s3 == s4);//False

&#x09;	System.out.println(s3.equals(s4)); //True // comparing by content inside String

&#x09;	System.out.println(s3.equals(s5));//False





\-------------------------------------------------------------------------------------------------------------------------------



Day 21\_10th April



* If i am addig 2 strings by creating a 3rd string then that 3rdstring wwill be the in HEAP.
* But when i am adding any 2 strings withing the ""+"" by creating a 3rd new string then this will be store in SCP.





String s10 = "Bangalore";

String s11 = "India";

String s12 = s10 + s11;

System.out.println(s12); // BangaloreIndia - s12 will be created in heap





String s13 = "BangaloreIndia";

System.out.println(s12 == s13);// false because s13 is litteral and in SCP, while s12 is in Heap and as a

&#x09;

String s14 = "Bangalore" + "India";

// compile Time Optimization , only single object will be created which is Liternal and in SCP. If we add 2 different strings by creating a 3rd string then that 3rd string will be as an object and in HEAP, but when we add all strings using ""+"" by creating a new String the its not objects, its a literal and in SCP.



\-------------------------------------------------------------------------------------------------------------------------------



Day 22\_13nth April



* When we create an string like String s1 = new  String("name") - then it created in HEAP as well as in SCP also ... but in somecases String only created in SCP like String s2 = "FatherName", and when we add two strings like String s3 = s1 + s2; then then goes into HEAP, now we want to make a copy of this only HEAP string into SCP - then we use the Intern Method()
* when we adding 2 strings like String s1 = "Microsoft" + " Bangalore"; then it's in SCP not an issue but when add like String s3 = s1 + s2; then then goes into HEAP and foe using this HEAP also in SCP we used intern() method.
* intern method is uses for creating a copy of HEAP object into SCP.
* by using final keyword the respective class can't be parent class if any class.

&#x09;	/\*

&#x09;	 \* final class Accounting {

&#x09;	 \*

&#x09;	 \* }

&#x09;	 \*

&#x09;	 \* public class FinalClassUnderstanding extends Accounting

&#x09;	 \*

&#x09;	 \*  Cant do this operation because of final. cant be parent ever

&#x09;	 \*/

* For modifying string on using concat it'll create a new object in the memory and then perform modification, its not feasible for 100's of objects, so for memory and space management we uses concepts of StringBuffer \& StringBuilder which uses append method and do modification at the place in the string.
* concatinaitn of 2 strings always work by assigning in the same object.

s1.concat("is a skill"); // not working

s1 = s1.concat("is a skill"); // Working



* For avoiding this much procrsses of assigning by crating object internally in the meory and then modifying takes lots of space ad memory .. so by using append methos in StringBufffer \& StringBuilder.



\-------------------------------------------------------------------------------------------------------------------------------



Day 23\_14nth April





OOPs in java  -



Why Oops ?

Features of OOps?



1 - No one cared about your output everyone cares for your outcome.



* Encapsulation - why it needed ? - Data(Var) Hiding \& Security

On declaring a class public, then withing the same package any of the class can access/Set the value.  Encapsualtions allowing classe and methods to set \& get variable data.

* In good practicdes must be variable pvt, so that other cases cann;t modify or access it..If ceclard variable as public means not following the oops CONCEPT
* No we want to modify the class, but we dont want to modify by the variable directly, we'll give method to modify - so for this we uses Setters \& getters Methods.

\-------------------------------------------------------------------------------------------------------------------------------



Day 24\_15nth April



* So in Encapsulation - Declaring Data(Fields/var/attributes) as **Private** and if someone(other classes) **want to modify/read** data, then they will **use public setter** to modify/set the values and **getter to read/get** the values.
* so if our variable is private then someone can't read or change it directly by a1.balance = 15000; If we or someone wnat to do any modification then can be done by using getters \& Setters.



Inheritance -



* ANy parentclass or Super class will always available for ALL the child classes. Child class dont have freedom/option to choose the proeprties... whatever is parent's class prorperties child have always.. either they want to useor not.

\-------------------------------------------------------------------------------------------------------------------------------



&#x20;Day 25\_16nth April



* Private methods can't be available in the child classed. Make sure to do them public.. so they can be accessible and used by outside classes. Other than private everything all methidss are avaibale in Inheritance.



* Types of Inheritances are - 1 - Single Inheritance, 2 - Multilevel Inheritance, 3 - Hierarchical Inheritance and NO MULTIPLE INHERITANCE in JAVA.



\-------------------------------------------------------------------------------------------------------------------------------



&#x20;Day 26\_17nth April



***100% INTERVIEW SPECIFIC***



* Using Inheritance we no neefd towriote the functionalities form scratch we cn drorectly use them if gthey are available in the parent or the object class.
* Method Overriding - When child class want to use his own funcitnality instead of given parent class functionality then can be done by adding some extra informationnor operations by his own and this concept is called as Method Overriding.
* Let say - Parents said Hii , but child wants to say Hello. Then in Parent Class having statement Hii, Child class crated his own statement Hello within the **same method**.
* why overriding - when child dont want to use the given functionality of parent class... child want to add some more features or change something within the same class.
* it's called \& represents as  -

child class IS-A parent classs

Manager IS-A EMployee - which menas here the manager class is child class and having parent class Employee.

* Method Overriding is not possible without Inheritance.

\-------------------------------------------------------------------------------------------------------------------------------

