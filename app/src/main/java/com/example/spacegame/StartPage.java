package com.example.spacegame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.spacegame.databinding.StartPageBinding;

public class StartPage extends Fragment
{

    private StartPageBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        binding = StartPageBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonGames.setOnClickListener(v -> NavHostFragment.findNavController(StartPage.this).navigate(R.id.action_start_page_to_games_page));
        binding.buttonSettings.setOnClickListener(v -> NavHostFragment.findNavController(StartPage.this).navigate(R.id.action_start_page_to_settings_page));
        binding.buttonAbout.setOnClickListener(v -> NavHostFragment.findNavController(StartPage.this).navigate(R.id.action_start_page_to_about_page));
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}
