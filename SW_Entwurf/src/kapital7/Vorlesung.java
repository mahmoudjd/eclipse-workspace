package kapital7;
import java.util.*;

public class Vorlesung {

	private Person dozent;
	private Set<Person> teilnehmer;

	public Person getDozent() {
		return dozent;
	}

	public Set<Person> getTeilnehmer() {
		return teilnehmer;
	}

	public Set<Person> getAlle() {
		Set<Person> result = new HashSet<>();
		result.addAll(teilnehmer);
		result.add(dozent);
		return result;
	}

}
