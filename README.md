# CalendarView Custom

- CalendarView(by kizitonwose) Custom (with example3)
- Viewbinding, RecyclerView, Fragment, databinding 등 선행 이해 필요
- 두가지 형식으로 구현(Fragment, Activity)
- 날짜별 event개수에 따른 dot생성 구현
- 쉬운 이해를 위해 kotlinExtension 제거
- 참조 : https://github.com/kizitonwose/CalendarView

# Requirements
- Kotlin 1.5.10
- Gradle 4.2.1
- Android min SDK 28
- Android target SDK 30
- etc

# Installation
- gradle(:project)
```
allprojects {
    repositories {
        …
        maven { url "https://jitpack.io" }
    }
}

```


- gradle(:app)
```
android {
    …
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
   	…
    coreLibraryDesugaring 'com.android.tools:desugar_jdk_libs:1.1.5'
    implementation 'com.github.kizitonwose:CalendarView:1.0.4'

}
```

