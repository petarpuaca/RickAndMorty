# 👽 Rick and Morty Android App

An Android application for browsing Rick and Morty characters, viewing character details, and working with locally cached data through a modern Kotlin-based architecture.

This project was built as a native Android app using Jetpack Compose, with a layered structure based on repository and use-case patterns.

---

## ✨ Features

- Character list screen
- Character detail screen
- Navigation between list and detail views
- Remote data fetching from an API
- Local caching with Room
- Load-more and refresh-oriented data flow
- Splash screen on app startup
- Notification support
- Release build optimization with minification and resource shrinking

---

## 🧠 My Contribution

I developed the Android application end to end, including:

- building the UI with Jetpack Compose
- implementing list and detail navigation flows
- integrating remote API calls with Retrofit
- adding local persistence with Room
- structuring the project with repository and use-case layers
- setting up splash screen behavior and notification handling
- preparing the app for release with minify and resource shrinking enabled

The project was focused on clean Android architecture, maintainable state handling, and a smoother user experience.

---

## 🛠 Tech Stack

- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Architecture:** MVVM + Repository + Use Cases
- **Navigation:** Navigation Compose
- **Networking:** Retrofit + Gson
- **Local Storage:** Room
- **Images:** Coil
- **Splash Screen:** AndroidX Core SplashScreen
- **Build / Tooling:** Gradle Kotlin DSL, KSP
- **Testing:** JUnit, Turbine, kotlinx-coroutines-test

---

## 📂 Project Structure

- **app/** – main Android application module
- **data/** – remote, local, and repository implementations
- **domain/** – models and use cases
- **ui/** – screens, navigation, and presentation logic
- **gradle/** – dependency and version configuration

---

## ▶️ How to Run

1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle dependencies
4. Run the app on an emulator or Android device
5. Build the release variant if you want to test the optimized version

---

## 📝 Notes

- The app uses Jetpack Compose as the UI toolkit.
- Remote and local data layers are combined through Retrofit and Room.
- The project includes release-oriented configuration such as code minification and resource shrinking.
- The application is structured to support scalable Android development with separated responsibilities across UI, domain, and data layers.
