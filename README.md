# Apple UI

***Work in progress!*** This project provides a series of beautiful and high-fidelity widgets to allow you to implement the application that follows [Apple's design](https://developer.apple.com/design/) using [Jetpack Compose](https://developer.android.com/jetpack/compose).



## Platform Support

- [x] **Android**

- [x] **Desktop**
  
  > via [compose-jb](https://github.com/JetBrains/compose-jb)
  
- [ ] **iOS**
  
  > We don't currently have any plans to support it until [androidx](https://github.com/androidx/androidx/tree/androidx-main/compose) upstream provides implementations for the iOS platform.



## Similar projects

- [Material Design 2](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary) and [Material Design 3](https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary) are both out-of-the-box and [material-specification](https://material.io/) compliant frameworks, with stable support from the official Compose team.

- [Fluent UI](https://github.com/Nthily/fluentui) is a third-party implementation of Microsoft's Fluent design system.

  

## Credits

- This project follows the [Human Interface Guidelines](https://developer.apple.com/design/human-interface-guidelines/).
- This project uses most of [Apple Design's resources](https://developer.apple.com/design/resources/).
- This project is inspired by [Flutter Cupertino](https://docs.flutter.dev/development/ui/widgets/cupertino).
- The original idea came about because [Nthily](https://github.com/Nthily) created a [fluent-ui](https://github.com/Nthily/fluentui).
- The partial implementation of this project refers to the code of [Material Design](https://material.io/) provided by [Compose](https://github.com/androidx/androidx/tree/androidx-main/compose/material).
- The [SF Symbols](https://developer.apple.com/sf-symbols/) provided in this project are automatically converted via svgs provided by [framework7-icons](https://github.com/framework7io/framework7-icons), inspired by [material icon generation](https://github.com/androidx/androidx/tree/androidx-main/compose/material/material/icons#icon-generation).

  > Importantly, to use these icons, you may need to follow the terms stated by Apple, as detailed in the [License](#License) section.



## License

```
Copyright (c) 2022. RinOrz

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

To use the SF Symbols (icons) in Apple's design, you must also abide by
the terms:

   All SF Symbols shall be considered to be system-provided images as 
   defined in the Xcode and Apple SDKs license agreements and are subject 
   to the terms and conditions set forth therein:

      https://developer.apple.com/support/terms/

   You may not use SF Symbols — or glyphs that are substantially or 
   confusingly similar — in your app icons, logos, or any other 
   trademark-related use. Apple reserves the right to review and, in its 
   sole discretion, require modification or discontinuance of use of any 
   Symbol used in violation of the foregoing restrictions, and you agree 
   to promptly comply with any such request.

In addition, if you modified the project, your code file must contain the
URL of the original project: https://github.com/RinOrz/appleui
```