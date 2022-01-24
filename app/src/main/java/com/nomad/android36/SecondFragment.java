package com.nomad.android36;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android36.databinding.FragmentMainBinding;
import com.nomad.android36.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnClick{

    private AdapterMusic adapterMusic;
    private ArrayList<Music> music;
    public final static String key = "dfgdgfgfdvsvgfjki";
    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapterMusic = new AdapterMusic(music,this);
        binding.recycle.setAdapter(adapterMusic);
    }

    private void loadData() {
        music = new ArrayList<>();
        music.add(new Music(1,"2:33","Kochevnik","Время первых"));
        music.add(new Music(2,"3:22","Taylor Swift","Blank Space"));
        music.add(new Music(3,"5:36","Silento","Watch Me"));
        music.add(new Music(4,"3:50","The Weekend","The Hills"));
        music.add(new Music(5,"1:26","Ramil","Levi's"));
    }

    @Override
    public void onClick(Music music) {
        Bundle bundle = new Bundle();
        Fragment fragment = new Fragment3();
        bundle.putString(key, music.getNameMusic());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                fragment).addToBackStack("a").commit();
    }
}