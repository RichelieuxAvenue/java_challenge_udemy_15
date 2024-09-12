public class Main {
    /*
    Défi de la somme des multiples de 3 et 5

	•	Créez une boucle for utilisant une plage de nombres de 1 à 1000 inclus.
	•	Additionnez tous les nombres qui peuvent être divisés à la fois par 3 et par 5.
	•	Affichez les nombres qui répondent aux conditions ci-dessus.
	•	Quittez la boucle une fois que vous avez trouvé 5 nombres qui respectent les conditions ci-dessus.
	•	Après être sorti de la boucle, affichez la somme des nombres qui respectent les conditions ci-dessus.
	•	Remarque : tapez tout le code dans la méthode main.
     */
    int debut;
    int fin;
    int compteur;
    public static int divisiblePar(int nombre, int diviseur1, int diviseur2){
        return nombre % diviseur1 ==0 && nombre % diviseur2 ==0 ? nombre : 0;
    }
    public static int sommeDiviseur( int debut, int fin, int diviseur1, int diviseur2){
        int somme = 0;
        for(int i = debut; i <= fin; i++){
            int divisible = divisiblePar(i, diviseur1, diviseur2);
            somme+=divisible;
        }
        return somme;
    }
    public static void main(String[] args) {
        System.out.println(sommeDiviseur(1, 30, 5, 10));
    }
}
