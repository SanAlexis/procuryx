# DATA SCHEMAS OF PROCURYX

## ENTITIES
funders (banques)
projects (projets)
organizers (organisateurs)
activity_types (types d'activités : FOURNITURES, TRAVAUX, CONSULTANTS)
activities (activités)
bidding (appel d'offres)
lot (lotissement)
procurement_types (types de passation)
review_types (types de revue : À PRIORI, À POSTERIORI)
loans (prêt ou crédits)
currencies (devises)
borrowers (pays emprunteur)
borrower_types (type d'organisateur)
qualification_type (types de qualification)
tenderfile (DAO)
procurementcouncil (commission de passation de marchés)
assessments (évaluation des offres, des rapports, propositions techniques, propositions financières, ...)
nonobjection (non-objection)
contracts (contrats)
contract_steps (étapes du marché)
scope (termes de référence)
proposalrequests (demandes de proposition)
expressioninterest (manifestations d'intérêt)
proposal_types (types de propositions : PROPOSITION TECHNIQUE, PROPOSITION FINANCIÈRE, AUTORISATIONS-NÉGOCIATIONS)
report_types (types de rapport : RAPPORT D'ÉVALUATION, ...)
actors (acteurs du système : SPM, ...)
notification_types (types de notification : DÉCISION D'ATTRIBUTION DU MARCHÉ, ...)
media (fichiers media à utiliser)

## ENTITIES DESCRIPTION 
### funders
- funder_id
- name (nom de la banque)

### activity_types
- activity_type_id
- type (type d'activité)

### projects
- project_id (identifiant du projet)
- name (nom du projet)
- media_id (logo du projet)
- borrower_id (identifiant de l'organisateur)
- loan_id (identifiant du prêt)
- currency_id (devise)

### activities
- activity_id
- description
- bidding_id
- funder_id
- organizer_id
- amount (montant estimatif du projet)
- procurement_type_id (type de passation)


### organizers
