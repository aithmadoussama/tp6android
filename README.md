# PizzaRecipes – Application Android

## Description

PizzaRecipes est une application Android développée en Java qui permet d’afficher une liste de pizzas avec leurs détails.  
L’application utilise une architecture structurée en plusieurs couches (UI, Service, DAO, Model).

---

## Objectifs

- Comprendre l’architecture en couches (MVC simplifié)
- Manipuler les activités Android
- Utiliser RecyclerView avec Adapter
- Gérer la navigation entre écrans
- Structurer un projet Android proprement

---

## Architecture du projet

```
com.example.pizzarecipes
│
├── adapter
│   └── PizzaAdapter.java
│
├── classes
│   └── Produit.java
│
├── dao
│   └── IDao.java
│
├── service
│   └── ProduitService.java
│
└── ui
    ├── ListPizzaActivity.java
    ├── PizzaDetailActivity.java
    └── SplashActivity.java
```

---

## Structure des ressources

```
res/
│
├── layout/
│   ├── activity_list_pizza.xml
│   ├── activity_pizza_detail.xml
│   ├── activity_splash.xml
│   └── row_pizza.xml
│
├── drawable/
├── mipmap/
└── values/
```

---

## Fonctionnement de l'application

1. L'application démarre avec SplashActivity  
2. Un écran de chargement s'affiche pendant quelques secondes  
3. Redirection vers ListPizzaActivity  
4. Affichage de la liste des pizzas avec RecyclerView  
5. Clic sur une pizza pour afficher PizzaDetailActivity  

---

## Concepts utilisés

### Activity
Chaque écran est représenté par une activité :
- SplashActivity : écran de démarrage
- ListPizzaActivity : liste des pizzas
- PizzaDetailActivity : détails d’une pizza

### RecyclerView
Permet d'afficher une liste dynamique et performante.

### Adapter (PizzaAdapter)
Lie les données à la RecyclerView.

### Modèle (Produit)
Classe représentant une pizza.

### DAO (IDao)
Interface pour la gestion des données.

### Service (ProduitService)
Contient la logique métier et manipule les données.

---

## Exemple de code

### SplashActivity.java

```java
Thread t = new Thread(() -> {
    try {
        Thread.sleep(5000);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

    Intent i = new Intent(SplashActivity.this, ListPizzaActivity.class);
    startActivity(i);
    finish();
});
t.start();
```

---

## Exécution du projet

### Prérequis

- Android Studio
- SDK Android
- Java

### Étapes

1. Cloner le projet :

```bash
git clone https://github.com/votre-repo/pizzarecipes.git
```

2. Ouvrir le projet avec Android Studio  

3. Lancer l'application :
- Bouton Run
- Ou Shift + F10  

---

## Résultat attendu

<img width="718" height="1599" alt="image" src="https://github.com/user-attachments/assets/918ff584-25ec-42dd-967d-74d3f7d86ec3" />
<img width="718" height="1599" alt="image" src="https://github.com/user-attachments/assets/029ce7da-25dc-46fc-89f1-8c40bdb4257a" />
<img width="718" height="1599" alt="image" src="https://github.com/user-attachments/assets/913e8bf7-3273-4c6c-a437-5d17cdc9cb5d" />


---



## Auteur

- Nom : AIt Hmad Oussama
---

