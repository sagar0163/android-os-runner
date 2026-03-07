package com.osrunner.mobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var terminalOutput: TextView
    private val linuxDistros = listOf(
        Distro("Ubuntu", "ubuntu22.tar.gz", 250),
        Distro("Debian", "debian12.tar.gz", 180),
        Distro("Kali Linux", "kali2024.tar.gz", 300),
        Distro("Arch Linux", "archlinux.tar.gz", 150)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        terminalOutput = findViewById(R.id.terminalOutput)
        val installBtn: Button = findViewById(R.id.btnInstall)
        val launchBtn: Button = findViewById(R.id.btnLaunch)

        installBtn.setOnClickListener {
            showDistroSelector()
        }

        launchBtn.setOnClickListener {
            launchLinux()
        }

        updateTerminal("Android OS Runner Ready\n")
        updateTerminal("Supported: Linux (PRoot), Windows (QEMU - Coming Soon)\n")
    }

    private fun showDistroSelector() {
        val distroNames = linuxDistros.map { it.name }.toTypedArray()
        android.app.AlertDialog.Builder(this)
            .setTitle("Select Linux Distribution")
            .setItems(distroNames) { _, which ->
                installDistro(linuxDistros[which])
            }
            .show()
    }

    private fun installDistro(distro: Distro) {
        updateTerminal("\n📥 Installing ${distro.name}...\n")
        updateTerminal("Download size: ~${distro.sizeMB}MB\n")
        
        // Simulated install (actual implementation would use PRoot/termux-auth)
        Thread {
            runOnUiThread {
                updateTerminal("✅ ${distro.name} installed successfully!\n")
                Toast.makeText(this, "${distro.name} ready!", Toast.LENGTH_SHORT).show()
            }
        }.start()
    }

    private fun launchLinux() {
        updateTerminal("\n🚀 Launching Linux environment...\n")
        // Would launch PRoot environment here
        updateTerminal("✅ Linux shell started!\n")
        updateTerminal("root@localhost:~# ")
    }

    private fun updateTerminal(text: String) {
        terminalOutput.append(text)
    }

    data class Distro(val name: String, val file: String, val sizeMB: Int)
}
