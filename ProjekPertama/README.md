# ProjekPertama 📱

Aplikasi Android sederhana yang dibuat menggunakan Java dan Android SDK di Android Studio.

## 📌 Deskripsi

`ProjekPertama` adalah aplikasi Android dasar yang menampilkan antarmuka pengguna sederhana dengan komponen *TextView* dan *ImageView* dalam tata letak vertikal (*LinearLayout*).

## 🚀 Fitur Utama

- **Tampilan Salam**: Menampilkan teks sapaan "Hello, Saya Revano!".
- **Ikon Vektor Custom**: Menampilkan gambar/vektor apartemen (`outline_apartment_24`).
- **Dukungan Edge-to-Edge**: Tampilan yang menyesuaikan dengan bilah sistem (Status bar & Navigation bar) modern Android.

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman**: Java
- **UI Framework**: Android XML Layouts & Material Components
- **Min SDK**: 29 (Android 10)
- **Target SDK**: 37

## 📂 Struktur Project

```text
ProjekPertama/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/projekpertama/
│   │       │   └── MainActivity.java          # Activity Utama
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml      # Layout Tampilan Aplikasi
│   │       │   └── drawable/                  # Vektor / Gambar
│   │       └── AndroidManifest.xml            # Manifest Aplikasi
│   └── build.gradle.kts                       # Konfigurasi Gradle Aplikasi
├── build.gradle.kts                           # Konfigurasi Gradle Root
└── README.md                                  # Dokumentasi Project
```

## ⚙️ Cara Menjalankan

1. Clone repository ini atau download zip.
2. Buka project menggunakan **Android Studio**.
3. Tunggu hingga proses **Gradle Sync** selesai.
4. Hubungkan perangkat Android fisik atau jalankan Emulator Android.
5. Klik tombol **Run (Shift + F10)** di Android Studio.

---
*Dibuat oleh Revano*
