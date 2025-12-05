L'objectif de ce TD est de mettre en place les concepts de **l’héritage** et du **polymorphisme**.
**Exercice 1 **(Gestion des comptes bancaires) :
Une agence bancaire a une adresse et un numéro d'agence incrémenté automatiquement.
Un client ne peut avoir des comptes que dans une seule agence de la banque. Il a un code
incrémenté automatiquement, un nom, un prénom et une adresse. A sa création, le client doit
préciser son agence bancaire.
Un compte bancaire possède à tout moment une donnée : son solde. Ce dernier peut être positif
(compte créditeur) ou négatif (compte débiteur).
Chaque compte est caractérisé par un code et un solde. A sa création :
 Son code est incrémenté automatiquement, tandis que le solde peut être nul ou initialisé par
une somme.
 Doit être associé à son propriétaire (un client).
 Préciser l’agence bancaire auprès de laquelle le compte a été ouvert.
Utiliser son compte consiste à pouvoir y faire des dépôts et des retraits. Pour ces deux opérations,
il faut aussi consulter le solde de son compte par la méthode getSolde().
Les comptes sont de nature différente selon qu'ils soient payants ou d’épargne :
 Un compte Epargne est un compte bancaire qui possède en plus un champ "TauxIntérêt=6"
et une méthode calculIntérêt() qui permet de mettre à jour le solde en tenant compte des
intérêts.
 Un compte payant est un compte bancaire pour lequel chaque opération de retrait et de 
versement est payante et vaut 5dh.
Une première lecture de l'énoncé permettrait de modéliser ce système selon le diagramme de
classes suivant :<img width="1272" height="709" alt="image" src="https://github.com/user-attachments/assets/fe76172d-f03b-4d28-b94f-a2193e64ac9d" />
Les classes à implémenter avec leurs membres : 
<img width="1220" height="750" alt="image" src="https://github.com/user-attachments/assets/6680e71d-83ed-49db-87e7-d6891ff35b9a" />
Travail à faire :
1) Développer les différentes classes.
2) Chaque classe doit contenir au moins un constructeur d'initialisation. A la création d’un
objet donné, l’identifiant (code/numéro) doit être initialisé et incrémenté automatiquement
selon le format suivant :
 Identifiant = NomClasse:NuméroObjet
 Exemples d’identifiants des deux premières instances de type Client : Client:1 et
Client:2
 Utiliser les méthodes getClasse() et getName() pour une initialisation automatique.
3) Chaque classe doit redéfinir la méthode toString().
4) Développer une classe ApplicationBancaire, dans cette classe on demande de :
a) Créer une seule agence bancaire.
b) Créer un tableau composé de 4 clients :
 Un client ayant un compte d’épargne (solde = 1000dh).
 Un client ayant un compte payant (solde = 2500dh).
 Un client ayant 2 comptes payants (soldes 0dh et 3000dh).
 Un client avec un compte d’épargne et un compte payant (soldes 2300dh et 0dh).
c) Permettre à un client de déposer une somme quelconque dans son/ses compte(s) en
appelant la méthode deposer(...).
d) Permettre à un client de retirer une somme quelconque dans son/ses compte(s) en
appelant la méthode retirer(...).
e) Définir la méthode addClient(...) permettant d’ajouter un client crée ainsi que ses
comptes à l’agence. Utiliser cette méthode pour ajouter tous les clients crées.
f) Appliquer la méthode CalculIntérêt(...) sur tous les comptes d’épargne de
l’agence.
g) Afficher les informations suivantes :
 Liste des différents clients avec leurs différents comptes.
 Liste des comptes d’épargne de l’agence.
 Liste des comptes payants de l’agence.
 Le solde total des comptes d’un client.
 Classement des différents clients selon le solde total de chacun.
**Remarques** :
 Ajouter les éventuelles méthodes et/ou attributs nécessaires pour répondre aux questions cidessous.
 En ce qui concerne la classe association « Compte » et pour la coder correctement, penser à la
remplacer par deux autres associations, comme illustré ci-dessous : 

<img width="1055" height="230" alt="image" src="https://github.com/user-attachments/assets/2a605d8c-0cef-4335-b19a-cc11725d96ff" />
