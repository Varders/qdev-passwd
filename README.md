# 📝 Évaluation de mots de passe

Ce projet est un programme Java simple en ligne de commande permettant d'évaluer la robustesse d'un mot de passe (longueur minimale de 8 caractères, présence de lettre minuscules, lettres majuscules, chiffres et caractères spéciaux).

## ▶️ Utilisation

1. Cloner le dépôt et se placer à l'intérieur du module `passwd` :

```bash
git clone https://github.com/felsocim/qdev-passwd.git
cd qdev-passwd/passwd
```

2. Construire le programme et lancer les tests :

```bash
mvn package
```

3. Lancer le programme :

```bash
java -cp target/passwd-1.0-SNAPSHOT.jar fr.uvsq.passwd.Main
```

4. Saisir la note d'examen à vérifier.

## 🛠️ Exemple d'utilisation

```
Bienvenue dans le module d'évaluation de mots de passe !
Saisissez un mot de passe : Hello
Vous devriez envisager de changer de mot de passe.
```
