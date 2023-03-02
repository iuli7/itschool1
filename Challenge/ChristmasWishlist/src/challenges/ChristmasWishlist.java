package challenges;
import java.util.ArrayList;
import java.util.List;

public class ChristmasWishlist {
    public static void main(String[] args) {
        List<String> christmasWishlist;
        christmasWishlist = new ArrayList<>();
        christmasWishlist.add("Money");
        christmasWishlist.add("Sweets");
        christmasWishlist.add("Puppy");
        christmasWishlist.add("Socks");
        christmasWishlist.remove("Sweets");
        System.out.println(christmasWishlist);

    }
}