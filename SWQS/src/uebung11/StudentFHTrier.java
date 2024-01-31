package uebung11;

enum Fach
{
    Informatik, Wirtschaft, Technik, Medizin, Pharmazie
}

public class StudentFHTrier
{

    public static boolean addStudentFHTrier(String name, int geburtsJahr, Fach fach)
    {

        if (name == null || name == "")
        {
            throw new IllegalArgumentException();

        }
        if (geburtsJahr < 1921 || geburtsJahr > 2004)
        {
            throw new IllegalArgumentException();
        }

        if (fach == Fach.Informatik || fach == Fach.Technik || fach == Fach.Wirtschaft)
        {
            return true;

        }

        throw new IllegalArgumentException();
    }


}
