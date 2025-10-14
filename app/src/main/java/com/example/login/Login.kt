<?xml version="1.0" encoding="utf-8"?>
<LinearLayout android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="20dp"
xmlns:android="http://schemas.android.com/apk/res/android">
<ImageView
android:layout_width="100dp"
android:layout_height="100dp"
android:src="@drawable/logoamikom"
android:layout_gravity="center"
android:layout_marginBottom="20dp"
android:layout_marginTop="30dp"></ImageView>

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="@string/app_name"
android:textSize="30dp"
android:layout_gravity="center"></TextView>

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Username"></TextView>

<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"></EditText>

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Password"></TextView>

<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"></EditText>

<Button
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="@string/app_login"></Button>


</LinearLayout>