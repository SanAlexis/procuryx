# GRAMMAIRE DE LA DESCRIPTION DES PROCESSUS DE PASSATION DE MARCHÉS
Les processus de passation de marchés sont issus d'une réglementation en vigueur éditée par les bailleurs de fonds pour la plupart. Ces processus peuvent changer d'année en année suivant une amplitude de taille relative. Il est donc important de pouvoir dissocier les procédures de passation de marchés du code. Cette dissociation passe par l'usage de fichiers encapsulant les procédures de passation et que l'application peut utiliser.  
Le présent document a pour objectif de présenter la grammaire et la syntaxe de représentation des processus de passation de marchés.

## POSTULATS
Cette partie décrit les postulats que respectent à la fois les procédures PM et l'architecture de l'application Procuryx.
### Procédures PM
| Postulat | Commentaire |
| -------- | ----------- |
| Une procédure PM peut changer en partie ou totalement | La règlementation évolue chaque jour et peut donner lieu à des changements drastiques selon le besoin ou les objectifs du bailleur de fonds |
| Les règles s'appliquent uniquement sur les données | La conception veut que les procédures PM interagissent avec les valeurs présentes dans la base de données et non avec l'état du système |
| Chaque procédure est unique et identifiable | Les procédures doivent être associées à des identifiants uniques |
| Une procédure ne change pas pendant son exécution | Une fois la procédure chargée par l'application, il n'est pas possible d'altérer cette procédure|

## CAHIER DES CHARGES
### Entités PM
La procédure PM utilise deux types d'entités : 
- Les propositions
- Les nœuds
**Une proposition** est une opération faite entre plusieurs éléments et qui renvoie un résultat **TRUE** ou **FALSE**. Par exemple une proposition peut consister à vérifier si une valeur particulière existe dans la base de données.
**Un nœud** est une étape de la procédure. Chaque nœud a un nœud parent et plusieurs nœuds fils. Un nœud est associé à : un écran, un déclencheur, un nœud parent, des nœuds fils, des branches (qui sont les résultats de propositions permettant d'accéder à un nœud fils).

### Opérations
La grammaire doit être capable de réaliser les opérations suivantes :
- **Comparaison**. Il doit être possible de faire la comparaison entre plusieurs éléments. Chaque élément pouvant être une valeur scalaire ou une valeur extraite de la base de données.
- **Appartenance**. Un élément peut appartenir à un ensemble d'éléments.
- **Existence**. Un élément peut exister ou pas en base de données.
- **Négation**. La grammaire implémente la négation d'une proposition.
- **Union**. La grammaire implémente l'union (OU) de plusieurs propositions.
- **Intersection**. La grammaire implémente l'intersection (ET) de plusieurs propositions.

## SYNTAXE XML DE LA PROCÉDURE
Nous allons décrire la DTD du fichier de description des procédures PM.
```xml
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

<xs:element name="note">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="to" type="xs:string"/>
      <xs:element name="from" type="xs:string"/>
      <xs:element name="heading" type="xs:string"/>
      <xs:element name="body" type="xs:string"/>
    </xs:sequence>
  </xs:complexType>
</xs:element>

</xs:schema>
```
