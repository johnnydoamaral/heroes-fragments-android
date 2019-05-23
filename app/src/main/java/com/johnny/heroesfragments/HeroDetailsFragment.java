package com.johnny.heroesfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.johnny.heroesfragments.dao.HeroDAO;
import com.johnny.heroesfragments.model.Hero;

public class HeroDetailsFragment extends Fragment {

    private long heroId;

    public HeroDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hero_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView heroName = view.findViewById(R.id.hero_name);
            TextView secretIdentity = view.findViewById(R.id.secret_identity);
            ImageView picture = view.findViewById(R.id.hero_image);
            Hero hero = HeroDAO.getHeroes()[(int) heroId];
            heroName.setText(hero.getName());
            secretIdentity.setText(hero.getRealFirstName() + " " + hero.getRealLastName());
            picture.setImageResource(hero.getImage());
        }
    }

    public void setHeroId(long heroId) {
        this.heroId = heroId;
    }
}
