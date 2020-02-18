package java8;

public class ScienceBook {
	float offer;
	String author;
	public ScienceBook(float offer, String author) {
		super();
		this.offer = offer;
		this.author = author;
	}
	
	public static void main(String[] args) {
		ScienceBook book=new ScienceBook(0.4f, "Akshat Jain");
		Book book2=new Book(45656, "BIOLOGY",65468) {
			@Override
			float actualCost() {
				return super.actualCost()-super.actualCost()*book.offer;
			}
			
			@Override
			void bookInfo() {
				super.bookInfo();
				System.out.println("Author is "+book.author);
				System.out.println("Offer is "+book.offer);
				
			}
		};
		book2.bookInfo();
	}

}
