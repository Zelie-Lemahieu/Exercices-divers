import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
////        //exercice 1
////        System.out.println(duoMultiplicateur(10, 4));
////    }
////    public static int duoMultiplicateur(int a, int b){
////        return (a + b) * 2;
//        //exercice 1.2 
////        System.out.println(moyenneur(116564, 416111.156));
////    }
////
////    public static double moyenneur(double a, double b) {
////        return (a + b) / 2;
//        //exercice 2 
//        Scanner s = new Scanner(System.in);
//        System.out.println("Entrer la première valeur");
//        double a = s.nextDouble();
//        System.out.println("Entrer la seconde valeur");
//        double b = s.nextDouble();
//        if (a < b || b < a) {
//            System.out.println("La valeur la plus basse est " + plusHaut(a, b) + " et la valeur la plus haute est " + plusBas(a, b));
//        } else {
//            System.out.println("Les deux valeurs sont égales");
//        }
//    }
//
//    public static double plusHaut(double a, double b) {
//        if (a < b) {
//            return b;
//        }
//        if (b < a) {
//            return a;
//        }
//        return 0;
//    }
//
//    public static double plusBas(double a, double b) {
//        if (a < b) {
//            return a;
//        }
//        if (b < a) {
//            return b;
//        }
//        return 0;
////    }
//}

// EXERCICE 3 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Longueur du premier côté du triangle :");
        double a = s.nextDouble();
        System.out.println("Longueur du deuxième côté du triangle :");
        double b = s.nextDouble();
        System.out.println("La longueur de l'hypothénuse est de " + hypothenuse(a,b));
    }
    public static double hypothenuse(double a, double b){
        return Math.sqrt(a*a+b*b);
    }
}