package com.johnny.heroesfragments;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.johnny.heroesfragments.dao.HeroDAO;

public class HeroListFragment extends ListFragment {

    static interface HeroListListener {
        void itemClicked(long id);
    }

    private HeroListListener listener;

    public HeroListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] names = new String[HeroDAO.getHeroes().length];
        for (int i = 0; i < HeroDAO.getHeroes().length; i++)
            names[i] = HeroDAO.getHeroes()[i].getName();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = (HeroListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null)
            listener.itemClicked(id);
    }
}
