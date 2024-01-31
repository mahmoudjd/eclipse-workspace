package Tiere;

public interface Hoofed extends Attacking{

	void trample (Animal target);
	
	default void attack(Animal a){
		trample(a);
	}
}
