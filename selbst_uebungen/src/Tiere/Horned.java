package Tiere;

public interface Horned extends Attacking{

	void sting(Animal target);
	default void attack (Animal a) {
		sting(a);
	}
}
