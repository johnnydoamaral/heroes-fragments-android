package com.johnny.heroesfragments.dao;

import com.johnny.heroesfragments.R;
import com.johnny.heroesfragments.model.Hero;

public class HeroDAO {

    private static HeroDAO instance;
    private Hero[] heroes;

    {
        heroes = new Hero[]{
                new Hero("Spider-man", "Peter", "Parker", R.drawable.spider_man),
                new Hero("Deadpool", "Wade", "Wilson", R.drawable.deadpool),
                new Hero("Hulk", "Bruce", "Banner", R.drawable.hulk),
                new Hero("Iron Man", "Tony", "Stark", R.drawable.iron_man),
                new Hero("Captain America", "Steve", "Rogers", R.drawable.captain_america)
        };
    }

    private HeroDAO() {
    }

    public static Hero[] getHeroes() {
        synchronized (HeroDAO.class) {
            if (instance == null)
                instance = new HeroDAO();
        }
        return instance.heroes;
    }
}
