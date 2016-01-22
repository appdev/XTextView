public class CentralCheckedTextView extends CheckedTextView {

    public CentralCheckedTextView(Context context) {
        super(context);
    }

    public CentralCheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CentralCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable[] drawables = getCompoundDrawables();
        if (drawables != null) {
            Drawable drawableLeft = drawables[0];
            if (drawableLeft != null) {
                float textWidth = getPaint().measureText(getText().toString());
                int drawablePadding = getCompoundDrawablePadding();
                int drawableWidth = 0;
                drawableWidth = drawableLeft.getIntrinsicWidth();
                float bodyWidth = textWidth + drawableWidth + drawablePadding;
                canvas.translate((getWidth() - bodyWidth) / 2, 0); //将画布的原点移动到``` 10-4/2 = 3-7
            }
        }
        super.onDraw(canvas);
    }
}
