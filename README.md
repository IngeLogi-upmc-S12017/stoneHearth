# stoneHearth
groupe S.I.J.J. s1 2017

TUTO github en ligne de commande

<b>A la fac faites la commande (si le temps d'un git clone/pull/etc. est trop long): export https_proxy=proxy:3128</b>


<i>1ere fois pour récuperer le projet en entier:</i><br>
git clone https://github.com/IngeLogi-upmc-S12017/stoneHearth.git


<h1>Mettre en ligne des modifications</h1>
Ensuite pour modifier/ajouter un fichier/dossier sur le git.
4 étapes sont nécessaire:

<b>1) Recuperer la version la plus a jour (eviter les conflits)</b> <br>

git pull origin master

<br>
<b>2)Ajouter tout les fichiers qu'on a modifié</b><br>
git add *

ou pour être plus précis: git add nomDossier OU git add nomFichier

<br>
<b>3)Commit (check les erreurs de conflits avec le serveur)</b>

git commit -m "Ce que vous voulez"

<i>
( vous mettez ce que vous voulez comme chaine de caractères mais essayez d'être explicite si vous faites une grosse mise à jour)
(Par ex je modifie le UC_X je fais git commit -m "UC_X" ) </i>
<br>

<b>4)Envoyé sur le serveur</b> <br>
git push origin master
