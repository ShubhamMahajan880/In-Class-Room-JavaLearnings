
public class MethodOverloadingNextExample {

	public void booksCollection(String bookName, String bookType) {
		System.out.println("Book Name is  - "+ bookName);
		System.out.println("Book's Type is  - "+ bookType);
	}

	public void booksCollection(int bookPrice, String bookPublicaiton)
	{
		System.out.println("Book's Price is  - "+ bookPrice);
		System.out.println("Book's Publication is  - "+ bookPublicaiton);
	}

	public void booksCollection(int bookPages, String bookAuthor, String bookType ,String bookPublicaiton)
	{
		System.out.println("Total Book's Pages is  - "+ bookPages);
		System.out.println("Book's Author is  - "+ bookAuthor);
		System.out.println("Book's Type is  - "+ bookType);
		System.out.println("Book's Publicaiton  is  - "+ bookPublicaiton);
	}
	public void booksCollection(int bookPrice,String bookName, String bookType ,String bookPublicaiton, String bookAuthor)
	{
		System.out.println("Book's Price is  - "+ bookPrice);
		System.out.println("Book Name is  - "+ bookName);
		System.out.println("Book's Type is  - "+ bookType);
		System.out.println("Book's Publicaiton  is  - "+ bookPublicaiton);
		System.out.println("Book's Author is  - "+ bookAuthor);

	}

	public void booksCollection(int bookPrice,String bookName, String bookType ,String bookPublicaiton, String bookAuthor, int bookPages)
	{
		System.out.println("Book's Price is  - "+ bookPrice);
		System.out.println("Book Name is  - "+ bookName);
		System.out.println("Book's Type is  - "+ bookType);
		System.out.println("Book's Publicaiton  is  - "+ bookPublicaiton);
		System.out.println("Book's Author is  - "+ bookAuthor);
		System.out.println("Total Book's Pages is  - "+ bookPages);
	}


	public static void main(String[] args) {
		System.out.println("Compile TIme Polymor[phism best example is Method Overloading");

	}
}


