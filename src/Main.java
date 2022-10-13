// 1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare,/n
//           tot in clasa Main.java, si apoi apelati-le in metoda main().
public class Main {
    public static void main(String[] args) {
        arataNumeleMeu("Catalin");
        int a = -5;
        int b = -3;
        int c = 2;
        int d = 3;
        int e = 5;
        int f = 6;
        int g = 8;
        int h = 9;
        int i = 15;
        int j = 20;
        int k = 55;
        int l = 32;
        float m = 55.55f;
        float n = 0.0254f;


        System.out.println("Rezultatul adunarii este: " + operAdunare(c, d));
        System.out.println("Rezultatul impartirii este: " + operImpartire(h, c));
        System.out.println("Rezultatul operatiune a: -5+8*6 este: " + operatiuneaA(a, g, f));
        System.out.println("Rezultatul operatiune b: (55+9)%9 este: " + operatiuneaB(k, h));
        System.out.println("Rezultatul operatiune c: 20+ -3*5/8 este: " + operatiuneaC(b, e, g, j));
        System.out.println("Rezultatul operatiune d: 5 + 15 / 3 * 2 - 8 % 3 este: " + operatiuneaD(c, d, e, g, i));


        System.out.println("Rezultatul adunarii este:" + adunare(a, b));

        int doi = scadere(a, b);
        System.out.println("Rezultatul scaderii este:" + (doi));

        int trei = inmultire(a, b);
        System.out.println("Rezultatul inmultirii este:" + (trei));

        float rezultatulImpartirii = impartire(a, b);
        System.out.println("Rezultatul impartirii este:" + (rezultatulImpartirii));


        cuvantulJava("     j    a   v     v    a       ");
        cuvantulJava("     j   a a   v   v    a a      ");
        cuvantulJava("  j  j  aaaaa   v v    aaaaa     ");
        cuvantulJava("   jj  a     a   v    a     a    ");


        int media = mediaCelorTreiNumere(i,j,k)/d;
        System.out.println("Media celor trei numere este:" + ( media ));


        imagineaJava("    +”””””+    ");
        imagineaJava("   [| o o |]   ");
        imagineaJava("    |  ^  |    ");
        imagineaJava("    | ‘-’ |    ");
        imagineaJava("    +-----+    ");


        int rest = restuImpartire(h,e);
        System.out.println("Restul impartirii celor doua numere este:" + ( rest ));

        float celsius = conversie(e,h,k,l);
        System.out.println("55 Grade Fahrenheit inseamna : " + ( celsius ) + " grade celsius ");

        double metrii = distantaInInchi(m,n);
        System.out.println("55.55 inchi inseamna " + (metrii ) + " metrii" );




    }

    public static void arataNumeleMeu(String nume) {
        System.out.println(" Salut " + "\n" + nume + "!");
    }

    public static int operAdunare(int alTreileaNumar, int alPatruleaNumar) {
        int rezultatulAdunarii = alTreileaNumar + alPatruleaNumar;
        return rezultatulAdunarii;
    }

    public static float operImpartire(float IntH, float IntC) {
        float rezultatulImpartirii = IntH / IntC;
        return rezultatulImpartirii;
    }

    public static int operatiuneaA(int IntA, int IntG, int IntF) {
        int rezultatOperatiuneA = IntA + IntG * IntF;
        return rezultatOperatiuneA;
    }

    public static int operatiuneaB(int IntK, int IntH) {
        int rezultatOperatiuneB = (IntK + IntH) % IntH;
        return rezultatOperatiuneB;
    }

    public static float operatiuneaC(float IntB, float IntE, float IntG, float IntJ) {
        float rezultatOperatiuneC = IntJ + IntB * IntE / IntG;
        return rezultatOperatiuneC;
    }

    public static int operatiuneaD(int IntC, int IntD, int IntE, int IntG, int IntI) {
        int rezultatOperatiuneD = IntE + IntI / IntD * IntC - IntG % IntD;
        return rezultatOperatiuneD;
    }
// 2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire./n
//    Fiecare metoda ar trebui sa primeasca doi parametrii de tip numar, sa execute operatia, si sa returneze rezultatul./n
//    Apoi apelati metoda in main cu valorile cu care doriti sa executati operatia.


    public static int adunare(int primul, int aldoilea) {
        int unu = primul + aldoilea;
        return unu;
    }

    public static int scadere(int primul, int aldoilea) {
        int doi = primul - aldoilea;
        return doi;
    }

    public static int inmultire(int primul, int aldoilea) {
        int trei = primul * aldoilea;
        return trei;
    }

    public static float impartire(float primul, float aldoilea) {
        float rezultatulImpartirii = primul / aldoilea;
        return rezultatulImpartirii;
    }

// 3. Scrieti o metoda java, care sa afiseze urmatorul model:

    public static void cuvantulJava(String cuvant) {
        System.out.println(cuvant);

    }
// 4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

    public static int mediaCelorTreiNumere(int intI, int intJ, int intK){
        int media = (intI + intJ + intK);
        return media;

    }
// 5.Scrieti o metoda java, care sa afiseze urmatorul model:

    public static void imagineaJava(String imagine) {
        System.out.println(imagine);

    }
// 6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere

    public static int restuImpartire(int intH, int intE) {
        int rest = (intH % intE);
        return rest;

    }
// 7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, /n
//     care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius./n
//     Formula de calcul este: C = 5/9 * (F -32)

    public static float conversie(float intE, float intH, float intK, float intL) {
        float celsius = intE / intH * (intK - intL);
        return celsius;
    }
//  8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, /n
//    care sa reprezinte distanta in inch, si sa returneze distanta in metrii

    public static float distantaInInchi(float doubleM, float doubleN){
        float metrii = doubleM * doubleN;
        return metrii;
    }
// 9. Scrieti o metoda java, care primeste distanta (in metrii) si /n
//    timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, /n
//    in metrii pe secunda, kilometrii pe ora si mile pe ora. /n
//        (Indiciu: 1 mila = 1609 metrii)





}









