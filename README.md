# SOLID LAB 1

<h2> I Introduction </h2>

<h2>II Les règles d'une bonne architecture logicielle </h2>

<h3> DIP </h3>

<h3> OCP : The Open/Closed Principle </h3>

_Probleme_
Dans notre exemple du RessourceAllocator, cette classe contient toutes les méthodes pour libérer, réserver, rechercher des slots libres mais l'allocation et la libération sont différent espour chacunes de ces methodes selon le type des ressources (TimeResource ou SpaceResource), ce qui augmente considérablement la taille de ces méthodes et rend la modification plus difficile.

De plus, on est en train de proposer des méthodes différentes pour la même fonctionnalité ( markTimeSlotFree et markSpaceSlotFree par exemple)

<div class="puml">

![Class Diagram](./assets/diagrams-before/OCP.png)

</div>

_Solution_

Construire une interface Resource contenant les methodes génériques pour chaque ressource et implémenter ces méthodes dans chaque type de Slot (TimeSlot/SpaceSlot) et utiliser seulement l'interface 'Resource' pour le traitement de Slots différents dans RessourceAllocator,on n'a plus besoin de l'énumération ResourceType

<div class="puml">

![Class Diagram](./assets/diagrams-after/OCP.png)

</div>
<h3> LSP : The LisKov Substitution Principle </h3>

_Probleme_

Le problem dans cette implémentation est que nous recourons a utiliser des if et des else partout dans notre code ce qui fait que notre code ne serait plus maintenable.

<div class="puml">

![Class Diagram](./assets/diagrams-before/LSP.png)

</div>

_Solution_

Dans cet example, on a 2 types de ducks ( electrique and donald ) le probleme est que donald et electric ont des methodes en communs mais electric duck a queleques methodes specifiques. Pour avoir une bonne architecture, on a besoin de créer une interface pour la class duck et une autre héritant de duck ( electrique duck ) contentant les methodes spécifique a electrique ( turn on and off ).

<div class="puml">

![Class Diagram](./assets/diagrams-after/LSP.png)

</div>
<h3> ISP : Interface Segregation Principle </h3>

_Probleme_

Ici, on a beaucoup de class concrete différente héritant d'une seul interface contenant des méthodes implémenté par quelques class et d'autre qui ne fasses rien du tout. Ce ci va engendrer du code inutile.

<div class="puml">

![Class Diagram](./assets/diagrams-before/ISP.png)

</div>

_Solution_

Pour remédier a ce probléme, on fait recours a l'ISP, puisque timeOutCallback et implémenté par timedDoor et proximityCallBack est implémenté par sensingDoor, on crée 2 nouvelles intérfaces ISensor et Itimer héritant chacune l'une et l'autre.
Maintenant, TimedDoor implémente Door et Itime et Isensor implémente Isensor en plus que Door. Ainsi, notre code et plus facilement extensible et plus maintenable.

<div class="puml">

![Class Diagram](./assets/diagrams-after/ISP.png)

</div>

<h3> DIP: Dependency Inversion Principle </h3>

_Probleme_

Le probléme ici et que le EncodingModule, et un peu confus. EncodeWithFiles() et encodeBasedOnNetworkAndDatabase() sont trés différent et devrais etre implémenté différement. Par example, seul la 2éme fonction utilise MyDatabase. 

<div class="puml">

![Class Diagram](./assets/diagrams-before/DIP.png)

</div>

_Solution_

Pour remédier a ce probleme, on éclate le encoding module grace au DIP. Dans ce cas, on a une interface Encoder contenat la méthode encode. et 2 classes concrete fileEncoder and DatabaseEncoderAndNetwork. maintenant, seul DatabaseEncoder est en relation avec myDatabase.

<div class="puml">

![Class Diagram](./asse ts/diagrams-after/DIP.png)

</div>

<h3> SRP: Single Responsability Principle  </h3>

_Probleme_

Ici, la class CarManager implémente toutes les méthodes ce qui n'est pas vraiment une bonne pratique pour les class Manager. nous devrons distribué les taches selon leur intéret.

<div class="puml">

![Class Diagram](./assets/diagrams-before/SRP.png)

</div>

_Solution_

On utilisant la SRP, on a maintenant séparé carManager en 3 class principales carDb implémentant toutes méthodes en relation directe avec la base de donné, carNamesList qui gére la liste des voiture selectioné. et car Assessment implémentant des méthodes permetant d'avoir une idée sur l'état des voitures. Dans ce cas, toutes classe a une seul responsabilité.

<div class="puml">

![Class Diagram](./assets/diagrams-after/SRP.png)

</div>

<style>
.puml{
    display:flex;
    justify-content:center;
    overflow:hidden;
    
}

 </style>
