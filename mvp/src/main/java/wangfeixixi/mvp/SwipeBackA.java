//package wangfeixixi.mvp;
//
//import android.os.Bundle;
//import android.view.View;
//
//import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
//import com.hannesdorfmann.mosby3.mvp.MvpView;
//
//import wangfei.swipeback.SwipeBackActivityBase;
//import wangfei.swipeback.SwipeBackActivityHelper;
//import wangfei.swipeback.SwipeBackLayout;
//import wangfei.swipeback.SwipeBackUtils;
//
//public abstract class SwipeBackA<V extends MvpView, P extends MvpPresenter<V>> extends BaseActivity<V, P> implements SwipeBackActivityBase {
//    private SwipeBackActivityHelper mHelper;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mHelper = new SwipeBackActivityHelper(this);
//        mHelper.onActivityCreate();
//    }
//
//    @Override
//    protected void onPostCreate(Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        mHelper.onPostCreate();
//    }
//
//    @Override
//    public View findViewById(int id) {
//        View v = super.findViewById(id);
//        if (v == null && mHelper != null)
//            return mHelper.findViewById(id);
//        return v;
//    }
//
//    @Override
//    public SwipeBackLayout getSwipeBackLayout() {
//        return mHelper.getSwipeBackLayout();
//    }
//
//    @Override
//    public void setSwipeBackEnable(boolean enable) {
//        getSwipeBackLayout().setEnableGesture(enable);
//    }
//
//    @Override
//    public void scrollToFinishActivity() {
//        SwipeBackUtils.convertActivityToTranslucent(this);
//        getSwipeBackLayout().scrollToFinishActivity();
//    }
//}
