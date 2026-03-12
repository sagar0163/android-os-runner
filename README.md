# Android OS Runner 🐧💻

Run Linux and Windows operating systems directly on your Android device!

## Features

### ✅ Currently Available
- **Linux Distribution Support** (via PRoot)
  - Ubuntu
  - Debian
  - Kali Linux
  - Arch Linux
  
- **Terminal Interface** - Full Linux shell access
- **No Root Required** - Works on stock Android
- **Lightweight** - Efficient container-based approach

### 🔄 Coming Soon
- **Windows Emulation** (via QEMU)
- **Multiple Linuxros**
- ** DistGUI Desktop Environments** (XFCE, GNOME, KDE)
- **Package Manager Integration**

## How It Works

```
┌─────────────────────────────────────┐
│         Android Device              │
│  ┌─────────────────────────────┐   │
│  │    OS Runner App (Kotlin)   │   │
│  └─────────────────────────────┘   │
│                │                   │
│                ▼                   │
│  ┌─────────────────────────────┐   │
│  │   PRoot Container Engine   │   │
│  └─────────────────────────────┘   │
│                │                   │
│                ▼                   │
│  ┌─────────────────────────────┐   │
│  │   Linux/Windows Guest OS   │   │
│  └─────────────────────────────┘   │
└─────────────────────────────────────┘
```

## Tech Stack

- **Frontend**: Kotlin + Jetpack Compose
- **Backend**: PRoot (Linux), QEMU (Windows)
- **Storage**: Local file system + compressed archives

## Installation

1. Clone the repo:
```bash
git clone https://github.com/sagar0163/android-os-runner.git
```

2. Open in Android Studio

3. Build and install on your device

## Usage

1. Tap **Install OS** to download a Linux distribution
2. Tap **Launch** to start the Linux shell
3. Use terminal commands just like a real Linux PC!

## Requirements

- Android 7.0+ (API 24)
- 500MB+ free storage
- Internet for downloading distros

## Roadmap

- [ ] Add more Linux distros
- [ ] Windows 10/11 emulation via QEMU
- [ ] Desktop environment support
- [ ] File sharing between Android and Linux
- [ ] GPU acceleration

## License

MIT License

---

⭐ Star this repo if you find it useful!
# Updated
