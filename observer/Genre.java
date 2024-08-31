package observer;

public enum Genre {
   FICTION("Fiction"),
   SCIENCE_FICTION("Science Fiction"),
   MYSTERY("Mystery"),
   THRILLER("Thriller"),
   NON_FICTION("Non Fiction"),
   HISTORICAL_FICTION("Historical Fiction"),
   ROMANCE("Romance");

   public final String label;
   
   private Genre(String label) {
      this.label = label;
   }
}
