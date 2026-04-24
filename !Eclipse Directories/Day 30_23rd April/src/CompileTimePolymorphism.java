
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		MethodOverloadingNextExample mO = new MethodOverloadingNextExample();
		mO.booksCollection("badle Apni Sock o badlega Jeevan", "Spiritual"); // which method have to take, this decision will happen at the time of compilation only, this is Method Overlaoding and called as Compiletime Polymorphism
		System.out.println("------------->");
		mO.booksCollection(450, "Think Rich India Pvt Ltd");
		System.out.println("------------->");
		mO.booksCollection(120, "Coach BSR", "Sprituality", "Think Rich India Pvt Ltd");
		System.out.println("------------->");
		mO.booksCollection(450, "badle Apni Sock o badlega Jeevan", "Think Rich India Pvt Ltd", "Think Rich India Pvt Ltd", "Coach BSR");
		System.out.println("------------->");
		mO.booksCollection(450, "badle Apni Sock o badlega Jeevan", "Think Rich India Pvt Ltd", "Think Rich India Pvt Ltd", "Coach BSR", 120);
		System.out.println("------------->");
	}
}

//Book Name is  - badle Apni Sock o badlega Jeevan
//Book's Type is  - Spiritual
//------------->
//Book's Price is  - 450
//Book's Publication is  - Think Rich India Pvt Ltd
//------------->
//Total Book's Pages is  - 120
//Book's Author is  - Coach BSR
//Book's Type is  - Sprituality
//Book's Publicaiton  is  - Think Rich India Pvt Ltd
//------------->
//Book's Price is  - 450
//Book Name is  - badle Apni Sock o badlega Jeevan
//Book's Type is  - Think Rich India Pvt Ltd
//Book's Publicaiton  is  - Think Rich India Pvt Ltd
//Book's Author is  - Coach BSR
//------------->
//Book's Price is  - 450
//Book Name is  - badle Apni Sock o badlega Jeevan
//Book's Type is  - Think Rich India Pvt Ltd
//Book's Publicaiton  is  - Think Rich India Pvt Ltd
//Book's Author is  - Coach BSR
//Total Book's Pages is  - 120
//------------->

