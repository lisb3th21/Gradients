# Gradients

In computer graphics, a color gradient specifies a range of position-dependent colors, usually used to fill a region. For example, many window managers allow the screen background to be specified as a gradient. The colors produced by a gradient vary continuously with the position,producing smooth color transitions.

The following activity will put into practice the use of gradients.

---

To define a gradient effect we must add a drawable in our project with the following:

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape
    android:shape = "rectangle"
    xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:startColor="#fe218b"
        android:centerColor="#fed700"
        android:endColor="#21b0fe"
        android:angle="0"
        android:type="linear"/>
</shape>
```

With this base you can implement this gradient effect in many elements. The activity contains several examples:

<img src="vertical.gif" alt="vertical" height="600">

<img src="horizontal.gif" alt="vertical" width="500" >

