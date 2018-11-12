# DATA SCHEMAS OF PROCURYX

## ENTITIES
1. funders (banques)
2. projects (projets)
3. organizers (organisateurs)
4. activity_types (types d'activités : *FOURNITURES*, *TRAVAUX*, *CONSULTANTS*)
5. activities (activités)
6. lot (lotissement)
7. procurement_types (types de passation)
8. review_types (types de revue : *À PRIORI*, *À POSTERIORI*)
9. loans (prêt ou crédits)
10. currencies (devises)
11. borrowers (pays emprunteur)
12. borrower_types (type d'organisateur)
13. qualification_types (types de qualification)
14. tenderfile (demandes de soumissionnaires)
16. procurementcouncil (commission de passation de marchés)
17. assessments (évaluation des offres, des rapports, propositions techniques, propositions financières, ...)
18. nonobjection (non-objection)
19. contracts (contrats)
20. contract_steps (étapes du marché)
21. scope (termes de référence)
22. proposal_types (types de propositions : *PROPOSITION TECHNIQUE*, *PROPOSITION FINANCIÈRE*, *AUTORISATIONS-NÉGOCIATIONS*)
23. report_types (types de rapport : *RAPPORT D'ÉVALUATION*, ...)
24. actors (acteurs du système : *SPM*, ...)
25. notification_types (types de notification : *DÉCISION D'ATTRIBUTION DU MARCHÉ*, ...)
26. media (fichiers media à utiliser)
27. categories (catégories d'activités : *ACHAT DE CARBURANT*, *ACHAT DE VÉHICULES*, ...)
28. tenderfile_types (type de demande : *DAO*, *DEMANDE DE PROPOSITION*, *DEMANDE DE COTATION*, *AVIS DE SOLLICITATION DE MANIFESTATION D'INTÉRÊT*, ...)
29. tenderfile_steps (étapes des demandes : *PRÉPARATION PAR AGENCE EXÉCUTOIRE*, *SOUMISSION*, *NON-OBJECTION*, ...)
30. tenderfile_step_types (types d'étapes : *NON-OBJECTION*, *CLÔTURE*, *OUVERTURE*, *ÉVALUATION DES OFFRES*, ...)
31. contract_step_types (type d'étapes du marché : *NOTIFICATION DE DÉCISION D'ATTRIBUTION DU CONTRAT*, ...)
32. contract_steps (étapes d'exécution du marché : *OUVERTURE LETTRE DE CRÉDIT*, ...)
33. contract_stages (type d'étape du contrat : *EXÉCUTION*, *PRÉPARATION*)
34. organizer_types (types d'organisateurs : *PAYS*, *RÉGION*, *ENTREPRISE*, ...)
35. assessment_types (types d'évaluation : *ÉVALUATION DES OFFRES*, *ÉVALUATION TECHNIQUE*, ...)


## ENTITIES DESCRIPTION 
### funders
- funder_id
- name (nom de la banque)

### activity_types
- activity_type_id
- type (type d'activité)

### categories
- categorie_id
- description

### projects
- project_id (identifiant du projet)
- name (nom du projet)
- media_id (logo du projet)
- borrower_id (identifiant de l'organisateur)
- funder_id
- loan_id (identifiant du prêt)
- currency_id (devise)

### activities
- activity_id
- activity_type_id
- project_id
- categorie_id
- description
- bidding_id
- funder_id
- organizer_id
- loan_id (identifiant du prêt)
- currency_id (devise)
- amount (montant estimatif du projet)
- procurement_type_id (type de passation)
- qualification_type_id (type de qualification)

### organizers
- organizer_id
- organizer_type_id
- name

### organizer_types
- organizer_type_id
- label

### contract_stages
- contract_stage_id
- label

### contract_step_types
- contract_step_type_id
- label

### contract_steps
- contract_step_id
- contract_stage_id
- contract_step_type
- media_id
- description

### lot
- lot_id
- label

### procurement_types
- procurement_type_id
- label

### review_types
- review_type_id
- label

### loans
- loan_id
- funder_id
- duration (in years)

### currencies
- currency_id
- symbol
- short_name

### borrowers
- country_id
- name

### borrower_types
- borrower_type_id
- country_id
- label

### qualification_types
- qualification_type_id
- label

### tenderfile
- tenderfile_id
- tenderfile_type_id
- reference
- activity_id
- media_id

### tenderfile_types
- tenderfile_type_id
- label

### tenderfile_step_types
- tenderfile_step_type_id
- label

### tenderfile_steps
- tenderfile_step_id
- tenderfile_step_type_id
- label
- duration

### tenderfilesteps
- tenderfile_id
- tenderfile_step_id

