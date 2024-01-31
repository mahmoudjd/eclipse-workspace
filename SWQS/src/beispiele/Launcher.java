package beispiele;

public class Launcher
{

    public static void main(String[] args)
    {
        try
        {
            for (int i = 0; i <= 9; i++)
            {
                Workshop workshop = new Workshop();
                // workshop - the object whose run methode is invoked
                // when this thread is started. If null, this classes
                // run method does nothing
                Thread thread = new Thread(workshop);
                // we want to access every thread during debugging
                // thus we hold a handle to every created workshop thread

                /*
                 * Threads ermöglicht es einem Programm, effizienter zu
                 * arbeiten, indem mehrere Dinge gleichzeitig ausgeführt werden.
                 * Wenn die Klasse die RunnableSchnittstelle implementiert ,
                 * kann der Thread ausgeführt werden, indem eine Instanz der
                 * Klasse an Threadden Konstruktor eines Objekts übergeben und
                 * anschließend die start()Methode des Threads aufgerufen wird
                 */
                workshop.thread = thread; // c)
                thread.setName("Workshop-" + i);
                thread.start();
                // thread.join();
                System.out.println("Thread: Workshop-" + i + " startet.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
