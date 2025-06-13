package ch.hslu.oop.MEP;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects; // Für Objects.hash() in hashCode()

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dies ist ein Blueprint für grundlegende Java-Programmierkonzepte
 * und objektorientierte Programmierung.
 * Dient als Nachschlagewerk zum schnellen Kopieren und Anpassen von Code-Snippets.
 *
 * @param <T> Ein generischer Typ, falls für bestimmte Snippets benötigt.
 */
public class BlueprintTemplate<T> implements Comparable<BlueprintTemplate<T>>, Comparator<BlueprintTemplate<T>>, PropertyChangeListener {

    // --- Feldvariablen und Sichtbarkeit ---
    /**
     * Beispiel für eine Instanzvariable.
     * Sichtbarkeitsmodifikatoren:
     * - private: Nur innerhalb der deklarierenden Klasse zugänglich.
     * - package-private (kein Modifikator): Zugänglich für alle Klassen im selben Paket.
     * - protected: Zugänglich für Klassen im selben Paket und für Unterklassen (auch in anderen Paketen).
     * - public: Überall zugänglich.
     *
     * Zusätzliche Modifikatoren:
     * - final: Der Wert kann nur einmal zugewiesen werden und ist danach nicht mehr änderbar (Konstante).
     * - static: Gehört zur Klasse selbst, nicht zu einer spezifischen Instanz. Wird einmal geladen.
     */
    private int index = 0;
    private final String name; // Beispiel für eine final-Variable

    // --- Primitive Datentypen und deren Initialisierung ---
    private String text = "Standardtext";         // Zeichenkette
    private int ganzeZahl = 123;                  // Ganzzahl
    private float dezimalZahlF = 1.234f;          // Dezimalzahl (float, benötigt 'f' Suffix)
    private double dezimalZahlD = 1.234;          // Dezimalzahl (double, höhere Präzision)
    private char einzelnerBuchstabe = 'A';        // Einzelnes Zeichen
    private boolean zustand = true;               // Wahrheitswert (true/false)

    // --- Collections: ArrayList Beispiel ---
    /**
     * Eine dynamische Liste, die Objekte speichern kann.
     * Hier als Beispiel mit Object, in realen Anwendungen sollte der Typ spezifisch sein (z.B. ArrayList<String>).
     */
    public ArrayList<Object> objekteListe = new ArrayList<>();

    // --- Enumerations (Enums) ---
    /**
     * Beispiel für eine Aufzählung (Enum).
     * Enums sind spezielle Klassen, die eine feste Menge von Konstanten repräsentieren.
     */
    public enum ExampleEnum {
        PART_OF_ENUM_1("Erster Teil"),
        PART_OF_ENUM_2("Zweiter Teil"),
        PART_OF_ENUM_3("Dritter Teil");

        private final String description;

        ExampleEnum(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    // --- Konstruktoren ---
    /**
     * Standard-Konstruktor.
     * Wird aufgerufen, wenn ein Objekt ohne Argumente erstellt wird.
     */
    public BlueprintTemplate() {
        this.name = "DefaultBlueprint";
    }

    /**
     * Überladener Konstruktor.
     * Ermöglicht die Initialisierung von Instanzvariablen beim Erstellen eines Objekts.
     * @param index Der Startindex.
     * @param name Der Name des Blueprints.
     */
    public BlueprintTemplate(int index, String name) {
        this.index = index;
        this.name = name;
    }

    // --- Getter und Setter ---
    /**
     * Getter-Methode für 'index'.
     * @return Der aktuelle Wert von 'index'.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Setter-Methode für 'index'.
     * @param index Der neue Wert für 'index'.
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Getter-Methode für 'name'.
     * Für final-Variablen gibt es üblicherweise nur einen Getter.
     * @return Der Name des Blueprints.
     */
    public String getName() {
        return name;
    }

    // --- Kontrollstrukturen: if, else if, else, switch ---
    /**
     * Demonstriert den Einsatz von if-else-if-else und switch-Statements.
     * @param value Ein Integer-Wert für das Switch-Statement.
     * @return true oder false basierend auf den Bedingungen.
     */
    public boolean controlStructures(int value) {
        // Beispiel für ein Switch-Statement basierend auf einem Enum-Wert
        ExampleEnum myEnum = ExampleEnum.PART_OF_ENUM_1;
        switch (myEnum) {
            case PART_OF_ENUM_1:
                System.out.println("Enum: Erster Teil");
                break;
            case PART_OF_ENUM_2:
                System.out.println("Enum: Zweiter Teil");
                break;
            case PART_OF_ENUM_3:
                System.out.println("Enum: Dritter Teil");
                break;
            default:
                System.out.println("Enum: Unbekannter Teil");
                break;
        }

        // Beispiel für ein Switch-Statement basierend auf einem Integer-Wert
        switch (value) {
            case 1:
                System.out.println("Wert ist 1");
                break;
            case 2:
                System.out.println("Wert ist 2");
                break;
            default:
                System.out.println("Wert ist weder 1 noch 2");
                break;
        }

        // Beispiel für if-else if-else
        if (value > 10) {
            return true;
        } else if (value < 0) {
            return false;
        } else {
            return true; // Oder eine andere Logik
        }
    }

    // --- Schleifen: while, do-while, for, for-each ---
    /**
     * Demonstriert verschiedene Schleifentypen.
     */
    public void loops() {
        boolean bedingung = true;

        // while-Schleife: Iteriert, solange die Bedingung wahr ist.
        // Achtung: Kann zu Endlosschleifen führen, wenn die Bedingung nie false wird.
        int i = 0;
        while (i < 3) {
            System.out.println("While-Schleife Iteration: " + i);
            i++;
        }

        // do-while-Schleife: Führt den Block mindestens einmal aus, dann iteriert es, solange die Bedingung wahr ist.
        int j = 0;
        do {
            System.out.println("Do-While-Schleife Iteration: " + j);
            j++;
        } while (j < 3);

        // for-Schleife: Iteriert eine festgelegte Anzahl von Malen.
        for (int k = 0; k < 5; k++) {
            System.out.println("For-Schleife Iteration: " + k);
        }

        // for-each-Schleife: Iteriert über jedes Element einer Iterable (z.B. Liste, Array).
        objekteListe.add("Apfel");
        objekteListe.add("Birne");
        for (Object obj : objekteListe) {
            System.out.println("Element in Liste: " + obj);
        }
    }

    // --- Überschreiben von Standardmethoden (Object-Klasse) ---

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Referenzidentität
        if (obj == null || getClass() != obj.getClass()) return false; // Null-Check und Typ-Check
        BlueprintTemplate<?> other = (BlueprintTemplate<?>) obj; // Cast
        return index == other.index && Objects.equals(name, other.name); // Vergleich der relevanten Felder
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, name); // Erzeugt einen Hash-Code basierend auf den relevanten Feldern
    }

    @Override
    public String toString() {
        return "BlueprintTemplate{" +
               "index=" + index +
               ", name='" + name + '\'' +
               '}';
    }

    // --- Schnittstellen-Implementierung: Comparable (für natürliche Ordnung) ---
    @Override
    public int compareTo(BlueprintTemplate<T> other) {
        // Natürliche Ordnung basierend auf dem Index
        return Integer.compare(this.index, other.index); // Vereinfachtes Vergleich
    }

    // --- Schnittstellen-Implementierung: Comparator (für benutzerdefinierte Ordnung) ---
    @Override
    public int compare(BlueprintTemplate<T> o1, BlueprintTemplate<T> o2) {
        // Beispiel: Vergleich basierend auf dem Namen (lexikographisch)
        return o1.name.compareTo(o2.name);
    }

    // --- Ausnahmebehandlung (Exception Handling) ---
    /**
     * Beispiel für einen try-catch-Block zur Fehlerbehandlung.
     * Eine Exception ist ein unerwartetes Ereignis während der Programmausführung.
     */
    public void exampleExceptionHandling() {
        try {
            // Code, der eine Ausnahme auslösen könnte
            int result = 10 / 0; // Dies wird eine ArithmeticException auslösen
            System.out.println("Result: " + result); // Dieser Code wird nicht erreicht
        } catch (ArithmeticException e) {
            // Behandlung der spezifischen Ausnahme (z.B. Division durch Null)
            System.err.println("Fehler: Division durch Null! " + e.getMessage());
            // log.error("Fehler bei Division", e); // Wenn Logger verfügbar ist
        } catch (Exception e) {
            // Generische Ausnahmebehandlung für alle anderen Ausnahmen (sollte spezifischer sein, wenn möglich)
            System.err.println("Ein allgemeiner Fehler ist aufgetreten: " + e.getMessage());
        } finally {
            // Optionaler finally-Block: Wird immer ausgeführt, unabhängig davon, ob eine Ausnahme auftritt oder nicht.
            System.out.println("Finally-Block ausgeführt.");
        }
    }

    /**
     * Methode, die absichtlich eine Ausnahme wirft.
     * @param value Ein Wert, der eine IllegalArgumentException auslösen kann.
     * @throws IllegalArgumentException Wenn der Wert negativ ist.
     */
    public void throwExampleException(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Der Wert darf nicht negativ sein: " + value);
        }
        System.out.println("Wert ist gültig: " + value);
    }

    // --- Try-with-Resources (für Ressourcen, die geschlossen werden müssen) ---
    /**
     * Demonstriert den Einsatz von try-with-resources.
     * Automatische Ressourcenschliessung (z.B. Files, Streams).
     * Benötigt eine Ressource, die AutoCloseable implementiert.
     */
    public void tryWithResourcesExample() {
        // Beispielhaft: Wir verwenden einen StringReader, der AutoCloseable ist.
        // In der Praxis würde man hier z.B. einen FileReader oder InputStream verwenden.
        String textToRead = "Hello, world!";
        try (java.io.StringReader reader = new java.io.StringReader(textToRead)) {
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
            System.out.println("\nResourcedatei erfolgreich gelesen.");
        } catch (java.io.IOException e) {
            System.err.println("Fehler beim Lesen der Ressource: " + e.getMessage());
        }
    }

    // --- Event Handling (Java Beans PropertyChangeListener) ---
    /**
     * Implementierung des PropertyChangeListener-Interfaces.
     * Wird aufgerufen, wenn sich eine gebundene Eigenschaft ändert.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("PropertyChangeEvent empfangen!");
        System.out.println("Property Name: " + evt.getPropertyName());
        System.out.println("Alter Wert: " + evt.getOldValue());
        System.out.println("Neuer Wert: " + evt.getNewValue());
        // Hier können weitere Aktionen basierend auf der Änderung erfolgen
    }

    /**
     * Beispiel für eine Methode, die ein PropertyChangeEvent auslöst.
     * Dies würde normalerweise in der Setter-Methode einer Eigenschaft erfolgen,
     * wenn sich ihr Wert ändert.
     */
    public void fireExamplePropertyChangeEvent(String propertyName, Object oldValue, Object newValue) {
        // Ein PropertyChangeSupport-Objekt wird normalerweise verwendet,
        // um Listener zu verwalten und Events zu feuern.
        // Für dieses Template ist es vereinfacht.
        PropertyChangeEvent event = new PropertyChangeEvent(this, propertyName, oldValue, newValue);
        // Da diese Klasse PropertyChangeListener implementiert, können wir es direkt verwenden
        // In einer echten Implementierung würde man hier alle registrierten Listener benachrichtigen.
        propertyChange(event); // Für dieses Beispiel rufen wir es direkt auf
    }


    // --- Logging mit SLF4J und Logback (oder anderer Implementierung) ---
    private static final Logger log = LoggerFactory.getLogger(BlueprintTemplate.class);

    /**
     * Demonstriert die Verwendung des Loggers für verschiedene Log-Level.
     * Log-Level: TRACE, DEBUG, INFO, WARN, ERROR
     */
    public void exampleLogging() {
        log.trace("Dies ist eine TRACE-Nachricht."); // Sehr detaillierte Informationen
        log.debug("Dies ist eine DEBUG-Nachricht."); // Debugging-Informationen
        log.info("Dies ist eine INFO-Nachricht. Für allgemeine Informationen an den Benutzer.");
        log.warn("Dies ist eine WARN-Nachricht. Zeigt potenzielle Probleme an.");
        log.error("Dies ist eine ERROR-Nachricht. Für Fehlermeldungen, oft bei Ausnahmen.", new RuntimeException("Test-Fehler"));
    }

    // --- Stream API (Java 8+) ---
    /**
     * Demonstriert grundlegende Operationen mit der Stream API.
     * Streams sind eine leistungsstarke Möglichkeit, Sammlungen zu verarbeiten.
     */
    public void streamApiExample() {
        List<String> names = List.of("Anna", "Bernd", "Carla", "David", "Anja");

        // Filtern und Ausgeben
        System.out.println("\n--- Stream API: Filter ---");
        names.stream()
             .filter(name -> name.startsWith("A")) // Filtert Namen, die mit 'A' beginnen
             .forEach(System.out::println);        // Gibt jedes gefilterte Element aus

        // Mappen (Transformieren) und Ausgeben
        System.out.println("\n--- Stream API: Map ---");
        names.stream()
             .map(String::toUpperCase)             // Wandelt jeden Namen in Grossbuchstaben um
             .forEach(name -> System.out.println("Grossbuchstaben: " + name));

        // Zählen von Elementen
        long count = names.stream()
                          .filter(name -> name.length() > 4) // Namen mit mehr als 4 Buchstaben
                          .count();
        System.out.println("Anzahl der Namen mit mehr als 4 Buchstaben: " + count);
    }

    // --- Generische Methode ---
    /**
     * Beispiel für eine generische Methode.
     * @param <E> Der Typ des Elements.
     * @param element Das Element, das ausgegeben werden soll.
     */
    public <E> void printGenericElement(E element) {
        System.out.println("Generisches Element: " + element.getClass().getName() + " -> " + element);
    }

    // --- Lambda-Ausdrücke (funktionale Interfaces) ---
    /**
     * Demonstriert die Verwendung eines Lambda-Ausdrucks mit dem Runnable-Interface.
     * Lambdas sind Kurzschreibweisen für die Implementierung von funktionalen Interfaces.
     */
    public void lambdaExpressionExample() {
        // Traditionelle anonyme Klasse
        Runnable oldStyleRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable (alte Schreibweise)");
            }
        };
        new Thread(oldStyleRunnable).start();

        // Lambda-Ausdruck für Runnable
        Runnable lambdaRunnable = () -> System.out.println("Runnable (Lambda-Ausdruck)");
        new Thread(lambdaRunnable).start();
    }

    // --- Main-Methode (Einstiegspunkt des Programms) ---
    /**
     * Die Hauptmethode (Main-Methode) ist der Einstiegspunkt für die Ausführung von Java-Programmen.
     * Wird beim Start der JVM aufgerufen.
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        System.out.println("Programm gestartet.");

        BlueprintTemplate<String> myBlueprint = new BlueprintTemplate<>(10, "MeinErsterBlueprint");
        myBlueprint.loops();
        myBlueprint.exampleExceptionHandling();
        myBlueprint.exampleLogging();
        myBlueprint.streamApiExample();
        myBlueprint.lambdaExpressionExample();
        System.out.println(1%7);
        // Ein Event auslösen und empfangen (da diese Klasse PropertyChangeListener ist)
        myBlueprint.fireExamplePropertyChangeEvent("index", 0, 10);

        // Aufruf einer generischen Methode
        myBlueprint.printGenericElement("Hallo Generics!");
        myBlueprint.printGenericElement(123);

        try {
            myBlueprint.throwExampleException(-5);
        } catch (IllegalArgumentException e) {
            System.err.println("Fehler beim Aufruf von throwExampleException: " + e.getMessage());
        }

        myBlueprint.tryWithResourcesExample();

        System.out.println("Programm beendet.");
    }
}