import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // String ArrayList Mannschaft A
        // String ArrayList Mannschaft B
        Player Hugo = new Player("Hugo", "Meier", "A");
        Player Susi = new Player("Susi", "Sorglos", "A");
        Player Fred = new Player("Fred", "Feuerstein", "A");
        Player Marie = new Player("Marie", "Müller", "A");

        Player Fritz = new Player("Fritz", "Como", "B");
        Player Walter = new Player("Walter", "Reindl", "B");
        Player Sigrid = new Player("Sigrid", "Volk", "B");
        Player Annemarie = new Player("Annemarie", "Bienemann", "B");

        Player.printMannschaft("A");
        Player.printMannschaft("B");

        ArrayList<Player> mannschaftA = Player.getMannschaft("A");
        ArrayList<Player> mannschaftB = Player.getMannschaft("B");

        // Spieler aus der Mannschaft zum Spiel nominieren: arg - String ArrayList Mannschaft, return - String Spieler;


        // Verlierer aus der Mannschaft löschen: arg - String Spieler, return - String ArrayList Mannschaft

        // Match Simulation: arg - Spieler A, Spieler B, return - Sieger
        // Zähler. Schleife bis 6, dann return Sieger
        // Zufallszahlengenerator: Liste mit 2 Zahlen (0, 1) >> shuffle
        // Summe erhöhen

        // Spiel Simulation: arg - Spieler A, Spieler B, return - Verlierer
        // Zähler. Schleife bis 3, dann return Verlierer
        // "Match Simulation" aufrufen
    }
}