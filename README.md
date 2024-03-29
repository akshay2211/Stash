![](app/src/main/res/mipmap-xxxhdpi/ic_launcher.png)

# Stash
This Library allows you to store custom objects and arrrayLists in SharedPreference just like you store string and int.

[![CircleCI](https://circleci.com/gh/akshay2211/Stash.svg?style=svg)](https://circleci.com/gh/akshay2211/Stash)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/4aa6e0861732462f89b1a041171ed6ed)](https://app.codacy.com/app/akshay2211/Stash?utm_source=github.com&utm_medium=referral&utm_content=akshay2211/Stash&utm_campaign=Badge_Grade_Dashboard)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Stash-green.svg?style=flat)](https://android-arsenal.com/details/1/6835)
[![](https://jitpack.io/v/akshay2211/stash.svg)](https://jitpack.io/#akshay2211/stash)
[![Download](https://api.bintray.com/packages/fxn769/android_projects/Stash/images/download.svg) ](https://bintray.com/fxn769/android_projects/Stash/_latestVersion)
[![API](https://img.shields.io/badge/API-11%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=11)

Usage
-----
Stash needs to be initialized. You should only do this 1 time, so placing the initialization in your Application is a good idea. An example for this would be:
```groovy
       [MyApplication.java]
       public class MyApplication extends Application {
           @Override
           public void onCreate() {
               super.onCreate();
               Stash.init(this);
           }
       }

```

Remember to also declare you Application class in the AndroidManifest.xml
```xml
         <manifest
             ...
             >
            <application
               ...
               android:label="@string/app_name"
               android:name=".MyApplication"
               >
               ...
             </application>
             ...
           </manifest>

```

#### for custom object
```groovy
       class User{
              public Name;
              public Age;
              }
              
       User user = new User();
       
       Stash.put("TAG_DATA_OBJECT",user)
       User userNew = Stash.getObject("TAG_DATA_OBJECT", User.class);
```
#### for custom arraylist
```groovy
     
       ArrayList<User> userArrayList = new ArrayList<>();
       userArrayList.add(new User("Akshay",12));
       userArrayList.add(new User("Aman",11));
       
       Stash.put("TAG_DATA_ARRAYLIST",userArrayList);
       ArrayList<User> userArrayListNew = Stash.getArrayList("TAG_DATA_ARRAYLIST", User.class);
```
#### for String
```groovy
       Stash.put("TAG_DATA_STRING","Hello World");
       String Hi = Stash.getString("TAG_DATA_STRING"); //Hi = "Hello World"
```
#### for StringSet
```groovy
       Set<String> strings = new HashSet<>();
       strings.add("one");
       strings.add("two");
       strings.add("three");
       Stash.put("TAG_DATA_STRING_SET",strings);
       Set<String> stringsNew = Stash.getStringSet("TAG_DATA_STRING_SET"); 
```
#### for int
```groovy
       Stash.put(5,"TAG_DATA_INT");
       int i = Stash.getInt("TAG_DATA_INT"); //i = 5
```
#### for long
```groovy
       Stash.put("TAG_DATA_LONG",987654321);
       long i = Stash.getLong("TAG_DATA_LONG"); //i = 987654321
```
#### for float
```groovy
       Stash.put("TAG_DATA_INT",5.0f);
       int i = Stash.getInt("TAG_DATA_FLOAT"); //i = 5.0f
```
#### for boolean
```groovy
       Stash.put("TAG_DATA_BOOLEAN",true);
       boolean val = Stash.getBoolean("TAG_DATA_BOOLEAN"); //val = true;
```

Download
--------

 [![Download](https://api.bintray.com/packages/fxn769/android_projects/Stash/images/download.svg)](https://bintray.com/fxn769/android_projects/Stash/_latestVersion)  or grab via Gradle:
```groovy
        implementation 'com.fxn769:stash:1.3.2'
```
or Maven:
```xml
        <dependency>
          <groupId>com.fxn769</groupId>
          <artifactId>stash</artifactId>
          <version>1.3.2</version>
          <type>pom</type>
        </dependency>
```
or ivy:
```xml
        <dependency org='com.fxn769' name='stash' rev='1.3.2'>
          <artifact name='stash' ext='pom' ></artifact>
        </dependency>
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].



## License
Licensed under the Apache License, Version 2.0, [click here for the full license](/LICENSE.txt).

## Author & support
[![Akshay2211](creator_banner.png)](https://ak1.io)



 [snap]: https://oss.sonatype.org/content/repositories/snapshots/
