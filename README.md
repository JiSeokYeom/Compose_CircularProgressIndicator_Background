# Compose_CircularProgressIndicator_Background

## Introduction

[![](https://jitpack.io/v/JiSeokYeom/Compose_CircularProgressIndicator_Background.svg)](https://jitpack.io/#JiSeokYeom/Compose_CircularProgressIndicator_Background)

<h3> This library specifies a circular progress indicator background color in Compose version 1.4.0-alpha04 and earlier.



## Preview

<img src = "https://github.com/JiSeokYeom/Compose_CircularProgressIndicator_Background/assets/38849158/bcd50553-3814-4ba2-a29b-541ac0e4f3f4.png" width="30%" height="30%">

## How to add to your project


Add dependencies for Jitpack in build.gradle(project)

```bash
  	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add dependencies for libraries in build.gradle(module)
```bash
  	dependencies {
	        implementation 'com.github.JiSeokYeom:Compose_CircularProgressIndicator_Background:LATEST_VERSION'
	}
```

## Property

```bash

@Composable
fun CustomCircularProgressIndicatorWithBackground(
    modifier: Modifier = Modifier.size(100.dp),
    progress: Float,
    strokeColor: Color = MaterialTheme.colors.primary,
    backgroundColor: Color = Color.Gray,
    strokeWidth: Dp = 10.dp,
)

```

The default CircularProgressIndicator size is 100dp

```bash

modifier: Modifier = Modifier.size(100.dp)

```

This is a progress representing the current progress
0.1F - 10%
0.2F - 20%
0.3F - 30%
...
...
1F - 100%
It can be expressed as above


```bash

progress: Float

```

A property that allows you to specify a strokeColor.By default, use MaterialTheme.colors.primary

```bash

strokeColor: Color = MaterialTheme.colors.primary

```

This property allows you to specify a background color, which is Gray by default

```bash

backgroundColor: Color = Color.Gray

```

Property that can specify strokeWidth, by default 10dp

```bash

strokeWidth: Dp = 10.dp

```

## Etc

If you have any errors or questions, please leave them on the issue tab Thank you!


## License

```bash

Copyright 2019 Ji Seok Yeom

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```

