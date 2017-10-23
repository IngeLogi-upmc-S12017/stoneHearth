# stoneHearth
groupe S.I.J.J. s1 2017

TUTO github en ligne de commande

A la fac faites la commande: export https_proxy=proxy:3128

1ere fois pour récuperer le projet entier:
git clone https://github.com/IngeLogi-upmc-S12017/stoneHearth.git

Ensuite pour modifier/ajouter un fichier/dossier sur le git.
4 étapes sont nécessaire:

1) Recuperer la version la plus a jour (eviter les conflits)
git pull origin master

2)Ajouter tout les fichiers qu'on a modifié
git add *
ou pour être plus précis
git add <nomDossier>   OU git add <nomFichier>

3)Commit (check les erreurs de conflits avec le serveur)

git commit -m "Ce que vous voulez"

( vous mettez ce que vous voulez comme chaine de caractères mais essayez d'être explicite si vous faites une grosse mise à jour)
(Par ex je modifie le UC_X je fais git commit -m "UC_X"
4)Envoyé sur le serveur 
git push origin master
