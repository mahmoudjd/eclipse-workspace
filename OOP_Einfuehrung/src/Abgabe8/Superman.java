package Abgabe8;

public class Superman implements vergesslich{
    private String realName ;
    private int knowledge ;
    private int superheroes = 0;
    private Mission personalMission ;
    private double personalTime ;

    Superman(String realName, int knowledge, Mission personalMission, double personalTime)
    {
        this.realName =realName ;
        if(1 <= knowledge && knowledge <=10 )
            this.knowledge = knowledge ;

        this.personalTime =personalTime ;
        this.personalMission =personalMission ;
        this.superheroes ++;
    }

    public void vergessen(){
            this.knowledge--;
    }
    public void kaempfen(int zeit){
        if ((double) zeit > this.personalTime)
            System.out.println("Die Zeit ist abgelaufen");
        else{
            this.personalTime -= zeit ;
        }
        personalMission.adjustMissionTime((int)(zeit/( this.personalMission.getDifficulty())/this.knowledge ));
    }

    void ueben (){
        if(this.knowledge < 10)
           this.knowledge++;

        else
            System.out.println("Der Held ist schlau !");
    }

    public String toString(){
        return "Der Name ist "+realName+"\nDer Wissenstand "+this.knowledge
                +"\nDie Anzahl der Superhelden : "+this.superheroes
                +"\nDie verfügbare Zeit : "+this.personalTime ;
    }

    public static void main(String[] args){
        Mission miss =new Mission(50,25);

        Superman batman = new Superman("John",8,miss,100);
        Superman ziro  = new Superman("mark",6,miss,75);

        System.out.println(batman.toString());

        batman.vergessen();
        batman.kaempfen(30);
        ziro.kaempfen(30);

        System.out.println(batman.toString());
        System.out.println(ziro.toString());
    }



}
