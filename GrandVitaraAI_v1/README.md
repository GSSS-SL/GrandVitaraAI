# Grand Vitara AI v1.0 — starter scaffold

Target hardware: Diamond 2K / TS10S / UIS7862 / Android 12 / 4 GB RAM.

## Included in this increment
- Landscape Android application shell.
- Lightweight Jetpack Compose dashboard.
- Clearly marked disconnected/demo vehicle values.
- Placeholder tiles for climate, vehicle health, 360 camera, maps/music,
  mirrors/windows, door status, and trip summary.

## Build
1. Open this folder in Android Studio.
2. Use JDK 17.
3. Allow Gradle sync and install the required Android SDK platform 35.
4. Build > Build Bundle(s) / APK(s) > Build APK(s).

The project uses Android Gradle Plugin 8.7.3, Kotlin 2.0.21,
Compose BOM 2024.12.01, minSdk 31 and targetSdk 32 as a pinned starter baseline.
Check current Android Studio/Gradle compatibility before upgrading dependencies.

## Important integration boundaries
- No OBD-II or CANBUS connection is implemented yet.
- No AC, mirror, window or door-lock command is sent.
- The 360-degree camera is not replaced or controlled; a shortcut can only be
  added after identifying its installed package/activity or documented launch API.
- Dashboard values are intentionally placeholders, not real vehicle readings.
- Do not connect to vehicle CAN wiring or send guessed CAN frames.

## Next required vehicle-side evidence
Photograph the CANBUS settings page and, if accessible, the decoder box label.
For OBD-II, identify the diagnostic port and use a read-only compatible adapter
after checking vehicle/adapter support.
