import java.util.Scanner;
class Main{
static void WHanoi(int n, char zWiezy, char naWieze, char srodWieza) {
    if (n==0)
        return;
    WHanoi(n-1, zWiezy, srodWieza, naWieze);
    System.out.println("Przenies dysk "+n+" z wieży "+zWiezy+" na wieże "+naWieze);
    WHanoi(n-1, srodWieza, naWieze, zWiezy);
}
public static void  main(String args[]){
  Scanner s = new Scanner(System.in);
  System.out.println("Podaj ilosc dysków: ");
    int n=s.nextInt(); 
    WHanoi(n,'A','C','B'); 
  }
}
// dla 3 dysków liczba ruchów wynosi 7
// dla 4 dysków: 15
// dla 5 dysków: 31