import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("What is the number of books: ");
        int numOfBooks = sc.nextInt();
        Book[] books = new Book[numOfBooks];
        double dailyIncome = 0;
        for (int i = 0; i < books.length; i++) {
            sc.nextLine();
            System.out.println("Enter Book's Title: ");
            String bookTitle = sc.nextLine();

            System.out.println("\nEnter Book's Purchase Cost: ");
            int purchasesCost = sc.nextInt();

            System.out.println("Enter book's type (C for Children, M for Motivational and B for Biographies ): ");
            char bookType = sc.next().toLowerCase().charAt(0);

            switch (bookType) {
                case 'c':
                    books[i] = new Children(bookTitle,purchasesCost);
                    dailyIncome+= books[i].getPurchasesCost();
                    break;
                case 'm':
                    books[i] = new Motivational(bookTitle,purchasesCost);
                    dailyIncome+= books[i].getPurchasesCost();

                    break;
                
                case 'b':
                    books[i] = new Biographies(bookTitle,purchasesCost);
                    dailyIncome+= books[i].getPurchasesCost();

                    break;
                default:
                    break;
            }
        }
        printBooks(books);
        System.out.println("The total daily income is: "+ dailyIncome);
        

    }
    public static void printBooks(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
