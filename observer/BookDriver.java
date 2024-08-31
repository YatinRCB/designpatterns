package observer;

import java.util.List;

/**
 * Runs our Best Seller Book Program
 */
public class BookDriver {
    
    /**
     * Creates the Best Seller, and the Store and Client
     * Then displays the top 5 best sellers, and the 
     * Clients wishlist
     */
    public void run() {
        BestSellers bestSellers = new BestSellers();
        Observer Store = new Store(bestSellers);
        Observer fanReads = new FanReads(bestSellers, "Amy", "Smith");

        bestSellers.addBook("The Edge", Genre.THRILLER, "David", "Baldacci", "he 6:20 Man is back, dropped by his handlers into a small coastal town in Maine to solve the murder of a CIA agent who knew America’s dirtiest secrets—can Travis Devine uncover the truth before his time runs out?");
        bestSellers.addBook("The Southern Killer", Genre.MYSTERY, "Peter", "O'Mahoney", "When criminal defense attorney Joe Hennessy uncovers information about his son's unsolved murder, he must fight against the system to expose the truth…");
        bestSellers.addBook("The Family Across The Street", Genre.THRILLER, "Nicole", "Trope", "Sometimes, the most perfect families are hiding the most terrible secrets. How well do you know the people next door…?");
        bestSellers.addBook("Shadow's Force", Genre.MYSTERY, "Lori", "Rhodes", "Which is more dangerous...Mother or Human Nature?");
        bestSellers.addBook("Where the Forest Meets the Stars", Genre.THRILLER, "Glendy", "Vanderah", "In this gorgeously stunning debut, a mysterious child teaches two strangers how to love and trust again.");
        bestSellers.addBook("The House at the End of the World", Genre.MYSTERY,"Dean", "Koontz", "Soon no one on Earth will have a place to hide in this novel about fears known and unknown by #1 New York Times bestselling master of suspense Dean Koontz.");
        bestSellers.addBook("Don't Let Her Stay",Genre.THRILLER, "Nicola", "Sanders", "It seemed only five minutes ago that Richard went to the station to pick up Chloe, and now they were here. I was so excited. Finally, I would meet my stepdaughter for the first time, and Chloe would meet her baby sister Evie.");
        bestSellers.addBook("The Savior's Sister", Genre.HISTORICAL_FICTION, "Jenna", "Moreci", "Leila Tūs Salvatíraas, Savior of Thessen and magical Queen of Her realm, is worshiped by all. Except Her father. He wants Her dead.");
        bestSellers.addBook("The Second Husband", Genre.THRILLER, "Kate", "White","A woman’s seemingly perfect second marriage is rocked by a discovery about the death of her first husband in this twisty psychological thriller");
        bestSellers.addBook("Evidence of the Old World", Genre.HISTORICAL_FICTION, "David", "Edward", "This book doesn't merely challenge historical understanding; it compels readers to think critically, to question deeply entrenched beliefs, and to engage in the reevaluation of a history long considered settled.");
        
        System.out.println("\n**** Our Stores BestSeller List *****");
        displayStoreBooks((Store)Store);

        System.out.println("\n***** Favorite Thrillers *****");
        displayFanReads(Genre.THRILLER, (FanReads)fanReads);

        System.out.println("\n***** Favorite Mysteries *****");
        displayFanReads(Genre.MYSTERY, (FanReads)fanReads);

        System.out.println("\n***** Favorite Historical Fiction's *****");
        displayFanReads(Genre.HISTORICAL_FICTION, (FanReads)fanReads);

    }

    private void displayFanReads(Genre genre, FanReads fanReads) {
        List<Book> books = fanReads.getRecommendations(genre);
        displayBooks(books);
    }

    private void displayStoreBooks(Store store) {
        List<Book> books = store.getBestSellers();
        displayBooks(books);
    }

    private void displayBooks(List<Book> books){
        books.forEach(book -> System.out.println(book));
    }


    public static void main(String[] args){
        BookDriver driver = new BookDriver();
        driver.run();
    }
}
