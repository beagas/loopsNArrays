import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("< 1 uzduotis >");
        String name = "Mekia";
        String lastname = "Cox";

        if (name.length() < lastname.length()) {
            System.out.println(name);
        } else if (name.length() > lastname.length()) {
            System.out.println(lastname);
        }

        System.out.println("< 2 uzduotis >");
//Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę
// kaip stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
// (LEONARDO dicaprio)
        System.out.print(name.toUpperCase());
        System.out.println(lastname.toLowerCase());
//        System.out.println(name.toUpperCase(),lastname.toLowerCase());

        System.out.println("< 3 uzduotis >");
//Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę
// kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą
// iš pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

//        String initials = name.substring(0,1);
//        String initials1 =lastname.substring(0,1);
//        String inic = initials + initials1;
//        System.out.println(inic);

        String inic1 = name.substring(0,1) + lastname.substring(0,1);
        System.out.println(inic1);

        System.out.println("" + name.charAt(0) + lastname.charAt(0));

        System.out.println("< 4 uzduotis >");
//Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę
// kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš
// trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        int namenum = Integer.parseInt(String.valueOf(name.length() - 3));
        int surnamenum = Integer.parseInt(String.valueOf(lastname.length() - 3));
        String trkin = name.substring(namenum) + lastname.substring(surnamenum);
        System.out.println(trkin);

                System.out.println("< 5 uzduotis >");
//  Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (
//  didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String American = "An American in Paris";
        System.out.println(American.replace("a","*").replace("A", "*"));

        System.out.println("< 6 uzduotis >");
//  Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
//  Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
//  “2001: A Space Odyssey” ir “It's a Wonderful Life”.
        String american = (American.toLowerCase());
        System.out.print(American + " paversta į: ");
        System.out.println(american.
                replaceAll("[aeiyou]",""));

        String Breakfast = "Breakfast at Tiffany's";
        String breakfast = (Breakfast.toLowerCase());
        System.out.print(Breakfast + " paversta į: ");
        System.out.println(breakfast.
                replaceAll("[aeiyou]",""));

        String Space = "2001: A Space Odyssey";
        String space = (Space.toLowerCase());
        System.out.print(Space + " paversta į: ");
        System.out.println(space.
                replaceAll("[aeiyou]",""));

        String Life = "It's a Wonderful Life";
        String life = (Life.toLowerCase());
        System.out.print(Life + " paversta į: ");
        System.out.println(life.
                replaceAll("[aeiyou]",""));


        System.out.println("< 7 uzduotis >");
//        Stringe, kurį generuoja toks kodas:
//        "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int)
//        (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.

        String episode = "Star Wars: Episode" + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1)
        + " - A New Hope";
        System.out.println(episode);
        System.out.println("episode number: " + episode.charAt(episode.length()-14));
        System.out.println("episode number: " + episode.replaceAll("[^0-9]",""));
        System.out.println("episode number: " + episode.replaceAll("[^\\d]",""));
        System.out.println("episode number: " + episode.replaceAll("[a-zA-Z: -]",""));

        System.out.println("< 8 uzduotis >");
//        Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking
//        Your Juice in the Hood” yra žodžių trumpesnių arba lygių nei 5 raidės.
//        Pakartokite kodą su stringu “Tik nereikia gąsdinti Pietų Centro, geriant
//        sultis pas save kvartale”.

        String Menance = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
        String[] splitMenance = Menance.split("\\s+");
        String M1 = splitMenance[0];
        String M2 = splitMenance[1];
        String M3 = splitMenance[2];
        String M4 = splitMenance[3];
        String M5 = splitMenance[4];
        String M6 = splitMenance[5];
        String M7 = splitMenance[6];
        String M8 = splitMenance[7];
        String M9 = splitMenance[8];
        String M10 = splitMenance[9];
        String M11 = splitMenance[10];
        String M12 = splitMenance[11];
        String M13 = splitMenance[12];
        String M14 = splitMenance[13];
        int z5 = 0;
        if (M1.length() <= 5) {
            z5++;
        }
        if (M2.length() <= 5) {
            z5++;
        }
        if (M3.length() <= 5) {
            z5++;
        }
        if (M4.length() <= 5) {
            z5++;
        }
        if (M5.length() <= 5) {
            z5++;
        }
        if (M6.length() <= 5) {
            z5++;
        }
        if (M7.length() <= 5) {
            z5++;
        }
        if (M8.length() <= 5) {
            z5++;
        }
        if (M9.length() <= 5) {
            z5++;
        }
        if (M10.length() <= 5) {
            z5++;
        }
        if (M11.length() <= 5) {
            z5++;
        }
        if (M12.length() <= 5) {
            z5++;
        }
        if (M13.length() <= 5) {
            z5++;
        }
        if (M14.length() <= 5) {
            z5++;
        }
        System.out.println("teiginyje “Don't Be a Menace to South Central While Drinking Your Juice in the Hood” yra " + z5 + " žodžiai(-ių) turinčių 5 arba mažiau raidžių");

        String tik = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
        String T1 = splitMenance[0];
        String T2 = splitMenance[1];
        String T3 = splitMenance[2];
        String T4 = splitMenance[3];
        String T5 = splitMenance[4];
        String T6 = splitMenance[5];
        String T7 = splitMenance[6];
        String T8 = splitMenance[7];
        String T9 = splitMenance[8];
        String T10 = splitMenance[9];
        int tz5 = 0;
        if (T1.length() <= 5) {
            tz5++;
        }
        if (T2.length() <= 5) {
            tz5++;
        }
        if (T3.length() <= 5) {
            tz5++;
        }
        if (T4.length() <= 5) {
            tz5++;
        }
        if (T5.length() <= 5) {
            tz5++;
        }
        if (T6.length() <= 5) {
            tz5++;
        }
        if (T7.length() <= 5) {
            tz5++;
        }
        if (T8.length() <= 5) {
            tz5++;
        }
        if (T9.length() <= 5) {
            tz5++;
        }
        if (T10.length() <= 5) {
            tz5++;
        }

        System.out.println("teiginyje “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale“ yra " + tz5 + " žodžiai(-ių) turinčių 5 arba mažiau raidžių");












    }
}