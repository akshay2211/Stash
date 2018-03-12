![](app/src/main/res/mipmap-xxxhdpi/ic_launcher.png)
# Stash
This Library allows you to store custom objects and arrrayLists in SharedPreference just like you store string and int.

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
        compile 'com.fxn769:stash:1.0'
```
or Maven:
```xml
        <dependency>
          <groupId>com.fxn769</groupId>
          <artifactId>stash</artifactId>
          <version>1.0</version>
          <type>pom</type>
        </dependency>
```
or ivy:
```xml
        <dependency org='com.fxn769' name='stash' rev='1.0'>
          <artifact name='oblique' ext='pom' ></artifact>
        </dependency>
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].



## License
Licensed under the Apache License, Version 2.0, [click here for the full license](/LICENSE.txt).

## Author & support
This project was created by [Akshay Sharma](https://akshay2211.github.io/).

> If you appreciate my work, consider buying me a cup of :coffee: to keep me recharged :metal: by [PayPal](https://www.paypal.me/akshay2211)

> I love using my work and I'm available for contract work. Freelancing helps to maintain and keep [my open source projects](https://github.com/akshay2211/) up to date!

[![forthebadge](http://forthebadge.com/images/badges/built-for-android.svg)](http://forthebadge.com)


 [snap]: https://oss.sonatype.org/content/repositories/snapshots/
