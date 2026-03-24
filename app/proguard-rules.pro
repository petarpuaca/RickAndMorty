# Keep useful stack trace info
-keepattributes SourceFile,LineNumberTable

# Keep generic signatures and annotations used by Retrofit/Gson
-keepattributes Signature
-keepattributes *Annotation*

# Keep all remote API models used for JSON parsing
-keep class com.example.rickandmortyapp.data.remote.** { *; }

# Keep domain models too, if any JSON is mapped there directly
-keep class com.example.rickandmortyapp.domain.model.** { *; }