package xzr.La.systemtoolbox.modules.java;
import android.content.Context;
import android.view.View;

public interface LModule {
    abstract String classname();
    abstract View init(Context context);
    abstract String onBootApply();
    abstract void onExit();
}
