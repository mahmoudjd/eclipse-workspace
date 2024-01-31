package AltKlausur.vessels;

public class Enterprise extends Vessel implements Destroyable{

    private Enterprise(int torpeds, double torpedoStringth, int warp, int integrity, String id){
        super(torpeds,torpedoStringth,warp,integrity,id);
    }

    public Enterprise makeEnterprise(int torpedos , double torpedoStrength){
        return new Enterprise(torpedos,torpedoStrength,10,100,"NCC-1701");
    }

    @Override
    public void destroy(Vessel v){
        v.setIntegrity(0);
    }
}
