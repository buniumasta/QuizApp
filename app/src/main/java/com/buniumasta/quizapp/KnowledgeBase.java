package com.buniumasta.quizapp;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by barto on 21.10.2017.
 */

public class KnowledgeBase {
    ArrayList<Article> mArticles;

    public KnowledgeBase() {
        mArticles = new ArrayList<Article>();
        fillInKnowledgeBase();
    }

    public boolean addArticle(String answer, String hint1, String hint2, String hint3, int resourcePictureId) {
        return mArticles.add(new Article(answer, hint1, hint2, hint3, resourcePictureId));
    }

    Article getRandomArticle() {
        Random generator = new Random();
        int size;
        int index;
        size = mArticles.size();
        index = generator.nextInt(size - 1);
        return mArticles.get(index);
    }

    public void fillInKnowledgeBase() {
        this.addArticle(
                "Czapla",
                "można najczęściej spotkać nad płytkimi brzegami rzek i jezior",
                "ma długą szyję wygiętą w kszatł litery S",
                "potrafi nawet kilka minut stać nieruchomo w wodzie, by nagle ostrym dziobem złapać smaczną rybę lub żabę",
                    R.drawable.heron
                );
        this.addArticle(
                "Gepard",
                "jest drapieżnikiem. Ma mocne i ostre zęby oraz pazury, a także bardzo dobre węch i wzrok, żyje na lądzie",
                "jego cętkowane futro pomaga sie ukryć w gęstwinie drzew",
                "jest najszybszym zwierzęciem na świecie",
                R.drawable.cheetah
        );
        this.addArticle(
                "Koń",
                "w ciągu dnia lubi paść się na łące, noc spędza w stajni",
                "uszy pokazują jego nastrój, kiedy są sztywno postawione, zwierzę jest zdenerwowane lub przestraszone",
                "dawniej pomagał w pracy, czasem może brać udział w zawodach jeździeckich",
                R.drawable.horse
        );
        this.addArticle(
                "Niedźwiedź polarny",
                "jest więlki i biały, ma grube wodoszczelne futro i jest doskonałym pływakiem",
                "jego potężne i bardzo silne łapy zakończone są ostrymi  pazurami",
                "żywi się głownie fokami i rybami",
                R.drawable.polarbear
        );
        this.addArticle(
                "Pies",
                "jest nawierniejszym przyjacielem człowieka",
                "może być specjalnie szkolony do pomocy ludziom np pomagać niewidomym",
                "merdanie ogonem to oznaka przyjaznego nastawienia",
                R.drawable.dog
        );
        this.addArticle(
                "Rekin",
                "to postrach mórz i oceanow",
                "ma bardzo ostre zęby, silny ogon i szortstką, pokrytą małymi łuskami skórę",
                "Żyje w wodzie, ma bardzo dobry wzrok, który pomaga mu w polowaniu. Szczególnie dobrze widzi w ciemności.",
                R.drawable.shark
        );
        this.addArticle(
                "Sowa",
                "ma wielkie oczy i zakrzywiony dziób",
                "potrafi obrócić głowę prawie dookoła szyi",
                "w dzień odpoczywa, a wnocy wylatuje na polowanie, ponieważ o zmierzchu widzi lepiej",
                R.drawable.owl
        );
        this.addArticle(
                "ślimak",
                "Nosi na grzbiecie muszle, w której może sie schować, gdy zagraża mu niebezpieczeństwo",
                "Może żyć w morzu",
                "Na głowie ma czułki",
                R.drawable.snail
        );
        this.addArticle(
                "mrówka",
                "mieszka w wielkich kopcach. W takim gnieździe żyje królowa (największa), oraz mniejsze robotnice. Wejścia do kopca strzegą: żołnierze",
                "może unieść przedmioty o wiele większe od siebie",
                "jest zazwyczaj czarna lub czerwona, jest symbolem pracowitości",
                R.drawable.ant
        );
        this.addArticle(
                "Pająk",
                "ma osiem nóg, jest niezwykle ruchliwy i szybki, poluje przede wszystkim na owady",
                "najwiekszym z nich jest ptasznik",
                "przędzie okazałe pajęczyny, ktore służą nie tylko podczas łowów, ale także do robienia najbardziej wymyślnych kryjówek",
                R.drawable.spider
        );

    }
}

