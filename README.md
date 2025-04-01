JOUR-01 : 
1. Qu'est-ce que Spring Initializr et comment peut-il faciliter la création d'un nouveau projet Spring ?
Spring Initializr est un outil en ligne qui permet de générer rapidement un projet Spring Boot préconfiguré. Il facilite le démarrage d'un projet en permettant de sélectionner les dépendances nécessaires et en générant automatiquement l'architecture de base du projet.

2. Pourquoi le fichier pom.xml est-il crucial dans un projet Maven ?
Le fichier pom.xml (Project Object Model) est essentiel dans un projet Maven car il gère les dépendances, la configuration du projet, et l'automatisation des tâches comme la compilation, les tests et le packaging de l'application.

3. Qu'est-ce qu'un contrôleur dans le contexte de Spring MVC ?
Un contrôleur dans Spring MVC est une classe annotée avec @RestController ou @Controller qui gère les requêtes HTTP, traite les données et renvoie une réponse. Il définit les routes et la logique métier associée.

4. Comment Spring permet-il l'injection de propriétés depuis des fichiers de configuration ?
Spring utilise l'annotation @Value("${propriete}") pour injecter des valeurs définies dans les fichiers de configuration (application.properties ou application.yml). Il permet ainsi de rendre l'application configurable sans modifier le code.

5. Pourquoi serait-il utile d'avoir différents profils dans une application Spring ?
Les profils permettent d'avoir des configurations adaptées à différents environnements (développement, test, production). Cela évite de modifier manuellement les paramètres à chaque déploiement et assure une gestion plus efficace des paramètres sensibles.

6. En quoi la dépendance DevTools est-elle bénéfique pour le développement ?
Spring Boot DevTools améliore la productivité en activant le rechargement automatique des modifications, évitant ainsi de redémarrer manuellement l'application après chaque changement de code.
