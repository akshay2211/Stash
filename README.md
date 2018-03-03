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

Store anything like
```groovy
       //for int values
       Store.put(5,"TAG_DATA_INT");
       int i = Store.getInt("TAG_DATA_INT"); //i = 5
```
Download
--------

 [ ![Download](https://api.bintray.com/packages/fxn769/android_projects/Oblique/images/download.svg) ](https://bintray.com/fxn769/android_projects/Oblique/_latestVersion)  or grab via Gradle:
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
