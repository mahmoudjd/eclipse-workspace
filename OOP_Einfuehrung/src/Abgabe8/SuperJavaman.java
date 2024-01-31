package Abgabe8;

public class SuperJavaman extends Superman{
     SuperJavaman (String realName , int knowledge ,Mission personalMission , double personalTime) {
        super( realName , knowledge , personalMission , personalTime);
    }
    SuperJavaman () {
         this("",0,new Mission (0.0,0),0.0 );

    }
}
