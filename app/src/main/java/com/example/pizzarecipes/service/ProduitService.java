package com.example.pizzarecipes.service;

import android.icu.lang.UProperty;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private static ProduitService INSTANCE ;
    private final List<Produit> data = new ArrayList<>();

    public ProduitService() {
        seed();
    }

    public static ProduitService getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ProduitService();
        }
        return INSTANCE ;
    }

    private void seed(){
        data.add(new Produit(
                "BARBECUED CHICKEN PIZZA",
                3,
                R.drawable.pizza1,
                "35 min",
                "- 2 filets de poulet sans peau\n" +
                        "- 1/4 c. à café de poivre\n" +
                        "- 1 tasse de sauce barbecue\n" +
                        "- 1 pâte à pizza réfrigérée (≈ 390 g)\n" +
                        "- 2 c. à café d’huile d’olive\n" +
                        "- 2 tasses de fromage Gouda râpé\n" +
                        "- 1 petit oignon rouge, tranché finement\n" +
                        "- 1/4 tasse de coriandre fraîche hachée",
                "Pizza rapide et savoureuse, idéale pour un repas sur le pouce ou un barbecue. La pâte réfrigérée simplifie la préparation et le poulet grillé apporte un goût fumé délicieux.",
                "ETAPE 1:\n  Assaisonner le poulet avec le poivre et le griller jusqu’à 74 °C. Couper en cubes.\n" +
                        "ETAPE 2:\n  Diviser la pâte en deux, former des rectangles, badigeonner d’huile et griller légèrement.\n" +
                        "ETAPE 3:\n  Étaler la sauce barbecue restante, ajouter le poulet, le fromage et l’oignon. Griller jusqu’à ce que le fromage soit fondu. Parsemer de coriandre."
        ));

        data.add(new Produit(
                "BRUSCHETTA PIZZA",
                5,
                R.drawable.pizza2,
                "35 min",
                "- 225 g de saucisse de porc allégée\n" +
                        "- 1 pâte à pizza pré-cuite (30 cm)\n" +
                        "- 170 g de pepperoni de dinde\n" +
                        "- 2 tasses de mozzarella râpée\n" +
                        "- 1,5 tasse de tomates coupées en dés\n" +
                        "- 1/2 tasse de basilic frais ciselé\n" +
                        "- 1 c. à soupe d’huile d’olive\n" +
                        "- 2 gousses d’ail hachées\n" +
                        "- 1/2 c. à café de thym\n" +
                        "- 1/2 c. à café de vinaigre balsamique\n" +
                        "- Sel et poivre",
                "Pizza généreuse aux saveurs italiennes, parfaite pour un repas familial. Les tomates fraîches et le basilic ajoutent de la fraîcheur et du goût.",
                "ETAPE 1:\n  Cuire la saucisse à la poêle et égoutter. Étaler sur la pâte le pepperoni, la saucisse et le fromage. Cuire au four 10–12 min.\n" +
                        "ETAPE 2:\n  Mélanger les tomates, le basilic, l’huile, l’ail, le thym, le vinaigre, sel et poivre, et ajouter sur la pizza cuite. Servir immédiatement."
        ));

        data.add(new Produit(
                "SPINACH PIZZA",
                2,
                R.drawable.pizza3,
                "25 min",
                "- 1 paquet de mélange pour pâte à pizza (≈ 185 g)\n" +
                        "- 1/2 tasse de sauce Alfredo\n" +
                        "- 2 tomates moyennes\n" +
                        "- 4 tasses d’épinards frais hachés\n" +
                        "- 2 tasses de fromage italien râpé",
                "Pizza végétarienne simple et rapide à préparer. Idéale pour un repas léger et savoureux, même pour les enfants.",
                "ETAPE 1:\n  Préparer la pâte selon les instructions et l’étaler sur un moule graissé.\n" +
                        "ETAPE 2:\n  Étaler la sauce Alfredo, ajouter les tomates tranchées, les épinards et le fromage.\n" +
                        "ETAPE 3:\n  Cuire au four à 230 °C pendant 10–15 min jusqu’à ce que la pâte soit dorée."
        ));

        data.add(new Produit(
                "DEEP-DISH SAUSAGE PIZZA",
                8,
                R.drawable.pizza4,
                "45 min",
                "- 7 g de levure active\n" +
                        "- 2/3 tasse d’eau tiède\n" +
                        "- 2 tasses de farine\n" +
                        "- 1/4 tasse d’huile végétale\n" +
                        "- 1 c. à café d’origan, basilic et marjolaine\n" +
                        "- 1/2 c. à café de sel d’ail et de sel d’oignon\n" +
                        "- 1 tasse de mozzarella\n" +
                        "- 1/2 tasse de parmesan\n" +
                        "- 225 g de saucisse\n" +
                        "- Légumes au choix",
                "Pizza à pâte épaisse généreusement garnie de fromage, saucisse et légumes. Parfaite pour un repas familial copieux.",
                "ETAPE 1:\n  Préparer la pâte en mélangeant levure, farine, huile et assaisonnements. Laisser lever 1 heure.\n" +
                        "ETAPE 2:\n  Préparer la garniture (sauté de légumes et saucisse).\n" +
                        "ETAPE 3:\n  Étaler la pâte dans un moule profond, ajouter garniture et fromages, cuire 40–45 min à 200 °C."
        ));

        data.add(new Produit(
                "HOMEMADE PIZZA",
                4,
                R.drawable.pizza5,
                "50 min",
                "- 7 g de levure active\n" +
                        "- 1 c. à café de sucre\n" +
                        "- 1 1/4 tasse d’eau tiède\n" +
                        "- 1/4 tasse d’huile de canola\n" +
                        "- 1 c. à café de sel\n" +
                        "- 3 1/2 tasses de farine\n" +
                        "- 225 g de viande hachée\n" +
                        "- 1 petit oignon, haché\n" +
                        "- 2 boîtes de sauce tomate (425 g chacune)\n" +
                        "- 1 c. à café de basilic séché\n" +
                        "- 1 poivron vert, coupé en dés\n" +
                        "- 2 tasses de mozzarella râpée",
                "Une pizza maison savoureuse avec une pâte dorée et croustillante. Les garnitures peuvent être personnalisées selon vos goûts. Parfaite pour un repas familial.",
                "ETAPE 1:\n  Dissoudre la levure et le sucre dans l’eau tiède et laisser reposer 5 min.\n" +
                        "ETAPE 2:\n  Ajouter l’huile, le sel et la farine progressivement pour former une pâte souple.\n" +
                        "ETAPE 3:\n  Pétrir la pâte 2-3 min, la placer dans un bol graissé, couvrir et laisser lever jusqu’à ce qu’elle double de volume (≈ 45 min).\n" +
                        "ETAPE 4:\n  Cuire la viande hachée avec l’oignon, ajouter la sauce tomate, le basilic et les légumes.\n" +
                        "ETAPE 5:\n  Étaler la pâte dans un moule à pizza, ajouter la garniture et le fromage.\n" +
                        "ETAPE 6:\n  Cuire au four à 200 °C pendant 25-30 min jusqu’à ce que la pâte soit dorée."
        ));

        data.add(new Produit(
                "PESTO CHICKEN PIZZA",
                3,
                R.drawable.pizza6,
                "50 min",
                "- 2 c. à café de levure active\n" +
                        "- 1 tasse d’eau tiède\n" +
                        "- 2 3/4 tasses de farine\n" +
                        "- 1 c. à soupe + 2 c. à café d’huile d’olive\n" +
                        "- 1 c. à soupe de sucre\n" +
                        "- 1 1/2 c. à café de sel\n" +
                        "- 225 g de poulet en morceaux\n" +
                        "- 1 petit oignon tranché\n" +
                        "- 1/2 poivron vert, 1/2 poivron rouge, 1/2 poivron jaune, en julienne\n" +
                        "- 1/2 tasse de champignons tranchés\n" +
                        "- 3 c. à soupe de pesto\n" +
                        "- 1 1/2 tasse de mozzarella râpée\n" +
                        "- 1/4 c. à café de poivre",
                "Pizza au pesto avec poulet et légumes frais. Simple et savoureuse, parfaite pour un repas équilibré et gourmand.",
                "ETAPE 1:\n  Dissoudre la levure dans l’eau tiède, ajouter 1 tasse de farine, huile, sucre et sel. Ajouter le reste de la farine et pétrir jusqu’à obtenir une pâte homogène.\n" +
                        "ETAPE 2:\n  Laisser lever la pâte dans un bol graissé jusqu’à ce qu’elle double de volume (≈ 1h).\n" +
                        "ETAPE 3:\n  Cuire le poulet avec l’oignon, poivrons et champignons jusqu’à ce que le poulet soit cuit.\n" +
                        "ETAPE 4:\n  Étaler la pâte, ajouter le pesto, le mélange de poulet et légumes, puis le fromage.\n" +
                        "ETAPE 5:\n  Cuire au four à 200 °C pendant 18-20 min jusqu’à ce que la pâte et le fromage soient dorés."
        ));

        data.add(new Produit(
                "LOADED MEXICAN PIZZA",
                3,
                R.drawable.pizza7,
                "30 min",
                "- 1 boîte de haricots noirs (425 g), rincés\n" +
                        "- 1 oignon rouge moyen, haché\n" +
                        "- 1 petit poivron jaune, haché\n" +
                        "- 3 c. à café de chili en poudre\n" +
                        "- 3/4 c. à café de cumin\n" +
                        "- 3 tomates moyennes, coupées en dés\n" +
                        "- 1 piment jalapeño, épépiné et haché fin\n" +
                        "- 1 gousse d’ail, hachée\n" +
                        "- 1 pâte à pizza fine pré-cuite (30 cm)\n" +
                        "- 2 tasses d’épinards frais\n" +
                        "- 2 c. à soupe de coriandre hachée\n" +
                        "- Sauce piquante au goût\n" +
                        "- 1/2 tasse de cheddar râpé\n" +
                        "- 1/2 tasse de pepper jack râpé",
                "Pizza mexicaine savoureuse et colorée, pleine de légumes et de saveurs épicées. Parfaite pour les amateurs de piquant.",
                "ETAPE 1:\n  Écraser les haricots noirs et mélanger avec oignon, poivron, chili et cumin. Mélanger les tomates, jalapeño et ail.\n" +
                        "ETAPE 2:\n  Étaler la pâte sur une plaque, ajouter le mélange de haricots, puis le mélange de tomates et épinards. Saupoudrer coriandre et fromages.\n" +
                        "ETAPE 3:\n  Cuire au four à 200 °C pendant 12-15 min jusqu’à ce que le fromage soit fondu."
        ));

        data.add(new Produit(
                "BACON CHEESEBURGER PIZZA",
                2,
                R.drawable.pizza8,
                "20 min",
                "- 225 g de viande hachée\n" +
                        "- 1 petit oignon, haché\n" +
                        "- 1 pâte à pizza pré-cuite (≈ 450 g)\n" +
                        "- 225 g de sauce pizza\n" +
                        "- 6 tranches de bacon, cuites et émiettées\n" +
                        "- 20 tranches de cornichons\n" +
                        "- 2 tasses de mozzarella râpée\n" +
                        "- 2 tasses de cheddar râpé\n" +
                        "- 1 c. à café d’assaisonnement pizza/italien",
                "Pizza combinant le goût d’un cheeseburger avec la pizza. Parfaite pour les enfants et les amateurs de burgers.",
                "ETAPE 1:\n  Cuire la viande avec l’oignon jusqu’à ce qu’elle soit dorée, égoutter.\n" +
                        "ETAPE 2:\n  Étaler la sauce pizza sur la pâte, ajouter la viande, bacon, cornichons et fromages.\n" +
                        "ETAPE 3:\n  Saupoudrer d’assaisonnement et cuire au four à 230 °C pendant 8-10 min jusqu’à ce que le fromage soit fondu."
        ));

        data.add(new Produit(
                "PIZZA MARGHERITA",
                1,
                R.drawable.pizza9,
                "30 min",
                "- 3 c. à café de levure active\n" +
                        "- 1 tasse d’eau tiède\n" +
                        "- 2 c. à soupe d’huile d’olive\n" +
                        "- 1 c. à café de sucre\n" +
                        "- 1 c. à café de sel\n" +
                        "- 3 tasses de farine\n" +
                        "- 3 tomates\n" +
                        "- 200 g de mozzarella\n" +
                        "- Feuilles de basilic frais\n" +
                        "- 1 c. à soupe d’huile d’olive pour garnir",
                "Classique pizza Margherita italienne avec sauce tomate, mozzarella et basilic. Simple, fraîche et délicieuse.",
                "ETAPE 1:\n  Dissoudre la levure dans l’eau tiède, ajouter sucre, sel et 1 tasse de farine. Mélanger le reste de la farine pour former la pâte.\n" +
                        "ETAPE 2:\n  Pétrir, laisser lever 1 h jusqu’à ce que la pâte double.\n" +
                        "ETAPE 3:\n  Étaler la pâte, ajouter les tomates, mozzarella et basilic.\n" +
                        "ETAPE 4:\n  Cuire au four à 230 °C pendant 15-20 min jusqu’à ce que la pâte soit dorée."
        ));

        data.add(new Produit(
                "PEPPERONI-SAUSAGE STUFFED PIZZA",
                5,
                R.drawable.pizza10,
                "45 min",
                "- 7 g de levure active\n" +
                        "- 1 1/4 tasse d’eau tiède\n" +
                        "- 2 c. à soupe d’huile d’olive\n" +
                        "- 1 1/2 c. à café de sel\n" +
                        "- 1 c. à café de sucre\n" +
                        "- 3 1/2 à 4 tasses de farine\n" +
                        "- 225 g de saucisse\n" +
                        "- 150 g de pepperoni\n" +
                        "- 200 g de mozzarella\n" +
                        "- 200 g de cheddar\n" +
                        "- 100 g de parmesan\n" +
                        "- 1 c. à café d’assaisonnement pizza",
                "Pizza farcie aux pepperoni et saucisse. Idéale pour les grandes familles ou les amateurs de pizzas généreuses.",
                "ETAPE 1:\n  Préparer la pâte avec levure, eau, huile, sel, sucre et farine. Pétrir jusqu’à consistance souple.\n" +
                        "ETAPE 2:\n  Laisser lever la pâte jusqu’à doublement du volume.\n" +
                        "ETAPE 3:\n  Étaler la pâte, ajouter la moitié des fromages, saucisse et pepperoni, puis recouvrir avec le reste de la pâte et fromages.\n" +
                        "ETAPE 4:\n  Cuire au four à 190-200 °C pendant 40-45 min jusqu’à ce que le dessus soit doré."
        ));
    }

    @Override
    public Produit create(Produit produit) {
        data.add(produit);
        return produit;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}
