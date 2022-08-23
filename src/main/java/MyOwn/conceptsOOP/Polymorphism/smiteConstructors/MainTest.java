package MyOwn.conceptsOOP.Polymorphism.smiteConstructors;

import MyOwn.conceptsOOP.Polymorphism.smiteConstructors.gods.*;

public class MainTest {
    public static void main(String[] args) {
        Aphrodite aphrodite = new Aphrodite();
        Hades hades = new Hades();
        Zeus zeus = new Zeus();
        XingTyan xingTyan = new XingTyan();
        Thanos thanos = new Thanos();
        Thor thor = new Thor();
        Loki loki = new Loki();
        XingWay xingWay = new XingWay();
        Susano susano = new Susano();
        Arachne arachne = new Arachne();

        Darkness team11 = new Darkness(aphrodite, hades, zeus);
        Light team12 = new Light(thor, loki, xingWay);

        Map map = new Map(team11, team12);


        Darkness team21 = new Darkness(thor, xingTyan, arachne);
        Light team22 = new Light(loki, susano, thanos);

        Map map2 = new Map(team21, team22);
    }
}
