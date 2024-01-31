package oop.collections.multi;

import java.util.Set;

/**
 * Eine MultiMap Schnittstelle zur Zuordnung 
 * von Schlüsseln zu einer Menge von
 * Werten
 *
 * @author mahmoud
 *
 * @param <K>
 *            Typ der verwalteten Schlüssel
 * @param <V>
 *            Typ der zugeordneten Werte
 */
public interface MultiMap<K, V>
{
    /**
     * Gibt die Anzahl der Schlüssel der MultiMap zurück
     *
     * @return Anzahl der Schlüssel-Menge-Zuordnungen
     */
    public int size();

    /**
     * Überprüfe, ob die MultiMap den übergebenen Wert enthält
     *
     * @param value
     *            Der zu überprüfende Wert
     * @return true falls der Wert enthalten ist
     */
    public boolean containsValue(V value);

    /**
     * Liefert eine Menge von Werten, die dem übergebenen Schlüssel zugeordnet
     * sind
     ** 
     * @param key
     *            Der angefragte Schlüssel
     * @return Eine Kopie der Menge der zugeordneten Werte;
     *
     *         null, falls keine Zuordnung besteht
     */
    public Set<V> get(K key);

    /**
     * Fügt den Wert der zum Schlüssel gehörenden Menge hinzu. Anders als bei
     * herkömmlichen Maps sollen eventuell bereits existierende Werte nicht
     * überschrieben werden. Stattdessen wird der Wert zur bestehenden Menge
     * hinzugefügt.
     *
     * @param key
     *            Der Schlüssel, dem der Wert zugeordnet
     *
     *            werden soll
     * @param value
     *            Der Wert, der der Menge an der
     *
     *            Schlüsselposition hinzugefügt werden soll
     */
    public void put(K key, V value);

    /**
     * Entfernt alle dem Schlüssel zugeordneten Werte
     *
     * @param key
     *            Der Schlüssel, dessen Werte gelöscht werden
     *
     *            sollen
     * @return Die entfernte Menge; null, wenn keine passende
     *
     *         Zuordnung gefunden wurde
     */
    public Set<V> remove(K key);

    /**
     * Das spezifische Element wird aus der Schlüsselposition entfernt. Der Rest
     * unverändert.
     *
     * @param key
     *            Der Schlüssel, aus dessen
     *
     *            gelöscht werden soll
     * @param item
     *            Das zu löschende Element
     * @return Das gelöschte Element; null,
     *
     *         entfernt wurde
     */
    public V remove(K key, V item);

    /**
     * Gibt alle Werte der MultiMap als eine Gesamtmenge zurück.
     *
     * @return Die aggregierten Werte aller den Schlüsseln
     *
     *         zugeordneten Mengen
     */
    public Set<V> values();
}