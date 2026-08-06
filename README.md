# 1. Nom du projet

**Nom du projet :** HealthCare+ -- Système de Gestion Médicale Full
Stack

------------------------------------------------------------------------

# 2. Présentation du projet

HealthCare+ est une application web Full Stack composée d'une API REST
développée avec Spring Boot et d'une interface utilisateur réalisée avec
React.js. Elle permet de gérer les patients, les médecins, les
rendez-vous et les dossiers médicaux de manière sécurisée. L'application
s'adresse aux cliniques et cabinets médicaux souhaitant centraliser
leurs données. Son objectif principal est de faciliter la gestion des
informations médicales grâce à une plateforme moderne, sécurisée et
performante.

------------------------------------------------------------------------

# 3. Problématique

Le problème identifié est que la gestion manuelle des patients,
rendez-vous et dossiers médicaux est souvent lente, dispersée et source
d'erreurs.

La solution proposée permet de centraliser ces informations dans une
application sécurisée offrant une gestion complète des utilisateurs, des
données médicales et des accès selon les rôles.

------------------------------------------------------------------------

# 4. Fonctionnalités principales

-   Créer un compte utilisateur et se connecter avec JWT
-   Gérer les patients (CRUD)
-   Gérer les médecins (CRUD)
-   Gérer les rendez-vous (CRUD)
-   Gérer les dossiers médicaux
-   Télécharger des rapports PDF

------------------------------------------------------------------------

# 5. Technologies utilisées

Technologie                   Utilisation dans le projet
  ----------------------------- ----------------------------
Java 21                       Développement du backend
Spring Boot                   API REST
Spring Security + JWT         Authentification
Spring Data JPA / Hibernate   Persistance
Flyway                        Migrations
MySQL                         Base de données
React.js                      Interface utilisateur
React Router                  Navigation
Axios                         Communication API
React Hook Form + Yup         Formulaires
Docker & Docker Compose       Conteneurisation
Redis                         Cache
GitHub Actions                CI/CD
Swagger                       Documentation
Git/GitHub                    Versionnement
Figma                         Maquettage

------------------------------------------------------------------------

# 6. Installation et lancement

## 6.1 Prérequis

-   Java 21
-   Node.js
-   Maven
-   Docker Desktop
-   Git

## 6.2 Cloner le dépôt

``` bash
git clone https://github.com/votre-compte/HealthCarePlus.git
```

## 6.3 Ouvrir le dossier

``` bash
cd HealthCarePlus
```

## 6.4 Installer les dépendances

Backend

``` bash
mvn clean install
```

Frontend

``` bash
npm install
```

## 6.5 Variables d'environnement

``` env
SPRING_DATASOURCE_URL=
SPRING_DATASOURCE_USERNAME=
SPRING_DATASOURCE_PASSWORD=
JWT_SECRET=
```

Frontend

``` env
VITE_API_URL=http://localhost:8080/api
```

## 6.6 Lancer le projet

Backend

``` bash
mvn spring-boot:run
```

Frontend

``` bash
npm run dev
```

Docker

``` bash
docker compose up --build
```

## 6.7 Ouvrir le projet

Frontend

http://localhost:3000


------------------------------------------------------------------------

# 7. Captures d'écran

## Capture 1

**Titre :** Tableau de bord

![alt text](<Tableau de bord - HealthCare+-1.png>)


## Capture 2

**Titre :** Liste des patients
![alt text](<Getion des patients-1.png>)


## Capture 3
**Titre :** Liste des rendez-vous

![alt text](<Gestion des Rendez-vous - HealthCare+.png>)

------------------------------------------------------------------------

# 8. Contribution personnelle

Projet réalisé individuellement.

J'ai conçu l'architecture complète du backend et du frontend.

J'ai développé les API REST, la sécurité JWT, la gestion des rôles, la
pagination, Redis, Docker, GitHub Actions ainsi que l'interface React.

------------------------------------------------------------------------

# 9. Difficultés rencontrées

## Difficulté 1

J'ai rencontré des difficultés lors de l'implémentation de Spring
Security avec JWT.

Après plusieurs tests et la consultation de la documentation officielle,
j'ai mis en place AuthenticationManager, UserDetailsService, JwtFilter
et SecurityFilterChain.

Cette étape m'a permis de mieux comprendre l'authentification JWT.

## Difficulté 2

La communication entre React et Spring Boot nécessitait une
configuration correcte du CORS et des intercepteurs Axios.

J'ai configuré CORS, créé des Axios Interceptors et ajouté une gestion
centralisée des erreurs HTTP.

Cette difficulté m'a permis d'améliorer mes compétences en développement
Full Stack.

------------------------------------------------------------------------

# 10. Améliorations possibles

-   Ajouter les notifications par e-mail
-   Intégrer un calendrier interactif
-   Ajouter des statistiques avec des graphiques
-   Déployer le frontend et le backend sur Kubernetes

Ces améliorations permettraient d'améliorer l'expérience utilisateur,
les performances et la scalabilité de l'application.

------------------------------------------------------------------------

# ✅ Checklist finale

-   [x] Présentation du projet
-   [x] Fonctionnalités
-   [x] Technologies
-   [x] Installation
-   [x] Captures d'écran
-   [x] Contribution
-   [x] Difficultés
-   [x] Améliorations
