package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView
import com.example.navigationdrawer.databinding.ActivityMainBinding
import com.example.navigationdrawer.fragment.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var fragmentHalamanInbox: fragment_halaman_inbox
    lateinit var fragmentHalamanDraft: fragment_halaman_draft
    lateinit var fragmentHalamanSend: fragment_halaman_send
    lateinit var fragmentHalamanSetting: fragment_halaman_setting
    lateinit var fragmentHalamanHelp: fragment_halaman_help

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.inbox -> {
                fragmentHalamanInbox = fragment_halaman_inbox()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragmentHalamanInbox)
                    .setTransition((FragmentTransaction.TRANSIT_FRAGMENT_OPEN))
                    .commit()
                Toast.makeText(applicationContext, "Ini Halaman Inbox", Toast.LENGTH_SHORT)
                    .show()

            }
            R.id.draft -> {
                fragmentHalamanDraft = fragment_halaman_draft()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragmentHalamanDraft)
                    .setTransition((FragmentTransaction.TRANSIT_FRAGMENT_OPEN))
                    .commit()
                Toast.makeText(applicationContext, "Ini Halaman Draft", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.send -> {
                fragmentHalamanSend = fragment_halaman_send()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragmentHalamanSend)
                    .setTransition((FragmentTransaction.TRANSIT_FRAGMENT_OPEN))
                    .commit()
                Toast.makeText(applicationContext, "Ini Halaman Send", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.setting -> {
                fragmentHalamanSetting = fragment_halaman_setting()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragmentHalamanSetting)
                    .setTransition((FragmentTransaction.TRANSIT_FRAGMENT_OPEN))
                    .commit()
                Toast.makeText(applicationContext, "Ini Halaman Setting", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.help -> {
                fragmentHalamanHelp = fragment_halaman_help()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragmentHalamanHelp)
                    .setTransition((FragmentTransaction.TRANSIT_FRAGMENT_OPEN))
                    .commit()
                Toast.makeText(applicationContext, "Ini Halaman Help", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        binding.drawerLayout.closeDrawers()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
