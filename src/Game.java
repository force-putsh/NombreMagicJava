import java.util.Scanner;

public class Game {

    private int nombreMagic;
    private int nombreTentative;

    public int getNombreMagic() {
        return nombreMagic;
    }

    public void setNombreMagic(int nombreMagic) {
        this.nombreMagic = nombreMagic;
    }

    public int getNombreTentative() {
        return nombreTentative;
    }

    public void setNombreTentative(int nombreTentative) {
        this.nombreTentative = nombreTentative;
    }
    public void playGame(int nombre) {
        setNombreMagic(nombre);
        System.out.println("Entrez un nombre entre 0 et 100");
        Scanner sc=new Scanner(System.in);
        int nombreJoueur=sc.nextInt();

        while (nombreJoueur!=nombreMagic) {
            if (nombreJoueur>nombreMagic) {
                System.out.println("Le nombre est plus petit");
                nombreJoueur=sc.nextInt();
            } else {
                System.out.println("Le nombre est plus grand");
                nombreJoueur=sc.nextInt();
            }
        }
        if (nombreJoueur == nombreMagic) {
            System.out.println("Bravo, vous avez gagné");
        } else {
            System.out.println("Vous avez perdu");
        }
    }

    //+33 04 63 66 00 44

}
