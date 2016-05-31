
The app that allows you to peform CPR on the GO on emergency situations
The App doesn't include a lot of graphics because it is designed to be an instructional tool for those who need it on the go.
Below are instructions on how to install it on your android device
~~~~~~~~~~~~~~~~~~~~
This directory contains the full implementation of a basic application for
the Android platform, demonstrating the basic facilities that applications
will use.  You can run the application either directly from the "test"
list in the app launcher (it is named iCPR) or by selecting it from
the top list in the Sample Code app.

The files contained here:


# AndroidManifest.xml
~~~~~~~~~~~~~~~~~~~~

This XML file describes to the Android platform what your application can do.
It is a required file, and is the mechanism you use to show your application
to the user (in the app launcher's list), handle data types, etc.


# src/*
~~~~~~~~~~~~~~~~~~~~

Under this directory is the Java source for for your application.


#src/main/java/com/jayjay/icpr/MainActivity.java
~~~~~~~~~~~~~~~~~~~~

This is the implementation of the "activity" feature described in
AndroidManifest.xml.  The path each class implementation is
{src/PACKAGE/CLASS.java}, where PACKAGE comes from the name in the <package>
tag and CLASS comes from the class in the <activity> tag.


# res/*
~~~~~~~~~~~~~~~~~~~~

Under this directory are the resources for your application.


# res/layout/activity_main.xml
~~~~~~~~~~~~~~~~~~~~

The res/layout/ directory contains XML files describing user interface
view hierarchies.  The activity_main.xml file here is used by
MainActivity.java to construct its UI.  The base name of each file
(all text before a '.' character) is taken as the resource name;
it must be lower-case.


# res/drawable/icor_icon
~~~~~~~~~~~~~~~~~~~~

The res/drawable/ directory contains images and other things that can be
drawn to the screen.  These can be bitmaps (in .png or .jpeg format) or
special XML files describing more complex drawings.  The icpr_icon.png file
here is used as the image to display in one of the views in
icpr_activity.xml.  Like layout files, the base name is used for the
resulting resource name.


res/values/colors.xml
res/values/strings.xml
res/values/styles.xml

These XML files describe additional resources included in the application.
They all use the same syntax; all of these resources could be defined in one
file, but we generally split them apart as shown here to keep things organized.


# How to Run the App (getting the apk)
~~~~~~~~~~~~~~~~~~~~
Under iCPR/app/build/outputs/apk/app-debug.apk

Once you have this file the android system will automatically launch an apk install wizard
NOTE: Make sure you allow apps to be downloaded from external sources on your device before trying the above





