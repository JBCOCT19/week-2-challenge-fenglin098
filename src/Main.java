import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<String> burrito = new ArrayList<>();
                burrito.add(riceM());
                burrito.add(meatM());
                burrito.add(beansM());
                burrito.add(salsaM());
                burrito.add(veggiesM());
                burrito.add(cheeseM());
                burrito.add(guacM());
                burrito.add(quesoM());
                burrito.add(sourcreamM());
        System.out.println(burrito);
        int ingredientsNum = rd.nextInt();
//        ArrayList<String> burrito = new ArrayList<>();
//        int count =0;
//        for (int j=0; j<25; j++){
//            do {
//                String burritoNum ="burrito"+j
//                ArrayList<String> burritoNum= new ArrayList<>();
//                burrito.add(riceM());
//                burrito.add(meatM());
//                burrito.add(beansM());
//                burrito.add(salsaM());
//                burrito.add(veggiesM());
//                burrito.add(cheeseM());
//                burrito.add(guacM());
//                burrito.add(quesoM());
//                burrito.add(sourcreamM());
//
//            }while (count<25);
//        }
//        for (String x:burrito){
//            if (x.contains("no")){
//                count++;
//            }
//        }
//      for (int i=0; i<25; i++){
//            System.out.println("Burrito "+i+" "+riceM() + ", " + meatM() + ", " + beansM() + ", " + salsaM() + ", " + veggiesM() + ", " + cheeseM() + ", " + guacM() + ", " + quesoM() + ", " + sourcreamM());
//
//        }
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

    public static String meatM(){
        String[] meat = new String[]{"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "none", "all"};
        Random r = new Random();
        int randMeat = r.nextInt(meat.length);
        if (meat[randMeat].equals("none")){
            meat[randMeat]="no meat";
        }String meatChoice=meat[randMeat];
        return meatChoice;
    }

    public static String beansM(){
        String[] beans = new String[]{"pinto", "black", "none"};
        Random r = new Random();
        int randBeans = r.nextInt(beans.length);
        if (beans[randBeans].equals("none")){
            beans[randBeans]="no";
        }String beansChoice=beans[randBeans]+" bean";
        return beansChoice;
    }

    public static String salsaM(){
        String[] salsa = new String[]{"mild", "medium", "hot", "none","all"};
        Random r = new Random();
        int randSalsa = r.nextInt(salsa.length);
        if (salsa[randSalsa].equals("none")){
            salsa[randSalsa]="no";
        }String salsaChoice=salsa[randSalsa]+" salsa";
        return salsaChoice;
    }

    public static String veggiesM(){
        String[] veggies = new String[]{"lettuce", "fajita veggies", "none", "all"};
        Random r = new Random();
        int randVeggies = r.nextInt(veggies.length);
        if (veggies[randVeggies].equals("none")){
            veggies[randVeggies]="no";
        }String veggiesChoice=veggies[randVeggies]+" veggies";
        return veggiesChoice;

    }

    public static String cheeseM(){
        String[] cheese = new String[]{"yes", "no"};
        Random r = new Random();
        int randCheese = r.nextInt(cheese.length);
        if (cheese[randCheese].equals("yes")){
            cheese[randCheese]="";
        }String cheeseChoice=cheese[randCheese]+" cheese";
        return cheeseChoice;
    }

    public static String guacM(){
        String[] guac = new String[]{"yes", "no"};
        Random r = new Random();
        int randGuac = r.nextInt(guac.length);
        if (guac[randGuac].equals("yes")){
            guac[randGuac]="";
        }String guacChoice=guac[randGuac]+" guac";
        return guacChoice;
    }


    public static String quesoM(){
        String[] queso = new String[]{"yes", "no"};
        Random r = new Random();
        int randQueso = r.nextInt(queso.length);
        if (queso[randQueso].equals("yes")){
            queso[randQueso]="";
        }String quesoChoice=queso[randQueso]+" queso";
        return quesoChoice;

    }

    public static String sourcreamM(){
        String[] sourcream = new String[]{"yes", "no"};
        Random r = new Random();
        int randSourcream = r.nextInt(sourcream.length);
        if (sourcream[randSourcream].equals("yes")){
            sourcream[randSourcream]="";
        }String sourcreamChoice=sourcream[randSourcream]+" sour cream";
        return sourcreamChoice;

    }

    public static double price(int x){
        double total = 0.5*x+3;
        return total;
    }



}
