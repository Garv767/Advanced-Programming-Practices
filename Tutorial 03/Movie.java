class Movie {
    String title;
    String genre;
    double rating;

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", 8.8);
        movie1.displayDetails();
    }
}