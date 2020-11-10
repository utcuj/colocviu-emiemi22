public class Manager extends Angajat {

    public Manager(String nume , int varsta , int nrAniExperienta , int tarifPerOra, int nivel , int nrOreLucrate  )
    {
        super( nume , varsta ,  nrAniExperienta , tarifPerOra, nivel , nrOreLucrate);

    }

    public int Salariu()
    {
        if (this.nivel == 1)
            return 300 + this.SalariuAngajat();
        else return 400 + this.SalariuAngajat();
    }

    public void managerAdaugaAngajat(Companie companie , Angajat angajat)
    {
        companie.adaugaAngajat(angajat);
    }

    public void managerStergeAngajat(Companie companie )
    {
        companie.StergeAngajat();
    }

    public Echipa managerCreazaEchipa(String nume , TeamLeader teamLeader , int nrdeveloperi)
    {
        Echipa echipa1 = new Echipa(nume, teamLeader , nrdeveloperi);
        return  echipa1 ;
    }

    public void managerAdaugaInEchipa(Echipa echipa , Developer developer)
    {
        echipa.adaugaInEchipa(developer);
    }
}
