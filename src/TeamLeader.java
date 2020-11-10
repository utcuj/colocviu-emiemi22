public class TeamLeader  extends Angajat{

    public TeamLeader(String nume , int varsta , int nrAniExperienta , int tarifPerOra, int nivel , int nrOreLucrate  )
    {
        super( nume , varsta ,  nrAniExperienta , tarifPerOra, nivel , nrOreLucrate);

    }

    public int Salariu()
    {
        if (this.nivel == 1)
            return 200 + this.SalariuAngajat();
        else return 300 + this.SalariuAngajat();
    }

}
