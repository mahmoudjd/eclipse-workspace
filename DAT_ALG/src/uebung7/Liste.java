package uebung7;



public class Liste  {

    private ListElement kopf;
    private ListElement aktuell;
    private ListElement vorgaenger;


    boolean istLeer() {
        if ( kopf == null )
            return true;
        else
            return false;
       
    }


    void durchlaufe() {

        // Die lokale Variable elem verweist auf das gerade betrachtete Listenelement.
        ListElement elem = kopf;   //wichtig
        
        while (elem != null)
        {
            System.out.print (elem.getValue() + " ");

            elem = elem.getNext();
        }
            System.out.println();
    }


    // Anzahl der Listenelemente ermitteln
    int zaehleElemente()
    {
        int count = 0;
        ListElement neu = kopf;
        while (neu != null)
        {
            count++;
            neu = neu.getNext();
        }
        return count;
    }

    boolean finde(int x)
    {
        //vorgaenger = null;
        aktuell = kopf;
        while (aktuell != null)
        {
            if (x == aktuell.getValue())
                return true;
            
               // vorgaenger = aktuell;
            aktuell = aktuell.getNext();
            
        }
        
        return false;
    
    }

    // letztes und vorletztes Listenelement ermitteln
    void findeEnde()
    {  // Prof_Lösung

    	vorgaenger = null;
        aktuell = kopf;

        // Liste leer?
        if (aktuell == null)
           return;
        // nein, Ende suchen:
        while (aktuell.getNext() != null)
        {
           vorgaenger = aktuell;
           aktuell = aktuell.getNext();
        }
    	/* meine Lösung
        aktuell = kopf;
        while(aktuell != null )
        {
            if ( aktuell.getNext()== null){
                System.out.println (aktuell.getValue());
                
            }

            vorgaenger=aktuell;
            aktuell= aktuell.getNext();
        }*/
    }



    int getAktuelleDaten() {

        // aktuelles Element muss vorhanden sein
        if (aktuell == null) {
            throw new NullPointerException("kein aktuelles Element");
           
        }
        return aktuell.getValue();
    }


    // liefern das Attribut daten des ersten bzw. letzten Listenelements
    int getKopfDaten() {

        //ListElement neuElem = kopf;

        if (kopf == null){
            throw new NullPointerException("es gibt keine KopfDaten");
        }
        else {
            return kopf.getValue();
        }

    }

    int getEndeDaten() {

//        aktuell =kopf;
//        int value =0 ;
//
//        if (aktuell  == null ) {
//            throw new NullPointerException("es gibt keinen Wert");
//        }
//        else {
//            while (aktuell != null) {
//                if (aktuell.getNext() == null) {
//                    value = aktuell.getValue();
//                    //System.out.println("die EndDaten: "+ value);
//                }
//                vorgaenger = aktuell;
//                aktuell = aktuell.getNext();
//            }
//            return value;
//        }
      
    	findeEnde();

        return getAktuelleDaten();
    }


    void einfuegeKopf(int x) {
    	
   
    	kopf = new ListElement(x, kopf);

//        if (kopf == null){
//            ListElement neu = new ListElement(x,null);
//            kopf = neu;
//        }
//        else {
//            ListElement neu = new ListElement(x);
//            aktuell = kopf;
//            kopf = neu;
//            kopf.setNext(aktuell);
//        }
    }

    void einfuegeHinter(int x) {

            // Vorhandenes Element muss angegeben sein
        if (aktuell == null)
            throw new NullPointerException();

            // Einfuegen hinter Element aktuell

        ListElement neu = new ListElement(x, aktuell.getNext());
        aktuell.setNext(neu);
    }

    void einfuegeVor(int x) {
    	
    	  if (aktuell == null)
    	         throw new NullPointerException();

    	      ListElement neu = new ListElement(x, aktuell);
    	      if (vorgaenger == null)
    	         kopf = neu;
    	      else
    	         vorgaenger.setNext(neu);

//        if (vorgaenger == null )
//            throw new NullPointerException();
//
//        ListElement neu = new ListElement(x,vorgaenger.getNext());
//        vorgaenger.setNext(neu) ;
    }

    void einfuegeEnde(int x) {
    	
    	ListElement neu =
    	         new ListElement(x);

    	      // letztes Listenelement ermitteln, d.h. aktuell und vorgaenger korrekt setzen
    	      findeEnde();

    	      // falls aktuell == null gilt, dann ist die Liste leer und wir fuegen am Listenkopf ein
    	      if (aktuell == null)
    	         kopf = neu;
    	      // andernfalls wird die Nachfolger-Referenz des bisher letzten Elements auf das neue Element gesetzt
    	      else
    	         aktuell.setNext(neu);

//        ListElement neuElem = new ListElement(x);
//        aktuell = kopf;
//
//        if (aktuell == null){
//            throw new NullPointerException();
//        }
//        else {
//            while(aktuell != null) {
//
//                if (aktuell.getNext() == null) {
//                    aktuell.setNext(neuElem);
//                    aktuell= neuElem;
//                }
//
//                aktuell = aktuell.getNext();
//            }
//        }
    }


    // Loeschen des Listenelements nach dem aktuellen Element aktuell
    void loescheNachfolger() {

    	 // Nachfolger von aktuell muss vorhanden sein
        if (aktuell.getNext() == null)
           throw new NullPointerException("kein Nachfolger vorhanden");

        aktuell.setNext(aktuell.getNext().getNext());
//        ListElement kop = kopf;
//
//        ListElement zeiger = aktuell ;
//        ListElement neu_Elem ;
//        if (kop == null  )
//            throw new NullPointerException();
//
//        else {
//
//            if(zeiger != null && zeiger.getNext()!= null )
//            {
//                vorgaenger=zeiger;
//                neu_Elem = zeiger.getNext();
//                zeiger = neu_Elem.getNext();
//                vorgaenger.setNext(zeiger);
//
//            }
//            else
//                if(aktuell != null && vorgaenger != null){
//                aktuell = vorgaenger;
//                vorgaenger.setNext(null);
//
//            }
//
//            else {
//                throw new NullPointerException();
//            }
//        }

    }


    // Loeschen des aktuellen Listenelements aktuell
    void loescheElement() {

    	 if (aktuell == null)
             throw new NullPointerException("kein aktuelles Listenelement vorhanden");

          if (vorgaenger == null)                           
             kopf = aktuell.getNext();
          else
             vorgaenger.setNext(aktuell.getNext());
//        ListElement k = kopf;
//        aktuell = k ;
//        vorgaenger =null ;
//
//        if (aktuell == null) {
//            throw new NullPointerException();
//        }
//        else {
//            ListElement neu = aktuell.getNext();
//            vorgaenger.setNext(neu);
//            aktuell = neu.getNext();
//        }

    }


    // Loeschen des ersten bzw. letzten Listenelements
    void loescheKopf(){

    	  if (kopf == null)
    	         throw new NullPointerException("Liste ist leer");

    	      kopf = kopf.getNext();
//        if (kopf != null) {
//
//            ListElement neu = kopf.getNext();
//            kopf  = neu ;
//            kopf.setNext(neu.getNext());
//        }
//        else
//            {
//            throw new NullPointerException();
//            }
    }

    void loescheEnde() {
    	
    	 findeEnde();

         loescheElement();

//        if (kopf == null) {
//            throw new NullPointerException();
//        }
//        else
//        {
//            ListElement kop = kopf;
//            aktuell = kop.getNext();
//            vorgaenger =null;
//
//            if (aktuell == null )
//            {
//                 kopf=null;
//            }
//            else{
//                vorgaenger=kopf;
//                while (aktuell != null){
//                    if (aktuell.getNext()==null)
//                    {
//                        aktuell = vorgaenger;
//                        vorgaenger.setNext(null);
//                    }
//
//                    ListElement elem = aktuell ;
//                    vorgaenger=elem;
//                    aktuell=elem.getNext();
//
//                }
//
//            }
//
//        }

    }

}
