package fr.uvsq.passwd;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Bienvenue dans le module d'évaluation de mots de passe !");
    System.out.print("Saisissez un mot de passe : ");
    Scanner passwordScanner = new Scanner(System.in);
    String password = passwordScanner.next();
    Strength strength = Evaluation.evaluatePassword(password);
    if(strength == Strength.STRONG) {
      System.out.println("Félicitations ! Votre mot de passe est robuste !");
    } else {
      System.out.println("Vous devriez envisager de changer de mot de passe.");
    }
  }
}
