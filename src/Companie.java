public class Companie {
    protected Angajat[] angajati ;
    protected int numarAngajati;
    private static int contor ;
    public Companie(int numarAngajati)
    {
        this.numarAngajati = numarAngajati;
        angajati = new Angajat[numarAngajati];
    }

    public void adaugaAngajat(Angajat angajat)
    {
        angajati[contor] = angajat;
        contor++;
    }

    public void StergeAngajat()
    {
        contor--;
        angajati[contor] = null;

    }

    public void AfisareAngajati ()
    {
        for ( Angajat a : angajati)
        {
            if (a instanceof Developer )
                System.out.println("Developer - " + a.getNume());
            else if (a instanceof Manager )
                System.out.println("Manager - " + a.getNume());
            else  if (a instanceof TeamLeader )
                System.out.println("TeamLeader - " + a.getNume());
        }
    }
    public void AfisareAngajatiSalariu ()
    {
        for ( Angajat a : angajati)
        {
            if (a instanceof Developer )
                System.out.println("Developer - " + a.getNume() + " Salariu "+ ((Developer) a).Salariu());
            else if (a instanceof Manager )
                System.out.println("Manager - " + a.getNume()+" Salariu " + ((Manager) a).Salariu());
            else  if (a instanceof TeamLeader )
                System.out.println("TeamLeader - " + a.getNume() + " Salariu " +  ((TeamLeader) a).Salariu());
        }
    }
}
