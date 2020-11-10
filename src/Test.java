import java.util.Scanner;

public class Test {
    public static void main (String[] args)
    {
        System.out.println("Introduceti numar angajati ");
        Scanner myObj = new Scanner(System.in);
        int numarAngajati = myObj.nextInt();
        System.out.println("Compania are " + numarAngajati + " angajati");

        Companie companie1 = new Companie(numarAngajati); /// cream o instanta de companie

        TeamLeader [] teamLeader = new TeamLeader[2];
        teamLeader[0] = new TeamLeader("Gheorghe",45,12,20,2,3);
        //System.out.println(teamLeader[0].toString());
        teamLeader[1] = new TeamLeader("Sergiu",40,11,15,2,5);

        Manager manager = new Manager("Andre" , 32 , 3 , 12 ,1 ,5);
        //System.out.println(manager.toString());
        Developer[] developer = new Developer[4];
        developer[0] = new Developer("Razvan" , 23 , 3 , 12 , 2 , 3 , 2);
        developer[1] = new Developer("Monica" , 25 , 5 , 13 , 1 , 4 , 1);
        developer[2] = new Developer("Dragos" , 24 , 2 , 10 , 1 , 5, 2);
        developer[3] = new Developer("Hermando" , 35 , 9 , 23 , 1 , 7 , 1);

        System.out.println(developer[0].RezolvaTask());
        System.out.println(developer[1].RezolvaTask());

        companie1.adaugaAngajat(manager); // adaugam managerul in companie

        manager.managerAdaugaAngajat(companie1,developer[0]);
        manager.managerAdaugaAngajat(companie1,developer[1]);
        manager.managerAdaugaAngajat(companie1,developer[2]);
        manager.managerAdaugaAngajat(companie1,developer[3]);

        manager.managerAdaugaAngajat(companie1,teamLeader[0]);
        manager.managerAdaugaAngajat(companie1,teamLeader[1]);

        System.out.println("Afisare Angajati in companie :");
        companie1.AfisareAngajati();
        System.out.println();

        System.out.println("Stergere angajat");
        manager.managerStergeAngajat(companie1);
        System.out.println("Afisare Angajati in companie :");
        companie1.AfisareAngajati();

        System.out.println();

        System.out.println("Salarii angajati");
        companie1.AfisareAngajatiSalariu();


        Echipa echipa1 = manager.managerCreazaEchipa("Eco Team" , teamLeader[0] , 3);
        manager.managerAdaugaInEchipa(echipa1 ,developer[0]);
        manager.managerAdaugaInEchipa(echipa1 ,developer[1]);
        manager.managerAdaugaInEchipa(echipa1 ,developer[2]);
        echipa1.afisareEchipa();


        Echipa echipa2 = manager.managerCreazaEchipa("Rescue" , teamLeader[1] , 2);
        manager.managerAdaugaInEchipa(echipa2 ,developer[1]);
        manager.managerAdaugaInEchipa(echipa2 ,developer[0]);
        echipa2.afisareEchipa();
        System.out.println();
        System.out.println("Setam un nou team leader pentru echipa1 ");
        System.out.println("Fostul team leader");
        echipa1.afisareEchipa();
        System.out.println("Actualul team leader");
        echipa1.setTeamLeader(teamLeader[1]);
        echipa1.afisareEchipa();

    }
}
