![](app/src/main/res/mipmap-xxxhdpi/ic_launcher.png)
# Store
SharedPreference to store custom objects and arrrayLists.

Usage
-----
Store needs to be initialized. You should only do this 1 time, so placing the initialization in your Application is a good idea. An example for this would be:
```groovy
       [MyApplication.java]
       public class MyApplication extends Application {
           @Override
           public void onCreate() {
               super.onCreate();
               Store.init(this);
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
       
       Store.put("TAG_DATA_OBJECT",user)
       User userNew = Store.getObject("TAG_DATA_OBJECT", User.class);
```
#### for custom arraylist
```groovy
     
       ArrayList<User> userArrayList = new ArrayList<>();
       userArrayList.add(new User("Akshay",12));
       userArrayList.add(new User("Aman",11));
       
       Store.put("TAG_DATA_ARRAYLIST",userArrayList);
       ArrayList<User> userArrayListNew = Store.getArrayList("TAG_DATA_ARRAYLIST", User.class);
```
#### for String
```groovy
       Store.put("TAG_DATA_STRING","Hello World");
       String Hi = Store.getString("TAG_DATA_STRING"); //Hi = "Hello World"
```
#### for StringSet
```groovy
       Set<String> strings = new HashSet<>();
       strings.add("one");
       strings.add("two");
       strings.add("three");
       Store.put("TAG_DATA_STRING_SET",strings);
       Set<String> stringsNew = Store.getStringSet("TAG_DATA_STRING_SET"); 
```
#### for int
```groovy
       Store.put(5,"TAG_DATA_INT");
       int i = Store.getInt("TAG_DATA_INT"); //i = 5
```
#### for long
```groovy
       Store.put("TAG_DATA_LONG",987654321);
       long i = Store.getLong("TAG_DATA_LONG"); //i = 987654321
```
#### for float
```groovy
       Store.put("TAG_DATA_INT",5.0f);
       int i = Store.getInt("TAG_DATA_FLOAT"); //i = 5.0f
```
#### for boolean
```groovy
       Store.put("TAG_DATA_BOOLEAN",true);
       boolean val = Store.getBoolean("TAG_DATA_BOOLEAN"); //val = true;
```

Download
--------

 [![Download](https://api.bintray.com/packages/fxn769/android_projects/Store/images/download.svg)](https://bintray.com/fxn769/android_projects/Store/_latestVersion)  or grab via Gradle:
```groovy
        compile 'com.fxn769:store:1.0'
```
or Maven:
```xml
        <dependency>
          <groupId>com.fxn769</groupId>
          <artifactId>store</artifactId>
          <version>1.0</version>
          <type>pom</type>
        </dependency>
```
or ivy:
```xml
        <dependency org='com.fxn769' name='store' rev='1.0'>
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
