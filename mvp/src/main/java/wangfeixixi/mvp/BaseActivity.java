//package wangfeixixi.mvp;
//
//import android.app.Activity;
//import android.os.Bundle;
//
//import com.hannesdorfmann.mosby3.mvp.MvpActivity;
//import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
//import com.hannesdorfmann.mosby3.mvp.MvpView;
//
//public abstract class BaseActivity<V extends MvpView, P extends MvpPresenter<V>> extends MvpActivity<V, P> {
//    protected Activity mCtx;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mCtx = this;
//        setContentView(onCreateView());
//        initView(savedInstanceState);
//    }
//
//    protected abstract int onCreateView();
//
//    protected abstract void initView(Bundle savedInstanceState);
//}
