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

JOUR-02 :

1. Comment le modèle MVC aide-t-il à structurer une application web ?
   Le modèle MVC (Modèle-Vue-Contrôleur) sépare une application en trois couches : le modèle gère les données et la
   logique métier, la vue affiche ces données à l'utilisateur, et le contrôleur traite les requêtes et met à jour le
   modèle et la vue. Cela facilite la maintenance et la scalabilité de l'application.

2. Quelle est la différence entre Thymeleaf et les templates HTML classiques ?
   Thymeleaf est un moteur de templates qui permet d'afficher dynamiquement des données dans les vues, en intégrant
   directement les variables du backend Spring Boot. Contrairement aux templates HTML classiques, il ne nécessite pas de
   JavaScript ou d'autres technologies côté client pour insérer du contenu dynamique.

3. Comment pouvez-vous passer des données d'un contrôleur à une vue dans Spring ?
   Spring Boot utilise l'objet Model pour transmettre des données du contrôleur à la vue. En ajoutant des attributs à
   cet objet dans le contrôleur, ils deviennent accessibles dans le template Thymeleaf correspondant.

4. Comment Spring facilite-t-il la gestion des formulaires ?
   Spring Boot prend en charge la gestion des formulaires grâce à l'annotation @ModelAttribute pour lier automatiquement
   les données du formulaire à un objet Java, @RequestParam pour récupérer des valeurs individuelles et @PostMapping
   pour gérer les soumissions. Il permet aussi de valider les entrées utilisateur facilement.

5. Comment Spring permet-il la validation des données du formulaire ?
   Spring intègre la validation des formulaires avec les annotations de Java Bean Validation (@NotNull, @Min, @Size,
   etc.), associées à @Valid et BindingResult pour capturer et afficher les erreurs directement dans la vue Thymeleaf.