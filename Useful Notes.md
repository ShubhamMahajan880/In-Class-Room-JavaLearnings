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
* Jis method ko accee krna chahte h, to vo method jis class me h uss class ka object bnta he.

In Eclipse -

\-------------------------------------------------------------------------------------------------------------------------------



Day 14\_31st March



Break - Break is used for **exit** from the **loop**. It'll exit just after matching the situation and using break;

Continue - continue is responsible for **skip** the **current situation only**. it'll skip only desired situation and then continue the rest all processes.

return - Return responsible for **exiting** from that **particular method**. Not from the entire class.



Switch CaSe Statements - better than if-else-if. It looks pretty well.

\-------------------------------------------------------------------------------------------------------------------------------



Day 15\_01st April



Constructor \& Object Creation -



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
* String Constant Pool (SCP) - **Inside** the **heap** memory **itself**. where string classs objects stored..
* MetaSpace - anything which is **static** in java loads in **metaSPace**.
* Stack - Local variables/Method  Call/main inside the stack in memory.
* **before java 8** version, Meatspace is called as **PermGen(Permnant Generation)**
* Garbage Collector responsible for remove unwanted objects form the memory.



* String  - A bunch of character is called as String in Java. String is a class in java which will allow us to create String Object.



* Ways to create String Object -



1. Using Literals - String s = "Hello";
2. Using new keyword - String s = new String("Hello");



* **==** will alwasys compare the **memory addresses** of the object. if value same then same addresses assign in SCP, so if equal then say True.
* **.equals** will always compare the **content** inside string.





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



* Concat waali str4ing hmesha heap me jaati h because it created as an Object.
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



* Encapsulation - why it needed ? - **Data(Var) Hiding \& Security**

On declaring a class public, then withing the same package any of the class can access/Set the value.  Encapsualtions allowing classe and methods to set \& get variable data.

* In good practicdes **must** be variable **pvt**, so that **others classes** **cann;t** modify or access it..If declared variable as public means not following the oops CONCEPT
* No we want to modify the class, but we dont want to modify by the variable directly, we'll give **method to modify** - so for this we uses **Setters \& getters Methods**.

\-------------------------------------------------------------------------------------------------------------------------------



Day 24\_15nth April



* So in Encapsulation - Declaring Data(Fields/var/attributes) as **Private** and if someone(other classes) **want to modify/read** data, then they will **use public setter** to modify/set the values and **getter to read/get** the values.
* so if our variable is private then someone can't read or change it directly by a1.balance = 15000; If we or someone wnat to do **any modification** then can be **done by** using **getters \& Setters**.



Inheritance -



* ANy parentclass or Super class will always available for ALL the child classes. Child class dont have freedom/option to choose the proeprties... whatever is parent's class prorperties child have always.. either they want to useor not.

\-------------------------------------------------------------------------------------------------------------------------------



&#x20;Day 25\_16nth April



* Private methods can't be available in the child classed. Make sure to do them **public**.. so they can be accessible and used by outside classes. Other than private everything all methods are variable in Inheritance.



* Types of Inheritances are - 1 - Single Inheritance, 2 - Multilevel Inheritance, 3 - Hierarchical Inheritance and NO MULTIPLE INHERITANCE in JAVA.



\-------------------------------------------------------------------------------------------------------------------------------



&#x20;Day 26\_17nth April



***100% INTERVIEW SPECIFIC***



* Using Inheritance we no need to write the functionalities form scratch we cn drorectly use them if gthey are available in the parent or the object class.
* Method Overriding - When child class want to use his own funcitnality instead of given parent class functionality then can be done by adding some extra informationnor operations by his own and this concept is called as Method Overriding.
* Let say - Parents said Hii , but child wants to say Hello. Then in Parent Class having statement Hii, Child class crated his own statement Hello within the **same method**.
* why overriding - when child dont want to use the given functionality of parent class... child want to add some more features or change something within the same class.
* it's called \& represents as  -

child class IS-A parent classs

Manager IS-A EMployee - which menas here the manager class is child class and having parent class Employee.

* Method Overriding is not possible without Inheritance.

\-------------------------------------------------------------------------------------------------------------------------------



Day 27\_20th April



* @overriding is responsible for checking overridnng is correctly done or not.

Rules for overriding concpets-



1 - Accesss Modifiers should be **Same OR Wider**(Should not reduce the scope);(**ussse bada**) whatever in the parent class, you cannot reduce it in the child class either it sbould same or wider

* if we have method Type is default in the parernt class then for following overridng concepts correctly we also have default in the child class.
* if we have **public** in the **parent class**, then **cannot** have **lesser than** public in the **child class**.
* if we have method type **Default in the parent class** then in **child class can have** wider than default - which are **Public \& Protected**



means when parent/super class public and child class protected -> Not Allowed



Parent Class PUBLIC --> Child Class PROTYECTED === NOT ALLOWED, CAN;T DO IT.



2 - Return Type must be same except **Co-variant**.

* **return type** of method inside parent class and inside child class both should be **same**



3 - Exactly **same** **method names** should be there in both in parent and in child also.  Name of method inside parent and child must be same while following to method overriding.



4 - no. of Args, type of Args, and order of Args must be **same in both**.



5 - Exception - Same or child class.



* Co-variant Return type - returning the whenever  we are overriding the return type can be child of super method return type.



\-------------------------------------------------------------------------------------------------------------------------------



Day 28\_21st April



***100% INTERVIEW SPECIFIC***



Why Multiple Inheritance don;t exists in java -



* A child cannot have more than one parent. A child can;t have 2 parent. otherwise compiler would confuse to which to access.
* It's for avoiding Ambiguity. If there will be both Parent classes then child class would confuse which method have to access.
* when ww override the methid then the child clas inharrited parent functionality andif botht he parent classes having the smae method name then child class badly consufes to whom to access. - and that's why java doens not allow multiple inheritance.
* On observing its structure it looks like DIAMOND and this scenario is called - **DEATH OF DIAMOND** or **DIAMOND PROBLEM** in java.
* so this multiple inheritance functionality doesn't work in java using classes, but using Interfaces we'll able to develop this.



class HybridAccount extends CurrentAccount, SavingAccount // Not allowed Multi Level Inheritance



Method Overloadingg -



* In Method Overriding its only possible when there is Inheritance, while method Overloading can happen within the class only.
* In method Overloading - Multiple versions of the Method cna be present in the same class.



why method Overloading -

* For giving the flexibility to the users. to work with the same method if created already by the usage or need of parameters.



Rules of Method Overloading -



1 - Same Method name;

2 - Different Args, Diff Order of Srgs, Differ Number of Args.

3 - There is not such riles like Overriding ... ant Access Modifier can be used freely, any return can be used easily in Method Overloading Concept.



\-------------------------------------------------------------------------------------------------------------------------------



Day 29\_22nd April



Casting -



general Object Creation Syntax looks like -



&#x09;	GSTInvoice gstInvoice = new GSTInvoice(); // simple object creation

&#x09;// 	Type       RefName    =  Actual Object

&#x09;//  	int 	   amount     =  100;



\---------

* Parent class refers to Child Class Object. Its internally works like -



class InvoiceManagement // parent class

{

}



class GSTInvoice extends InvoiceManagement // child class extended from parent class

{

}



InvoiceManagement invoiceManagement = new GSTInvoice() // this is called as - "auto up casting" OR

InvoiceManagement invoiceManagement = (InvoiceManagement)new GSTInvoice();  // manually doing upskilling  - not required



* when we want Child Class refers to Parent Class, then it'd like -



GSTInvoice gstinvoice2 = (GSTInvoice) new InvoiceManagement(); // this is called - "Down Casting"

\---------



Polymorphism -



Why this overriding concept is called RunTime Polymorphism -



class Delivery {

&#x09;public void doDeliver() {

&#x09;	System.out.println("Delivery.doDeliver()");

&#x09;}

}

class EComDelivery extends Delivery {

&#x09;@Override

&#x09;public void doDeliver() {

&#x09;	System.out.println("EComDelivery.doDelivery()");

&#x09;}

}

public class RuntimePolymorphism {

&#x09;public static void main(String\[] args) {

&#x09;	Delivery del = new EComDelivery(); // parent class can refer child class object (Auto Up Casting)

&#x09;	del.doDeliver();//EComDelivery.doDelivery() - Compile type it check + it call based on actual object.



&#x09;}



}



* Here in the syntax -  Parent class referring to Child class object.

Overrding is here **which** doDeliver() method will execute -



"Delivery del = new EComDelivery();

del.doDeliver();"



Delivery del  - at the time of **compilation** this method (del.doDeliver()) will call in Delivery del this class  (becuase compiler even doen;t know what is object from del.doDeliver() it'd go to the Delivery class(Parent Class) first)- compilation, while

new EComDelivery() - at the **time of running**, it'll call the method from this class (child class)(new EComDelivery()) - in Runtime



* if i **remove** the same method(del.doDeliver()) **from the child class** then Compilation will take place successfully and the run call will be from parent class(because the same method din't find in the child class)



* Here which methd t0 be called that decision is happenning over running - so it's called **Runtime Polymorphism** OR **Dynamic Method Didpatch**.

\-------------------------------------------------------------------------------------------------------------------------------





Day 30\_23rd April



Compile Time Polymorphism -



* which method have to take, this decision will happen at the time of compilation only, this is Method Overlaoding and called as Compiletime Polymorphism
* **Method Overloading is the best example of Compiletime Polymorphism.**





Abstraction -



* Explose something which is require, not anything unnecessary or unessentials
* Abstraction in Java  is Hiding Implementations - SHowing only required and essential information to user rest all backend part is hidden within the functionalities inside classes.
* The main difference between Encapsulation \& Abstraction is; - Encapsulation is responsible for hiding particular data/method, while Abstraction is responsible for hidoing the entire implemetantions. It only shows whatever is rewuired and usefuyl to the users, means other classses will not be able to see your code.



* In Abstraction we provide essential functionalities to called which can expose and necessary for everyone, but in backend there is some internal functionalities which is not useful  for all other classes/users.. so this internal functionalities is hiding by making them private and only visible to respective classs...This is hiding implementation for which Abstraction stands for.





\-------------------------------------------------------------------------------------------------------------------------------



Day 31\_24th April



Revision Day – Reality Check



\-------------------------------------------------------------------------------------------------------------------------------



Day 32\_27th April





Abstract -

responsible for High Level(What we are doing only ........... How we are doing -Not Interested)



* Let say I have Pay Method(), so what inside this only matters, How it;s happening - doesn't matter.
* when ww are forcing to child class to implement the method which is within parent class.
* Here we are overrding the methods in the child class using abstract class \& method.
* Abstract class is responsible to force other class for implementing abstract method (within the abstract class) - that you must have to implement this abstract(pay) method.
* When we wnat that **parent class methods** **must be implemented for the child class we use abstract**(saaar/bhaav/overall uddeshy) method. We want to force to child classes to include the parent class method.
* **RBI(Parent Class) announced KYC(Method) is mandatory for all the banks(Child Classes).**
* If we proceed **without abstract** keyword for method, then it **becomes optional** - now parent is not forcing to childs to implement that method. Without ABSTRACT keyword Now it's become optional to child class, it depends on they either they implement the rule or not.
* Its kind of Contract - if you are working for me you must have to follow my orders.
* If even **after declaring abstract** methid inside abstract class and **child classes** arenot implementing or **not following** the rules mean the **system** has been **failed**.
* Inside Abstract Class ,while declaring Abstract Method, then it should **not contain** the **body** .. it must be **only declared as abstract** with method name inside abstract class.



abstract class BusBookingApplication {

&#x09;public abstract void offerPrices();// // abstract method - don't initialize the body, just declare the method.

}



* child class must have to follow the abstract declared method -

class RedBus extends BusBookingApplication {

&#x09;@Override

&#x09;public void offerPrices() {

&#x09;	System.out.println("It's officially announced by govt.. we must have to follow");

&#x09;}

}



* So from now  ... if we want must having following features in child class then start making parent class as abstract
* We were defining both - What ? \& How? (Parent class method declaration,initializtions \& child class also ) this known as **CONCRETE METHOD. When** **What** ? is **defined** and **how** is **not defined** - this is **ABSTRACT METHOD**.
* In Abstract - Parent class be like here "Hmara Kaam h niyam banana, Kya krna he Kese krna h your responsibility we are Higher Authorities at Higher Level " , and child class be like - "Jo bhi krna h hme hi krna h, Authorities (unhone) to rules bana diyye";



* **Abstract class** can **have both**  - **(Abstract) + (Non-Abstract** - Method with body). Till now we used Concrete Methods to define the What \& How both. Means What \& How combined together. (Method \& Method Body). Make sure Abstract Method must bt implemented by child classes .
* **Concerete Methods** are Normal Method - if you want to override then can be ... but the Abstract method having both(Abstract(Only method declared, How **NOT**) + Non Abstract Methods(method declared,initliazed - **What Part**)) and **abstract must be initialized by child**(HOW PART)



* we **cannot create the OBJETC of ABSTRACT CLASS**, becuase class itself is **not fully completed**, **not having full funcitonalities**(In Abstract method, no body).
* Abstract CLass Cannot be **Create or Cannot be Instanciated**. Java does not allow for this - can;t create the object of Abstract class becuase class itself is **INCOMPLETE. Abstract class ia like a blueprint for the child classes,**
* Abstract class will **have constructor**.



\-------------------------------------------------------------------------------------------------------------------------------





Day 33\_28th April



Interface in Java -



* Whenever we want **100% contract** mean whatever we **write/set** **must be implemented** by all the classes. Then Interface is used for this.
* Every method/functionality whatever created is must be used by all the child classes or rest of classes, as interface declared.
* In **Abstract** there can be **both** - **Abstract + Non-Abstract methods**, **but** in **Interface** there **must be 100% abstract for all**.



We are discussing for Interface **before Java 8** -



* Usually in industry while declaring interface, in Interface name uses INameOfTheInterface (IBanking)	.
* In Inetrface there is **only What** Part.., **No How Part** exists. // Just method declaration, not the initialization of it.
* After declaring Interface, we can directly write the method name \& Interface , **By default** **all** the **methods** are **always Public \& Abstract** in Interface.
* Why Interface - to **force** to all rest classes, to avoid the conflicts related like - Method name and all, one clear set of rule which is applicable everywhere.
* All the Overriding rules will be applicable.



we've done -

In **concrete** class - **(What + How)** \[Method Declaration + Initializn  compulsory]

In **Abstract** class - **What/ (What + How)** \[Abstract + Non-Abstract Class - Method Declaration for Abstract \& Methoddeclan as well as Initln for Non-Abstract]

Now In **Interface** - **What(100%)** \[Abstract only - Method Declaration only]



\-------------------------------------------------------------------------------------------------------------------------------





Day 34\_29th April



Problem with Java Interface before 8 and fixing in version 8-



* when we create an Interface, that means all the rest classes must follow the all the rules. But what when **along with the development** or **as per the timelines**  **new features** appears and want to add inside that, then on adding that particular feature **it'd be add** in the **entire system** as per the interface rule for **100% force** and implementations by all the classes... so here we want to **add particular functionality** and want to **give option to all classes** who want to use this function or not.



* By giving to use or create particular functionality(new class) **no need to changes** in the **entire interface**. By using **Default method** we can give facility to the classes whether they want to implement this new functionality or not , rest all created classes/methods will definitely followed by entire system or all the classes as per interface rule but along with that compulsory method/functionalities here is **an option for adding this new functionality inside class by overriding it**. Ex.  - Payment application, then after 2015 new option of PassbookPrint - but it's optional those who can afford it can add it by overriding and inside default method, need to make compulsory for all the classes.



* using this default method functionality saari classes ko compulsory modify nhi krna pdhega, only that classes can modify which have requirements..**no forcing or 100% contract** as happens in interface usually.



* SO **features** added in **java 8** are - use of **default method**, and achieving **Backward Compatibility**. We have the option to override we can change, if already created interface with instances method is fixed then for optional particular functionality we can override and use default.



\-------------------------------------------------------------------------------------------------------------------------------



Day 35\_30th April



***101% interview focused***



Another one functionality introduced in Java 8 -





* what if inside each class we have to perform compulsory functionality from respective child classs. (For every ecommerce platform like Amazon, FLipkart they need to send heir own invoice - so al the child classes will be right there code and same code for all but individually written)



* So to avoid this issue - to **avoid this code duplicasy** and **common functionality**, suggested to use **static method in interface**. By declaring method **static** , we can use optinaly in any of the child class.  Adding the static removes the code deplicasy from the classes and saves - time,space,trsut,memory and everyuthing as well as provides reuability.



* So, in **Java 8, two functionalities** introduces - **1st** is **Default**, responsible for **Backward Compatibility**, and **2nd** is **Static** for **achieving code common utility functionality**.





Problesm with this Interface(Java 8) and fixing it in Java 9 -



Within interface even after using default ot static methods, there is again code duplicasy issues. Inside Invoise send (functionality) static method there is again in built codes for -

(Connect to Server (50 lines of code)--> init print --> write to file --> send to customer(25)). Let say requirement like send the invoice again - now ther eis again need to impleemnt the code.



&#x09;public static void printInvoicePDF() // common Utility functionality - those who want they can

&#x09;{

&#x09;	// 200 lines of code

&#x09;	//(Connect to Server (50 lines of code)--> init print --> write to file --> send to customer(25))



&#x09;}



&#x09;public static void sendNotification()

&#x09;{

&#x09;	//(Connect to Server (50 lines of code) --> Draft Email --> send to Customer(25)

&#x09;}





* &#x09;private static connectServer() // its not allowed with java 8 or 1.8, can;t declare private method inside interface's functionalities

&#x09;{



&#x09;}





**by changing the version - Java 9 or 1.9 -**





&#x09;	public static void printInvoicePDF()

&#x09;{

&#x09;	connectServer();

&#x09;	notifyCustomer();

&#x09;

&#x09;}



&#x09;public static void sendNotification()

&#x09;{

&#x09;	connectServer();

&#x09;	notifyCustomer();

&#x09;}



&#x09;private static void connectServer() // from java 1.9 or 9 we can declare private to the methods. So here veriosn changes to java 9 and declared private successfully.

&#x09;{



&#x09;}



&#x09;private static void notifyCustomer() // from java 1.9 or 9 we can declare private to the methods. So here veriosn changes to java 9 and declared private successfully.

&#x09;{



&#x09;}

* Private method can be both Static as well as Non Static. when need to use in static prvate methids then use as static and when without static .. like inside fdefault methods(default can also have some innternal funcitonalities) then can be used as Non-Static.



\-------------------------------------------------------------------------------------------------------------------------------



Day 36\_04th MAY



Can we Solve Multiple Inheritance problem by Inheritance - 



* Yes, because in Interface(In java 7 or before Java 8), there is no method body only method declaration(What part)(abstract method), so child class won't confuse and call the same method from any of the parent.
* Implementing Multiple Inheritance using Interfaces - right now using Interface, able to performing multiple Inheritance untill methods are only abstract(Only What) and not initalized(How)");



* But this kind of implementation of Multiple Inheritance was only valid befor java 8 version, becuase from java 8 - we used to create Default Methods also, so here the method's body exists(How Part/method initialization). So for it while overriding the same method from the main class/child class then can use .super method and clearify which parent's method want to implement. 



Syntax - NAMEOFINTERFACE.super.NAMEOFMETHOD



@Override

public void methodName()

{

&#x20; PARENT1.super.methodName();

&#x20; PARENT2.super.methodName();

}





Types of Interface - There 4 types of Interfaces -



1 - Normal Interface --> Used so far, simple Inheritance and all similar stuff

2 - Marker Interface --> Empty Interface - Interface w/o any method .

3 - Functional Interface 

4 - Nested Interface - Not much used in Industry





Cloning in Java - Can clone Java Objects.



* When i want to create another one's object with the same value. So instead of crreating differetn differet object again and again, i'll use **clone method**.
* clone() is an in built method in object class. 
* anyone can't clone directly, need to give the permission that particular object is cloneable or not. (Aadhar, Xerox Example). 
* For this inbuild and hidden cloning permission in java we use Marker Interface.
* In Java, there are many Inbuilt Marker Interface, one is - Cloneable Interface
* By implementing cloneable Interface, the class is giving permission to its object and allow for cloning. If not implementing the cloning interface then it won't allow to clone object and giving error.
* Cloning is a risky activity.. it should only implement when we really want to allow objects to clone(or make a copy of same person/name/string in a different object)
* Cloning is a kind of special activity or allows special control.
* So, in java when we want to perform any special activity or control to special activity, then need to use Marker Interface to giving the permissions. 
* If we want to check to any object that it is of what type use instanceof operator. (what is instance of object/kis type ka object he - cloneable or something). If the class is implementing ang interface means the class is that type of interface. 
* Serialization is another kind of critical activity we are not allowed to perform and uses Serializable Interface



\-------------------------------------------------------------------------------------------------------------------------------















































&#x09;

