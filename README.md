# XTextView
XTextView  extends TextView ,you can set DrawableLeft or DrawableRight ClickListener 
（You can also set top or bottom,is very easy）

项目里刚好用到，就随手写了一个，算是对TextView的增强吧,可以为DrawableLeft和DrawableRight设置点击事件，同样你也可以设置DrawableTop和DrawableBottom的点击事件，恩 由于偷懒···想实现的自己写一下，仿照哪两个，很容易。用法也很简单··

#Usage

```
public class MainActivity extends Activity {
    private XTextView text ;

    @Override
    protected void onCreate(Bundle saveInstance) {
        super.onCreate() ;
        setContentView(R.layout.main) ;
        
        text.setDrawableRightListener(new DrawableRightListener() {            
            @Override
            public void onDrawableRightClick(View view) {
                // todo
            }
        }) ;
    }
}
```

# CentralCheckedTextView
CentralCheckedTextView可以继承自任何有setdrawableLeft setdrawableRight...的View。
它是为了解决setdrawableLeft drawable不能居中而定制的。
eg:
```xml
<com.share.MomLove.widets.CentralCheckedTextView
                        android:id="@+id/video_text_share"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:layout_weight="1"
                        android:drawableLeft="@drawable/video_share"
                        android:drawablePadding="5dp"
                        android:gravity="center_vertical"
                        android:paddingLeft="8dp"
                        android:paddingRight="8dp"
                        android:textColor="@color/color_696969"
                        tools:text="34" />
```



MyBlog: [https://www.apkdv.com](https://www.apkdv.com)
