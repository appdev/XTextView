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

MyBlog: [https://www.apkdv.com](https://www.apkdv.com)
