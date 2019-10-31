import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] meat = new String[]{"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "none", "all"};
        String[] beans = new String[]{"pinto", "black", "none"};
        String[] salsa = new String[]{"mild", "medium", "hot", "none","all"};
        String[] veggies = new String[]{"lettuce", "fajita veggies", "none", "all"};
        String[] cheese = new String[]{"yes", "no"};
        String[] guac = new String[]{"yes", "no"};
        String[] queso = new String[]{"yes", "no"};
        String[] sourcream = new String[]{"yes", "no"};
        Random r = new Random();
        System.out.println(riceM());
//        int randrice = r.nextInt(rice.length);
        int randmeat = r.nextInt(meat.length);
        int randbeans = r.nextInt(beans.length);
        int randsalsa = r.nextInt(salsa.length);
        int randveggies = r.nextInt(veggies.length);
        int randcheese = r.nextInt(cheese.length);
        int randguac = r.nextInt(guac.length);
        int randqueso = r.nextInt(queso.length);
        int randsourcream = r.nextInt(sourcream.length);

//        for (int i=1; i<26; i++){
//            String riceChoice = rice[randrice];
//            String meatChoice = meat[randmeat];
//            String beansChoice = beans[randbeans];
//            String salsaChoice = salsa[randsalsa];
//            String veggiesChoice = veggies[randveggies];
//            String cheeseChoice = cheese[randcheese];
//            String guacChoice = guac[randguac];
//            String quesoChoice = queso[randqueso];
//            String sourcreamChoice = sourcream[randsourcream];
////            System.out.println("Burrito " + i+": " +riceChoice+", "+meatChoice+", "+beansChoice+", "+salsaChoice+", "+veggiesChoice+", "+cheeseChoice+", "+guacChoice+", "+quesoChoice+", "+sourcreamChoice+".");
//        }
////        System.out.println(Arrays.toString(rice));

    }

    public static String riceM(){
        String[] rice = new String[]{"white", "brown", "none", "all"};
        Random r = new Random();
        int randRice = r.nextInt(rice.length);
        if (rice[randRice].equals("none")){
            rice[randRice]="no";
        }String riceChoice=rice[randRice]+" rice";
        return riceChoice;
    }

}
