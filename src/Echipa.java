public class Echipa {
    private String numeEchipa ;
    private TeamLeader teamLeader ;
    private int nrdev =0;
    private Developer[] developeri ;

    public Echipa(String nume , TeamLeader teamLeader, int nrdevs)
    {
        this.numeEchipa = nume ;
        this.teamLeader = teamLeader ;
        developeri = new Developer[nrdevs];
    }

    public void adaugaInEchipa(Developer developer)
    {
        developeri[nrdev] = developer;
        nrdev++;
    }

    public void afisareEchipa()
    {
        System.out.println("Managerul echipei este :" + teamLeader.getNume() + " si are ca subordonat pe ");
        for (Developer i : developeri)
        {
            System.out.print(i.getNume() + " ");
        }
    }

    public void setTeamLeader(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }
}
