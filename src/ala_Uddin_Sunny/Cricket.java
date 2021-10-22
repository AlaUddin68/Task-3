package ala_Uddin_Sunny;

public class Cricket extends Sports{

    /*
    Name: Ala Uddin Sunny
    Id: 2012020168
    Section: D
    Email: alaudding033@gmail.com
    Date: 10/09/2021
     */

    String matchType;
    int over;
    Player p;
    Cricket(String s,int a,Player p1)
    {
        this.over=a;
        this.matchType=s;
        this.p=p1;
    }
    void display()
    {
        System.out.println("Match Type: "+this.matchType);
        System.out.println("Over of the match: "+this.over);
        System.out.println("Player Name: "+this.p.playerName);
        System.out.println("Jersey Number: "+this.p.jerseyNumber);
    }
}
